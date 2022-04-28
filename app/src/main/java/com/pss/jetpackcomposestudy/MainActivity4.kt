package com.pss.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pss.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main4Screen()
        }
    }
}

@Composable
fun Main4Screen() {
    androidx.compose.material.Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        ProfileCard()
    }
}

@Composable
fun ProfilePicture(){

}

@Composable
fun ProfileContent(){

}

@Composable
fun ProfileCard(){
    Card(modifier = Modifier.fillMaxWidth(),
    elevation = 8.dp) {
        Row(modifier = Modifier.wrapContentSize()) {
            ProfilePicture()
            ProfileContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    Main4Screen()
}