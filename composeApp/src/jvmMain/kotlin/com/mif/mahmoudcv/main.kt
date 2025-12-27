package com.mif.mahmoudcv

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application

fun main(): Unit = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Mahmoud Ibrahim - CV",
        state = WindowState(
            placement = WindowPlacement.Floating,
            size = DpSize(420.dp, 900.dp)
        )
    ) {
        App()
    }
}
