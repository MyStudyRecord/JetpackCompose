package com.pss.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
        androidx.compose.material.Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(align = Alignment.BottomCenter)
        ) {
            Text(text = "가즈아 컴포즈", modifier = Modifier.wrapContentSize(), style = MaterialTheme.typography.h3)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MainScreen()
}