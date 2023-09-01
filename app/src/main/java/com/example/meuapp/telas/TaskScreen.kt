package com.example.meuapp.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen() {

    //recompose
    //var vlrDoTextField = remember {
    //    mutableStateOf("")
    //}

    var contador = remember {
        mutableStateOf("")
    }

    Column (modifier = Modifier.padding(20.dp)){
        //Text(text = "Titulo da tarefa")
        //TextField(
        //    value = vlrDoTextField.value,
        //    onValueChange = {
        //        // antes da tela ser redesenhada
        //        // roda esse trecho aqui XD
        //        vlrDoTextField.value = it
        //       Log.i("poop", it)
        //   })
        Column {
            Button(onClick = {
                contador.value = contador.value + 1
                Log.i("No Babaje's?", "Usou btn LOL")
            }) {
                Text("Vai lá prá Main meu mano")
            }

            Text(contador.value.toString())

        }

    }
}
