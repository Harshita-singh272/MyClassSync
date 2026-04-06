package com.igdtuw.myclasssync.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    Column(modifier= Modifier.fillMaxSize().background(colorResource(id=R.color.off_white)))
    {

        Box(modifier = Modifier
            .fillMaxWidth()
            .background(color = colorResource(id=R.color.background))
        ){

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
                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                    fontSize = 26.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(26.dp))
        Row(modifier = Modifier.padding(5.dp)) {
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.489f)
                    .height(150.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))

            ) {
                Text(
                    text= ""
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(1f)
                    .height(150.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))
            ) { }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.padding(5.dp)) {
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.489f)
                    .height(150.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))

            ) {
                Text(
                    text= ""
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(1f)
                    .height(150.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))
            ) { }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.padding(5.dp)) {
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(0.489f)
                    .height(150.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))

            ) {
                Text(
                    text= ""
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(
                onClick = {},
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth(1f)
                    .height(150.dp),
                colors =ButtonDefaults.buttonColors(containerColor= colorResource(id= R.color.off_white))
            ) { }
        }
    }
}