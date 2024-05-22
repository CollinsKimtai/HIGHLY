package com.olive.homly.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.olive.homly.ui.theme.screens.CartScreen.CartScreen
import com.olive.homly.ui.theme.screens.DeliveryScreen.DeliveryScreen
import com.olive.homly.ui.theme.screens.HomeScreen.HomeScreen
import com.olive.homly.ui.theme.screens.LoginScreen.LoginScreen
import com.olive.homly.ui.theme.screens.LoginScreen.SignupScreen
import com.olive.homly.ui.theme.screens.OrderScreen.PlaceOrderScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.BathroomScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.BedroomScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.CategoriesScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.DiningScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.FoyerScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.GarageScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.HomeofficeScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.KitchenScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.LaundryScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.LivingroomScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.OutdoorsScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.ProductdetailsScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.ProductlistScreen
import com.olive.homly.ui.theme.screens.SplashScreen.SplashScreen


@Composable
fun AppNavHost(modifier : Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }
        composable(ROUTE_CART) {
            CartScreen(navController)
        }
        composable(ROUTE_DELIVERY) {
            DeliveryScreen(navController)
        }
        composable(ROUTE_ORDER) {
            PlaceOrderScreen(navController)
        }
        composable(ROUTE_CATEGORIES) {
            CategoriesScreen(navController)
        }
        composable(ROUTE_DETAILS) {
            ProductdetailsScreen(navController)
        }
        composable(ROUTE_LIST) {
            ProductlistScreen(navController)
        }

        composable(ROUTE_BATHROOM) {
            BathroomScreen(navController)
        }

        composable(ROUTE_BEDROOM) {
            BedroomScreen(navController)
        }

        composable(ROUTE_DINING) {
            DiningScreen(navController)
        }

        composable(ROUTE_FOYER) {
            FoyerScreen(navController)
        }

        composable(ROUTE_GARAGE) {
            GarageScreen(navController)
        }

        composable(ROUTE_HOMEOFFICE) {
            HomeofficeScreen(navController)
        }

        composable(ROUTE_KITCHEN) {
            KitchenScreen(navController)
        }

        composable(ROUTE_LAUNDRY) {
            LaundryScreen(navController)
        }

        composable(ROUTE_LIVINGROOM) {
            LivingroomScreen(navController)
        }

        composable(ROUTE_OUTDOORS) {
            OutdoorsScreen(navController)
        }


    }
}