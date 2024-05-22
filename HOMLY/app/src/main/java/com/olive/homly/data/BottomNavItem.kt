package com.olive.homly.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val label: String,
    val icon: ImageVector,
    val route: String,
)

object Constants{
    val BottomNavItems = listOf(
        BottomNavItem(
            label = "Home",
            icon = Icons.Filled.Home,
            route = "home"
        ),
        BottomNavItem(
            label = "Categories",
            icon = Icons.Filled.Menu,
            route = "categories"
        ),
        BottomNavItem(
            label = "Account",
            icon = Icons.Filled.Person,
            route = "Account"
        )
    )
}

