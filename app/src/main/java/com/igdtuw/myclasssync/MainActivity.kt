package com.igdtuw.myclasssync

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.igdtuw.myclasssync.Screen.Dashboard
import com.igdtuw.myclasssync.Screen.SwitchScreen
import com.igdtuw.myclasssync.ui.theme.MyClassSyncTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyClassSyncTheme {
                Dashboard()
//                SwitchScreen()
            }
        }
    }
}
//                Text("my app")
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Harshita",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//                SwitchScreen()
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyClassSyncTheme {
        Greeting("Android")
    }
}