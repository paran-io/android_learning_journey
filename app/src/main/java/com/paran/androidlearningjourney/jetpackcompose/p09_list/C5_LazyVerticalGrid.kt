package com.paran.androidlearningjourney.jetpackcompose.p09_list


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LazyVerticalGridExample() {

    LazyVerticalGrid(
       // columns = GridCells.Adaptive(100.dp),
        columns = GridCells.Fixed(3),
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 12.dp, vertical = 18.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        items(26) {

            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(color = Color.Green,
                        shape = RoundedCornerShape(16.dp)

                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Box $it",
                    fontSize = 18.sp,
                    color=Color.White,
                    fontWeight = FontWeight.Bold)
            }

        }

    }

}