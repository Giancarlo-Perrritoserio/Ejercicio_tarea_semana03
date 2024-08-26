package com.example.ejercicio_tareasemama3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio_tareasemama3.ui.theme.Ejercicio_TareaSemama3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio_TareaSemama3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFCCFFCC)
                ) {
                    UserProfile()
                }
            }
        }
    }
}


@Composable
fun UserProfile() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFCCFFCC)), // Fondo verde claro
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.weight(1f))

        // Imagen de Android Logo
        Image(
            painter = painterResource(id = R.drawable.android_icon),
            contentDescription = "Android Logo",
            modifier = Modifier
                .size(120.dp)
                .padding(bottom = 16.dp)
        )

        // Nombre
        Text(
            text = "Jennifer Doe",
            fontSize = 30.sp, // Tamaño más grande
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Título
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 8.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF006400),
            modifier = Modifier.padding(bottom = 32.dp)
        )


        Spacer(modifier = Modifier.weight(1f))

        // Información de contacto
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp) // Reducir el espaciado
        ) {
            // Teléfono
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.tyrone),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "+11 (123) 444 555 666", fontSize = 14.sp)
            }

            // Símbolo @blablabla
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.compartir_icon),
                    contentDescription = "Share Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "@blablabla", fontSize = 14.sp)
            }

            // Correo electrónico
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.correo_icon),
                    contentDescription = "Email Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "jen.doe@android.com", fontSize = 14.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Ejercicio_TareaSemama3Theme {
        UserProfile()
    }
}