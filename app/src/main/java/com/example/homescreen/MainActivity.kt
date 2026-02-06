package com.example.homescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homescreen.ui.theme.HOMESCREENTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HOMESCREENTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "CLAIR",
            style = MaterialTheme.typography.displayLarge
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Gérez votre argent simplement",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(25.dp))
        Button(
            onClick = {println("Commencer") }
        ) {
            Text("Commencer")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrHomeScreen() {
    HomeScreen()
}