package com.pss.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pss.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    androidx.compose.material.Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
        ) {
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Center, verticalAlignment = Bottom) {
            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Black)
            HorizontalColoredBar(Color.Cyan)
            HorizontalColoredBar(Color.Green)
        }

    }
}

@Composable
fun HorizontalColoredBar(color: Color){
    Surface(
        color = color,
        modifier = Modifier
            .width(60.dp)
            .height(600.dp)
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MainScreen()
}