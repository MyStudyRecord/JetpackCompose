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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        //보여지는 text
        text = "Hello world!",
        //modifier로 여러가지 설정
        modifier = Modifier
                //text 영역 사이즈 설정
            .size(width = 80.dp, height = 100.dp)
                //클릭 설정
            .clickable(onClick = { })
                //padding 설정
            .padding(start = 10.dp, bottom = 15.dp)
         ,
        //style로 여러가지 설정
        style = TextStyle(
            //컬러 설정
            color = Color.Blue
        ),
        //font 굵기 설정
        fontWeight = FontWeight.Bold,
        //font 사이즈 설정
        fontSize = 18.sp,
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