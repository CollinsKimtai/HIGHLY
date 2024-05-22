package com.olive.homly.ui.theme.screens.LoginScreen

import android.content.Intent
import android.hardware.camera2.params.BlackLevelPattern
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.homly.MainActivity
import com.olive.homly.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }
    val context = LocalContext.current
    val gradientColorList = listOf(
        Color(0xFFAA00FF),
        Color(0xFFC9378B)
//        Color(0xFFD4B9D3),
//        Color(0xFFD4B9D3),
//        Color(0xFFD4B9D3),
//        Color(0xFFD4B9D3),
    )


    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = gradientbackgroundBrush(
                    isVerticalGradient = true,
                    colors = gradientColorList
                )
            )
    )
    {
        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = R.drawable.homlylogo2),
            contentDescription = "logo"
        )

        Spacer(modifier = Modifier.height(70.dp))

        Text(
            text = "WELCOME BACK",
            color = Color.Black,
            fontSize = 30.sp
        )

        Text(
            text = "Login to your Account.",
            color = Color.Magenta,
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "icon"
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.Transparent
            ),
            label = {
                Text(
                    text = "User@mail.com",
                    color = Color.Black,
                    fontSize = 20.sp
                )
            },

            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(Color.White)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "lock"
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.Transparent
            ),
            label = {
                Text(
                    text = "Password",
                    color = Color.Black,
                    fontSize = 20.sp
                )
            },

            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(Color.White)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Transparent)
        ) {
            Text(
                text = "Log In",
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = FontFamily.Cursive
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            ) {
                Text(
                    text = "Don't have an Account yet?  Sign up",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive
                )

            }
        }
    }
}
    @Composable
    private fun gradientbackgroundBrush(
        isVerticalGradient: Boolean,
        colors: List<Color>
    ): Brush {
        val endOffset = if (isVerticalGradient) {
            Offset(0f, Float.POSITIVE_INFINITY)
        } else {
            Offset(Float.POSITIVE_INFINITY, 0f)
        }
        return Brush.linearGradient(
            colors = colors,
            start = Offset.Zero,
            end = endOffset
        )

    }

@Preview
@Composable
private fun Loginprev() {
    LoginScreen(rememberNavController())
}