package com.paran.androidlearningjourney.jetpackcompose.p09_list


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
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
import com.paran.androidlearningjourney.ui.theme.DarkGreen
import com.paran.androidlearningjourney.ui.theme.NavyBlue

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LazyHorizontalGridExample() {

    LazyHorizontalGrid(
        rows = GridCells.Fixed(5),
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .padding(horizontal = 10.dp, vertical = 24.dp),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        items(60) { index->

            Box(
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color.Blue,
                        shape = RoundedCornerShape(13.dp)

                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Box $index",
                    fontSize = 18.sp,
                    color= Color.White,
                    fontWeight = FontWeight.SemiBold)
            }

        }

    }

}