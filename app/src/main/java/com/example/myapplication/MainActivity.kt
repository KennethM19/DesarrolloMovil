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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
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
fun GreetingText(tittle: String, message: String, modifier: Modifier = Modifier, color: Color) {
    Surface(color = color,
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
            GreetingText(
                tittle = stringResource(R.string.text_composable),
                message = stringResource(R.string.text_description),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFEADDFF)
            )
            GreetingText(
                tittle = stringResource(R.string.image_composable),
                message = stringResource(R.string.image_description),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFD0BCFF)
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            GreetingText(
                tittle = stringResource(R.string.row_composable),
                message = stringResource(R.string.row_description),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFB69DF8)
            )
            GreetingText(
                tittle = stringResource(R.string.column_composable),
                message = stringResource(R.string.column_description),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFF6EDFF)
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