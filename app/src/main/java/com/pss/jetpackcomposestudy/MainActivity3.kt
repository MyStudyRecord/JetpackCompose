package com.pss.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pss.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

val namesList : List<String> = listOf("Park","Sang","Sun")

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingList(names = namesList)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun GreetingList(names : List<String>) {
    Column() {
        for (name in names){
            Greeting(name = name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    GreetingList(names = namesList)
}