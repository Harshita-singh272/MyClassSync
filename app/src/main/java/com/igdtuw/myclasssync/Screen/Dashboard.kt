package com.igdtuw.myclasssync.Screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igdtuw.myclasssync.R

@Preview(showSystemUi = true)
@Composable

fun Dashboard(){
    var x: Int = 2
    var  present:Int = 50;
    var  Total  :Int = 77;
    val context = LocalContext.current
    var assignment : String  = "No pending assignments"
    var thisweekannouncements : Int = 4
    var lastweekannouncements : Int =7
    var Branch : String = "CSE-1"
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.off_white))
    )
    {item {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.background))
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.dashicon),
                    contentDescription = null,
                    modifier = Modifier.size(size = 56.dp),
                    tint = colorResource(id = R.color.olive)
                )
                Text(
                    text = "DashBoard",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.nunito_bold)),
                    color = colorResource(id = R.color.dark_grey),
                    fontSize = 29.sp
                )
            }
        }
    }
        item{
        Spacer(modifier = Modifier.height(26.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.97f)
                    .height(155.dp)
                    .padding(5.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))
            ) {

                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(
                            top=10.dp,
                            start = 0.dp,
                            end= 5.dp,
                            bottom = 5.dp),
                        contentAlignment= Alignment.TopStart
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row() {
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Assignment",
                                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                fontSize = 25.sp,
                                color = colorResource(id = R.color.dark_grey),
                            )
                            Spacer(modifier = Modifier.width(130.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.assignment),
                                contentDescription = null,
                                modifier = Modifier.size(size = 40.dp)
                                    .align(Alignment.Top),
                                tint = colorResource(id = R.color.olive)
                            )
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Text (
                            text="$assignment",
                            fontSize = 17.sp,
                            color = colorResource(id = R.color.grey),
                            fontFamily = FontFamily(Font(R.font.nunito_light)),
                            fontWeight = FontWeight.Bold
                            )

                    }
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.fillMaxWidth(0.97f)
                    .heightIn(min = 205.dp)
                    .padding(5.dp)
                    .shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(15.dp),
                        clip = false
                    )
                    .background(
                        color = colorResource(id = R.color.off_white),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.TopStart
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row() {
                        Text(
                            modifier = Modifier.padding(
                                top = 5.dp,
                                start = 10.dp,
                                end = 5.dp,
                                bottom = 5.dp
                            ),
                            text = "Syllabus",
                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                            fontSize = 25.sp,
                            color = colorResource(id = R.color.dark_grey),
                        )
                        Spacer(modifier = Modifier.width(160.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.syllabus),
                            contentDescription = null,
                            modifier = Modifier.size(size = 40.dp)
                                .align(Alignment.Top),
                            tint = colorResource(id = R.color.olive)
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))
                    syllabusdrop()
                    Button(
                        onClick={Toast.makeText(context, "Loading" , Toast.LENGTH_SHORT).show()},
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier.padding(start = 240.dp),
                        colors = ButtonDefaults.buttonColors(colorResource(id =R.color.olive))
                    ) {
                        Text(
                            text = "Open",
                            fontFamily = FontFamily(Font(R.font.nunito_semibold))
                        )
                    }
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.97f)
                    .height(155.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.off_white))
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(
                                top = 10.dp,
                                start = 0.dp,
                                end = 5.dp,
                                bottom = 0.dp
                            ),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Row {
                            Spacer(modifier = Modifier.height(30.dp))
                            Text(
                                text = "Events",
                                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                fontSize = 25.sp,
                                color = colorResource(id = R.color.dark_grey),
                            )
                            Spacer(modifier = Modifier.width(175.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.events),
                                contentDescription = null,
                                modifier = Modifier.size(size = 65.dp)
                                    .align(Alignment.Top),
                                tint = colorResource(id = R.color.olive)
                            )
                        }
                    }
                    Box(
                        modifier= Modifier.fillMaxWidth()
                    ) {
                        Row() {
                            Spacer(modifier = Modifier.width(15.dp))
                            Text(
                                text = "$x",
                                color = colorResource(id = R.color.grey),
                                fontSize = 18.sp,
                                fontFamily = FontFamily(Font(R.font.nunito_light)),
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = " upcoming events",
                                color = colorResource(id = R.color.grey),
                                fontSize = 17.sp,
                                fontFamily = FontFamily(Font(R.font.nunito_light)),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.97f)
                    .height(155.dp)
                    .padding(
                        top=5.dp,
                        start= 5.dp,
                        end = 5.dp,
                        bottom = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.off_white))
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(
                                top = 10.dp,
                                start = 0.dp,
                                end = 5.dp,
                                bottom = 0.dp
                            ),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Row() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Attendance",
                                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                fontSize = 25.sp,
                                color = colorResource(id = R.color.dark_grey),
                            )
                            Spacer(modifier = Modifier.width(140.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.speaker),
                                contentDescription = null,
                                tint = colorResource(id = R.color.olive),
                                modifier = Modifier.size(size = 60.dp)
                            )
                        }
                    }
                    Box(
                        modifier= Modifier.fillMaxWidth()
                    ) {
                        Row() {
                            Spacer(modifier = Modifier.width(15.dp))
                            Text(
                                text = "Branch :",
                                color = colorResource(id = R.color.grey),
                                fontSize = 18.sp,
                                fontFamily = FontFamily(Font(R.font.nunito_semibold)),
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "$Branch",
                                color = colorResource(id = R.color.grey),
                                fontSize = 15.sp,
                                fontFamily = FontFamily(Font(R.font.nunito_light)),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier= Modifier.fillMaxWidth()) {
                            Row() {
                                Spacer(modifier = Modifier.width(15.dp))
                                Text(
                                    text = "Total Strength :",
                                    color = colorResource(id = R.color.grey),
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily(Font(R.font.nunito_semibold)),
                                    fontWeight = FontWeight.SemiBold
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(
                                    text = "$Total",
                                    color = colorResource(id = R.color.grey),
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                                    fontWeight = FontWeight.Bold
                                )
//                                Spacer(modifier = Modifier.width(25.dp))
//                                Text(
//                                    text = "Present :",
//                                    color = colorResource(id = R.color.grey),
//                                    fontSize = 18.sp,
//                                    fontFamily = FontFamily(Font(R.font.nunito_semibold)),
//                                    fontWeight = FontWeight.SemiBold
//                                )
//                                Spacer(modifier = Modifier.width(5.dp))
//                                Text(
//                                    text = "$present",
//                                    color = colorResource(id = R.color.grey),
//                                    fontSize = 17.sp,
//                                    fontFamily = FontFamily(Font(R.font.nunito_light)),
//                                    fontWeight = FontWeight.Bold
//                                )
                            }
                        }

                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.97f)
                    .height(155.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.off_white))
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(
                            top = 10.dp,
                            start = 0.dp,
                            end = 0.dp,
                            bottom = 5.dp
                        ),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column() {
                        Row() {
                            Spacer(modifier = Modifier.height(30.dp))
                            Text(
                                text = "Announcements",
                                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                                fontSize = 25.sp,
                                color = colorResource(id = R.color.dark_grey),
                            )
                            Spacer(modifier = Modifier.width(80.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.bell),
                                contentDescription = null,
                                tint = colorResource(id = R.color.olive),
                                modifier = Modifier.size(size = 40.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Box(
                            modifier= Modifier.fillMaxWidth()
                        ) {
                            Row() {
                                Spacer(modifier = Modifier.width(15.dp))
                                Text(
                                    text = "This Week :",
                                    color = colorResource(id = R.color.grey),
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(17.dp))
                                Text(
                                    text = "$thisweekannouncements announcements",
                                    color = colorResource(id = R.color.grey),
                                    fontSize = 17.sp,
                                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier= Modifier.fillMaxWidth()) {
                            Row() {
                                Spacer(modifier = Modifier.width(15.dp))
                                Text(
                                    text = "Last Week :",
                                    color = colorResource(id = R.color.grey),
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(17.dp))
                                Text(
                                    text = "$lastweekannouncements announcements",
                                    color = colorResource(id = R.color.grey),
                                    fontSize = 17.sp,
                                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
        item {
//            Spacer(modifier = Modifier.height(10.dp))
//            Button(
//                onClick = {},
//                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
//                shape = RoundedCornerShape(15.dp),
//                modifier = Modifier.fillMaxWidth(0.97f)
//                    .height(155.dp)
//                    .padding(5.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.off_white))
//            ) {
//                Box(
//                    modifier = Modifier.fillMaxSize()
//                        .padding(
//                            top = 10.dp,
//                            start = 5.dp,
//                            end = 5.dp,
//                            bottom = 5.dp
//                        ),
//                    contentAlignment = Alignment.TopStart
//                ) {
//                    Spacer(modifier = Modifier.height(30.dp))
//                    Text(
//                        text = "Timetable",
//                        fontFamily = FontFamily(Font(R.font.nunito_bold)),
//                        fontSize = 25.sp,
//                        color = colorResource(id = R.color.dark_grey),
//                    )
//                }
//            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.fillMaxWidth(0.97f)
                    .heightIn(min = 205.dp)
                    .padding(5.dp)
                    .shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(15.dp),
                        clip = false
                    )
                    .background(
                        color = colorResource(id = R.color.off_white),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.TopStart
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row() {
                        Text(
                            modifier = Modifier.padding(
                                top = 5.dp,
                                start = 10.dp,
                                end = 5.dp,
                                bottom = 5.dp
                            ),
                            text = "TimeTable",
                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                            fontSize = 25.sp,
                            color = colorResource(id = R.color.dark_grey),
                        )
                        Spacer(modifier = Modifier.width(140.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.timetable),
                            contentDescription = null,
                            modifier = Modifier.size(size = 40.dp)
                                .align(Alignment.Top),
                            tint = colorResource(id = R.color.olive)
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))
                    timetabledrop()
                    Button(
                        onClick={Toast.makeText(context, "Loading" , Toast.LENGTH_SHORT).show()},
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier.padding(start = 240.dp),
                        colors = ButtonDefaults.buttonColors(colorResource(id =R.color.olive))
                    ) {
                        Text(
                            text = "Open",
                            fontFamily = FontFamily(Font(R.font.nunito_semibold))
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun syllabusdrop(){
    var expanded by remember {
        mutableStateOf(false)
    }
    var selectsubject by remember {
        mutableStateOf("Please choose your subject")
    }
    Box(
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(2.dp, color = colorResource(id =R.color.sage_green), shape = RoundedCornerShape(10.dp))
    ){
        Text(
            text = selectsubject,
            modifier = Modifier.align(Alignment.Center),
            fontSize = 16.sp,
            color = colorResource(id= R.color.dark_grey)
        )
        IconButton(onClick = {expanded = !expanded }) {
            Icon(
                Icons.Default.ArrowDropDown,
                contentDescription = "Subjects",
                modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
                tint = colorResource(id = R.color.olive)
            )
        }
//    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
    ) {
        DropdownMenuItem(
            text = { Text("Mobile Application Development") },
            onClick = { /* Do something... */
                expanded = false
                selectsubject = "Mobile Application Development"
            }
        )
        DropdownMenuItem(
            text = { Text("Probability and Statistics") },
            onClick = {
                expanded = false
                selectsubject = "Probability and Statistics"
            }
        )
        DropdownMenuItem(
            text = { Text("Environment science") },
            onClick = { /* Do something... */
                expanded = false
                selectsubject = "Environment science"
            }
        )
        DropdownMenuItem(
            text = { Text("Soft skills and personality development") },
            onClick = { /* Do something... */
                expanded = false
                selectsubject = "Soft skills and personality development"
            }
        )
        DropdownMenuItem(
            text = { Text("Introduction to data science") },
            onClick = { /* Do something... */
                expanded = false
                selectsubject = "Introduction to data science"
            }
        )
        DropdownMenuItem(
            text = { Text("Data Structure") },
            onClick = { /* Do something... */
                expanded = false
                selectsubject = "Data Structure"
            }
        )
    }
    }
}
@Composable
fun timetabledrop(){
    var expanded by remember {
        mutableStateOf(false)
    }
    var branch by remember {
        mutableStateOf("Choose your subject")
    }
    Box(
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .border(2.dp, color = colorResource(id =R.color.sage_green) , shape = RoundedCornerShape(15.dp))
    ){
        Text(
            text = branch,
            modifier = Modifier.align(Alignment.Center),
            fontSize = 16.sp,
            color = colorResource(id= R.color.dark_grey)
        )
        IconButton(onClick = {expanded = !expanded }) {
            Icon(
                Icons.Default.ArrowDropDown,
                contentDescription = "Subjects",
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp),
                tint = colorResource(id = R.color.sage_green)
            )
        }
//    }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            listOf("   Cse-1   ", "   Cse-2   ", "   Cse-3   ", "   CseAi-1   ", "   CseAi-2   ", "   CseAi-3   ").forEach { B ->
                DropdownMenuItem(text = { Text(text = B) }, onClick = {
                    branch = B
                    expanded = false
                })
            }
        }
    }
}