package com.olive.homly.ui.theme.screens.ShoppingScreen


import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firestore.v1.StructuredAggregationQuery.Aggregation.Count
import com.olive.homly.R

data class BathroomModel(val name:String, val image: Int)

@Composable
fun ListRow(model: BathroomModel) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(10.dp)
        )
        Text(text = model.name,
           fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

    }

}

@Composable
fun ListColumn(model: BathroomModel) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(0.5f)
    ){
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(10.dp)
        )
        Text(text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

    }

}

private val bathroomlist = mutableListOf<BathroomModel>().apply {
    add(BathroomModel("sd", R.drawable.home_office))
    add(BathroomModel("sd", R.drawable.bathroom))
    add(BathroomModel("sd", R.drawable.kitchen))
    add(BathroomModel("sd", R.drawable.foyer))
}
@Composable
fun BathroomScreen(navController: NavHostController) {
    val cellCount = 2
LazyVerticalGrid(
    columns = GridCells.Fixed(cellCount),
    horizontalArrangement = Arrangement.spacedBy(10.dp),
    verticalArrangement = Arrangement.spacedBy(10.dp),
    contentPadding = PaddingValues(bottom = 30.dp, top = 10.dp, start = 5.dp),
    ) {
    items(bathroomlist){model ->
        ListRow(model = model)
    }
    items(bathroomlist){model ->
        ListColumn(model = model)
   }
}


    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        bathroomlist.forEachIndexed{index, bathroomModel ->  }
        items(bathroomlist){model ->
            ListColumn(model = model)
        }

    }
    
LazyColumn(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
) {
    bathroomlist.forEachIndexed{index, bathroomModel ->  }
    items(bathroomlist){model ->
        ListRow(model = model)
    }

}

}

@Preview
@Composable
private fun bathroomprev() {
    BathroomScreen(rememberNavController())
}
