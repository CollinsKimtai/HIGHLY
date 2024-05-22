package com.olive.homly.ui.theme.screens.ShoppingScreen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.olive.homly.R
import com.olive.homly.data.BottomNavItem
import com.olive.homly.data.Constants
import com.olive.homly.navigation.ROUTE_CART
import com.olive.homly.navigation.ROUTE_SIGNUP
import kotlinx.coroutines.selects.select
import androidx.compose.foundation.ScrollState.Companion as scrollState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
//    val screens = listOf(
//        Screen.home,
//        Screen.details
//    )

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(76.dp)
                .height(48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TextField(
                value = "",
                placeholder = {
                    Text(
                        text = "Search...",
                        fontSize = 12.sp
                    )
                },
                onValueChange = {},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Black,
                    unfocusedBorderColor = Black
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Black
                    )
                },
                trailingIcon = {
                    IconButton(
                        onClick = {
                            navController.navigate(ROUTE_CART)
                        },
                        modifier = Modifier
                            .fillMaxWidth(0.1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Shoppingcart",
                            tint = Black
                        )


                    }
                }
            )

        }
        Image(
            painter = painterResource(id = R.drawable.homlylogo2),
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .padding(end = 200.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Categories",
            color = Black
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Category",
                style = MaterialTheme.typography.bodyLarge,
                color = Black
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "More",
                    color = DarkGray
                )

            }
        }
        Row(
            modifier = Modifier
                .horizontalScroll(scrollState)
                .padding(start = 24.dp, end = 24.dp, top = 36.dp, bottom = 30.dp)
                .fillMaxWidth()
                .background(White),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                border = null,
                colors = ButtonDefaults.buttonColors(White)
            ) {
                Text(
                    text = "Living Room",
                    color = Black
                )
                Image(
                    painter = painterResource(id = R.drawable.livingroom),
                    contentDescription = "livingroom"
                )
                Button(
                    onClick = { /*TODO*/ },
                    border = null,
                    colors = ButtonDefaults.buttonColors(White)
                ) {
                    Text(
                        text = "Kitchen",
                        color = Black
                    )
                    Image(
                        painter = painterResource(id = R.drawable.kitchen),
                        contentDescription = "kitchen"
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        border = null,
                        colors = ButtonDefaults.buttonColors(White)
                    ) {
                        Text(
                            text = "Bedroom",
                            color = Black
                        )
                        Image(
                            painter = painterResource(id = R.drawable.bedroom),
                            contentDescription = "bedroom"
                        )
                        Button(
                            onClick = { /*TODO*/ },
                            border = null,
                            colors = ButtonDefaults.buttonColors(White)
                        ) {
                            Text(
                                text = "Dining Room",
                                color = Black
                            )
                            Image(
                                painter = painterResource(id = R.drawable.dining),
                                contentDescription = "diningroom"
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                border = null,
                                colors = ButtonDefaults.buttonColors(White)
                            ) {
                                Text(
                                    text = "Bathroom",
                                    color = Black
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.bathroom),
                                    contentDescription = "bathroom"
                                )
                                Button(
                                    onClick = { /*TODO*/ },
                                    border = null,
                                    colors = ButtonDefaults.buttonColors(White)
                                ) {
                                    Text(
                                        text = "Laundry Room",
                                        color = Black
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.laundry),
                                        contentDescription = "laundryroom"
                                    )
                                    Button(
                                        onClick = { /*TODO*/ },
                                        border = null,
                                        colors = ButtonDefaults.buttonColors(White)
                                    ) {
                                        Text(
                                            text = "Garage/Workshop",
                                            color = Black
                                        )
                                        Image(
                                            painter = painterResource(id = R.drawable.garage),
                                            contentDescription = "garage"
                                        )
                                        Button(
                                            onClick = { /*TODO*/ },
                                            border = null,
                                            colors = ButtonDefaults.buttonColors(White)
                                        ) {
                                            Text(
                                                text = "Outdoor Spaces",
                                                color = Black
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.outdoors),
                                                contentDescription = "outdoors"
                                            )
                                            Button(
                                                onClick = { /*TODO*/ },
                                                border = null,
                                                colors = ButtonDefaults.buttonColors(White)
                                            ) {
                                                Text(
                                                    text = "Foyer",
                                                    color = Black
                                                )
                                                Image(
                                                    painter = painterResource(id = R.drawable.foyer),
                                                    contentDescription = "foyer"
                                                )
                                                Button(
                                                    onClick = { /*TODO*/ },
                                                    border = null,
                                                    colors = ButtonDefaults.buttonColors(White)
                                                ) {
                                                    Text(
                                                        text = "Home Office",
                                                        color = Black
                                                    )
                                                    Image(
                                                        painter = painterResource(id = R.drawable.home_office),
                                                        contentDescription = "home_office"
                                                    )


                                                }


                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    BottomAppBar (modifier = Modifier
        .background(White),

        ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "home"
            )
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "home"
                )
            }
        }
    }
}

@Preview
@Composable
private fun Categoriesprev() {
    CategoriesScreen(rememberNavController())
}