package com.juraj.snakegame.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val ColorPalette = lightColors(
    primary = DarkGreen,
    primaryVariant = DarkGreen,
    secondary = DarkGreen,
    background = LightGreen
)

@Composable
fun SnakeGameTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = ColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}