package com.olive.homly.ui.theme.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.homly.R
import com.olive.homly.navigation.ROUTE_CATEGORIES
import com.olive.homly.navigation.ROUTE_LOGIN
import com.olive.homly.navigation.ROUTE_SIGNUP

@Composable
fun HomeScreen(navController: NavHostController) {

    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White))
    {

        Image(painter = painterResource(id = R.drawable.homlylogo2),
            contentDescription = "time" )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Welcome to HOMLY",
            color = Color.Black,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive)

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_SIGNUP)
        },
            modifier = Modifier.width(300.dp),
            border = null,
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {

            Text(
                text = "Don't have an Account yet? Signup",
                color = Color.Black)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        },
            modifier = Modifier.width(300.dp),
            border = null,
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {

            Text(
                text = "Login",
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(30.dp))


        Button(onClick = {
            navController.navigate(ROUTE_CATEGORIES)
        },
            modifier = Modifier.width(300.dp),
            border = null,
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {

            Text(
                text = "Shop now!",
                color = Color.Black)
        }
    }
}
@Preview
@Composable
private fun Homeprev() {
    HomeScreen(navController = rememberNavController())
}