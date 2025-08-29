package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingImage()
                }
            }
        }
    }
}

@Composable
fun GreetingText(tittle: String, parrOne: String, parrTwo: String, modifier: Modifier = Modifier) {
    Text(
        text = tittle,
        fontSize = 24.sp,
        modifier = modifier.padding(16.dp)
    )
    Text(
        text = parrOne,
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        )
    )
    Text(
        text = parrTwo,
        modifier = modifier.padding(16.dp)
    )
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        Column {
            GreetingText(tittle = stringResource(R.string.tittle), parrOne = stringResource(
                R.string.parr_one
            ), parrTwo = stringResource(R.string.parr_two)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        GreetingImage()
    }
}