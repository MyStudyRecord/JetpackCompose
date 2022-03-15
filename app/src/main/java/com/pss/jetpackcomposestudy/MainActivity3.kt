package com.pss.jetpackcomposestudy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen3()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.h3
    )
}

@Composable
fun MainScreen3() {
    val greetingListState = remember {
        mutableStateListOf<String>("Park", "Kim")
    }
    val newNameStateContent = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GreetingList(
            greetingListState,
            { greetingListState.add(newNameStateContent.value) },
            newNameStateContent.value,
            { newInput -> newNameStateContent.value = newInput }
        )
    }
}

@Composable
fun GreetingList(
    namesList: List<String>,
    buttonClick: () -> Unit,
    textFieldValue: String,
    textFieldUpdate: (newName: String) -> Unit
) {
    for (name in namesList) {
        Greeting(name = name)
    }

    TextField(
        value = textFieldValue, onValueChange = textFieldUpdate
    )
    Button(onClick = buttonClick) {
        Text("Add new name")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    MainScreen3()
}