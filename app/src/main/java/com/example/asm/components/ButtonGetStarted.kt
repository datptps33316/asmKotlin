@file:Suppress("UNUSED_EXPRESSION")

package com.example.asm.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun GetStartedButton(
    name: String,
    backgroundColor: Color,
    textColor: Color,
    radius: Int,
    onClick :() -> Unit,
    modifier: androidx.compose.ui.Modifier = Modifier

) {
    Button(
        onClick = { onClick()},
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(radius),
        modifier =  modifier

    ) {
        Text(
            text = name,
            color = textColor
        )
    }
}