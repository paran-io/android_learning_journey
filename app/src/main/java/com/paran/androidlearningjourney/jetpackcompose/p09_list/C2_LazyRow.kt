package com.paran.androidlearningjourney.jetpackcompose.p09_list



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
fun LazyRowExample() {

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        items(20) { index ->

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {

                Text(text="Box $index",
                    modifier= Modifier.background(
                        color = Color.Red,
                        shape = CircleShape
                    )
                        .padding(18.dp),
                    color = Color.White,
                    fontSize =18.sp,
                    fontWeight = FontWeight.ExtraBold




                )
            }

        }

    }

}