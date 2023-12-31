package edu.utvt.misproyectos.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TitleBar(
    modifier: Modifier = Modifier,
    message: String = "Mis Aplicaciones en Android",
    color: Color = MaterialTheme.colorScheme.primary,
){
    Text(text = message, color = color, modifier = modifier)
}

@Composable
fun BottomTitleBar(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
    message: String = "Default",
    color: Color = MaterialTheme.colorScheme.primary,
    textAlign: TextAlign = TextAlign.End,
){
    Text(text = message, color = color, textAlign = textAlign, modifier = modifier)
}