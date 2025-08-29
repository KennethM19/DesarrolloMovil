package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BoxUi()
                }
            }
        }
    }
}

@Composable
fun GreetingOne(tittle: String, message: String, modifier: Modifier = Modifier) {
    Surface(color = Color(0xFFEADDFF),
        modifier = modifier) {
        Column(
            modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = tittle,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    bottom = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
            Text(
                text = message,
                textAlign = TextAlign.Justify
            )
        }
    }
}
@Composable
fun GreetingTwo(tittle: String, message: String, modifier: Modifier = Modifier) {
    Surface(color = Color(0xFFD0BCFF),
        modifier = modifier) {
        Column(
            modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = tittle,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    bottom = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
            Text(
                text = message,
                textAlign = TextAlign.Justify
            )
        }
    }
}
@Composable
fun GreetingThree(tittle: String, message: String, modifier: Modifier = Modifier) {
    Surface(color = Color(0xFFB69DF8),
        modifier = modifier) {
        Column(
            modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = tittle,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    bottom = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
            Text(
                text = message,
                textAlign = TextAlign.Justify
            )
        }
    }
}
@Composable
fun GreetingFour(tittle: String, message: String, modifier: Modifier = Modifier) {
    Surface(color = Color(0xFFF6EDFF),
        modifier = modifier) {
        Column(
            modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = tittle,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    bottom = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
            Text(
                text = message,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
fun BoxUi() {
    Column() {
        Row(modifier = Modifier.weight(1f)) {
            GreetingOne(
                tittle = "Text composable",
                message = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
            GreetingTwo(
                tittle = "Image composable",
                message = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            GreetingThree(
                tittle = "Row composable",
                message = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
            GreetingFour(
                tittle = "Column composable",
                message = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        BoxUi()
    }
}