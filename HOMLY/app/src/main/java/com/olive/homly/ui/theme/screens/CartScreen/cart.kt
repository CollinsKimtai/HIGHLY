package com.olive.homly.ui.theme.screens.CartScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun CartScreen(navController: NavHostController) {

}

@Preview
@Composable
private fun Cartprev() {
    CartScreen(navController = rememberNavController())
}