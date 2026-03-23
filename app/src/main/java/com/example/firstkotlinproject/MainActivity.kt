package com.example.firstkotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstkotlinproject.ui.theme.FirstKotlinProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstKotlinProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StaticView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun StaticView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 1. Composant Text
        Text(
            text = "Exploration des composants Jetpack Compose",
            style = MaterialTheme.typography.headlineSmall
        )

        // 2. Composant Card (Carte)
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Ceci est une Card",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Elle permet de regrouper du contenu.")
            }
        }

        // 3. Composant Icon (Icône)
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Étoile",
            tint = MaterialTheme.colorScheme.primary
        )

        // 4. Composant Button (Bouton)
        Button(
            onClick = { /* Action à définir */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Cliquer ici (Button)")
        }

        // 5. Composant LinearProgressIndicator (Barre de progression)
        Text(text = "Progression :")
        LinearProgressIndicator(
            progress = { 0.7f },
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StaticViewPreview() {
    FirstKotlinProjectTheme {
        StaticView()
    }
}
