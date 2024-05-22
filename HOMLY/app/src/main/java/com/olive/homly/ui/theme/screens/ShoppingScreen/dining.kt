package com.olive.homly.ui.theme.screens.ShoppingScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.homly.R
import com.olive.homly.data.productviewmodel
import com.olive.homly.model.Product
import com.olive.homly.navigation.ROUTE_CART

@Composable
fun DiningScreen(navController: NavHostController) {
Row (modifier = Modifier
    .fillMaxSize(),
    horizontalArrangement = Arrangement.SpaceEvenly)
{
    var context = LocalContext.current
    var productRepository = productviewmodel(navController, context)
    val emptyProductState = remember { mutableStateOf(Product("","","","")) }
    var emptyProductsListState = remember { mutableStateListOf<Product>() }
    var products = productRepository.viewProducts(emptyProductState, emptyProductsListState)

Column (modifier = Modifier
    .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally)
{
    Image(
        painter = painterResource(id = R.drawable.kitchen),
        contentDescription = "Image",
        modifier = Modifier
            .size(150.dp))
    Spacer(modifier = Modifier.width(16.dp))

    LazyColumn {
        items(products){
            ProductItem(
                name = it.name,
                description = it.description,
                price = it.price,
                imageUrl = it.imageUrl,
                navController = navController,
                productRepository = productRepository
            )
        }
    }

}}
}

@Composable
fun ProductItem(name:String, description:String, price:String, imageUrl:String,
                navController:NavHostController, productRepository:productviewmodel) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = description)
        Text(text = price)
        Button(onClick = {
            navController.navigate(ROUTE_CART)
        }) {

        }

    }

    }

@Preview
@Composable
private fun diningprev() {
    DiningScreen(rememberNavController())
}
