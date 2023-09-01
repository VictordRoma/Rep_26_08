package com.example.meuapp.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.meuapp.ui.theme.MeuAPPTheme

@Composable
fun MainScreen() {
    Column{
        Text(text = "Mt RUIM ALKSSLKAKLSALKSA")
        Text(text = "Fala direito, n to entendeno")
        Text(text = "Bla Bla")
        Text(text = "KYS")
        Text(text = "Penta?")
        Text(text =
        "GG")
        Row(){
            Column {
                Button(onClick = {
                    Log.i("No Boobs?", "Usou LOL")
                }) {
                    Text("enviar")
                }
                Button(onClick = {
                    Log.i("No Babaje's?", "Usou LOL")
                }) {
                    Text("enviar dnv")
                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MeuAPPTheme {
        MainScreen()
    }
}