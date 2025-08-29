package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)) {
                    PresentationCard()
                }
            }
        }
    }
}

@Composable
fun GreetingPrincipal(modifier: Modifier, name: String, title: String) {
    val image = painterResource(R.drawable.android_logo)
    Column(modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = image,
            contentDescription = null,
            modifier.background(Color(0xFF073042))
                .fillMaxWidth(0.5F)
                .aspectRatio(1f),
            contentScale = ContentScale.Fit
        )
        Text(
            text = name,
            fontSize = 32.sp,
        )
        Text(
            text = title,
            fontSize = 18.sp
        )
    }
}

@Composable
fun GreetingSocial(modifier: Modifier = Modifier) {
    Column(modifier.padding(
        top = 20.dp
    )) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = "(+51)970564391"
            )
        }
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = "@kenneth.mendoza"
            )
        }
        Row {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = "kenneth.mendoza@unmsm.edu.pe"
            )
        }
    }
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {
    Column(modifier,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {
        GreetingPrincipal(modifier, name = "Kenneth Mendoza", title = "Engineer of Systems")
        GreetingSocial()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Surface(modifier = Modifier.fillMaxSize(),
            color = Color(0XFFD2E8D4)) {
                PresentationCard()
        }
    }
}