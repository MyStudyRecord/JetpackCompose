package com.pss.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pss.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* //아래와 그 아래 setContent 2개 모두 같은 의미
         setContent(content = {
             Greeting("Android")
         })*/
        setContent {
            GreetingText("world")
        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .size(width = 80.dp, height = 100.dp)
            .clickable(onClick = {

            })
            .padding(start = 10.dp, bottom = 15.dp)

    )
}

@Composable
fun GreetingButton() {
    Button(onClick = {}) {
        GreetingText(name = "button")
        GreetingText(name = "버튼")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingText("world")
}