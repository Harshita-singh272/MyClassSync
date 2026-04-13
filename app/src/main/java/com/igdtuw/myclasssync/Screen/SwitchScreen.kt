package com.igdtuw.myclasssync.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igdtuw.myclasssync.R
@Preview(showSystemUi = true)
@Composable
fun SwitchScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
            colors =
                listOf(
                    Color(0xFf63663E),
                    Color(0xFF424D2F),
                )
        )
        )
        .padding(5.dp)
        .border(9.dp , shape= RoundedCornerShape(25.dp) , color = colorResource(id = R.color.border))
    ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Button(
                    onClick = {},
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.height(180.dp).width(250.dp)
                        .border(5.dp, shape = RoundedCornerShape(15.dp), color =  Color(0xFF424D2F)),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.light_olive))


                ) {
                    Text(
                        text = "AS CR",
                        fontFamily = FontFamily(Font(R.font.playfairdisplay_regular)),
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.dark_grey),
                        fontSize = 30.sp
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {},
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.height(180.dp).width(250.dp)
                        .border(5.dp, shape = RoundedCornerShape(15.dp), color = Color(0xFF424D2F)),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.light_olive))

                ) {
                    Text(
                        text = "AS Student",
                        fontFamily = FontFamily(Font(R.font.playfairdisplay_regular)),
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.dark_grey),
                        fontSize = 30.sp
                    )
                }
            }
    }
}




















//Spacer(modifier = Modifier.height(10.dp))
//            Box(
//                modifier = Modifier.fillMaxWidth(0.97f)
//                    .heightIn(min = 205.dp)
//                    .padding(5.dp)
//                    .shadow(
//                        elevation = 5.dp,
//                        shape = RoundedCornerShape(15.dp),
//                        clip = false
//                    )
//                    .background(
//                        color = colorResource(id = R.color.off_white),
//                        shape = RoundedCornerShape(15.dp)
//                    ),
//                contentAlignment = Alignment.TopStart
//            ) {
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp)
//                ) {
//                    Row(
//                        modifier = Modifier.padding(
//                        top = 5.dp,
//                        start = 10.dp,
//                        bottom = 5.dp,
//                        end= 5.dp
//                    )
//                    )
//                    {
//                        Text(
//                            text = "Syllabus",
//                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
//                            fontSize = 25.sp,
//                            color = colorResource(id = R.color.dark_grey),
//                        )
//                        Column(modifier= Modifier.fillMaxWidth(),
//                            horizontalAlignment = Alignment.End) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.syllabus),
//                                contentDescription = null,
//                                modifier = Modifier.size(size = 40.dp),
//                                tint = colorResource(id = R.color.olive)
//                            )
//                        }
//                    }
//                    Spacer(modifier = Modifier.height(4.dp))
//                    Syllabusdrop()
//                    Button(
//
//                        onClick={ Toast.makeText(context, "Loading" , Toast.LENGTH_SHORT).show()},
//                        shape = RoundedCornerShape(15.dp),
//                        modifier = Modifier.padding(start = 240.dp),
//                        colors = ButtonDefaults.buttonColors(colorResource(id =R.color.olive))
//                    ) {
//                        Text(
//                            text = "Open",
//                            fontFamily = FontFamily(Font(R.font.nunito_semibold))
//                        )
//                    }
//                }
//            }

//            Spacer(modifier = Modifier.height(10.dp))
//            Box(
//                modifier = Modifier.fillMaxWidth(0.97f)
//                    .heightIn(min = 205.dp)
//                    .padding(5.dp)
//                    .shadow(
//                        elevation = 5.dp,
//                        shape = RoundedCornerShape(15.dp),
//                        clip = false
//                    )
//                    .background(
//                        color = colorResource(id = R.color.off_white),
//                        shape = RoundedCornerShape(15.dp)
//                    ),
//                contentAlignment = Alignment.TopStart
//            ) {
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp)
//                ) {
//                    Row {
//                        Text(
//                            modifier = Modifier.padding(
//                                top = 5.dp,
//                                start = 10.dp,
//                                end = 5.dp,
//                                bottom = 5.dp
//                            ),
//                            text = "TimeTable",
//                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
//                            fontSize = 25.sp,
//                            color = colorResource(id = R.color.dark_grey),
//                        )
//                        Spacer(modifier = Modifier.width(140.dp))
//                        Icon(
//                            painter = painterResource(id = R.drawable.timetable),
//                            contentDescription = null,
//                            modifier = Modifier.size(size = 40.dp)
//                                .align(Alignment.Top),
//                            tint = colorResource(id = R.color.olive)
//                        )
//                    }
//
//                    Spacer(modifier = Modifier.height(4.dp))
//                    Timetabledrop()
//                    Button(
////                        Toast.makeText(context, "Loading" , Toast.LENGTH_SHORT).show()
//                        onClick={},
//                        shape = RoundedCornerShape(15.dp),
//                        modifier = Modifier.padding(start = 240.dp),
//                        colors = ButtonDefaults.buttonColors(colorResource(id =R.color.olive))
//                    ) {
//                        Text(
//                            text = "Open",
//                            fontFamily = FontFamily(Font(R.font.nunito_semibold))
//                        )
//                    }
//                }
//            }