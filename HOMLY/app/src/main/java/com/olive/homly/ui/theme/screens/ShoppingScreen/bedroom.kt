package com.olive.homly.ui.theme.screens.ShoppingScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.homly.R

@Composable
fun BedroomScreen(navController: NavHostController) {
Column (modifier = Modifier
    .fillMaxWidth()
    .height(1000.dp)
    .background(Color.White))       {


    Row (modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier
            .padding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val imagePainter1: Painter = painterResource(id = R.drawable.foyer)
            Image(
                painter = imagePainter1,
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier
            .padding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val imagePainter2: Painter = painterResource(id = R.drawable.kitchen)
            Image(
                painter = imagePainter2,
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop)
        }
    }}
}

@Preview
@Composable
private fun bedroomprev() {
    BedroomScreen(rememberNavController())
}
