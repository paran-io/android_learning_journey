package com.paran.androidlearningjourney.jetpackcompose.p09_list


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
fun NestedLazyListExample() {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        items(20) { index ->

            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

                Text(
                    text = "Row No.${index + 1}",
                    fontSize = 20.sp,
                    color = Color(0xFF0D47A1),
                    fontWeight = FontWeight.Bold
                )

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {

                    items(10) { index ->
                        Box(
                            modifier = Modifier
                                .size(100.dp)
                                .background(
                                    color = Color.Green,
                                    shape = RoundedCornerShape(8.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Box No. ${index + 1}",
                                fontSize = 18.sp,
                                color=Color.White,
                                fontWeight = FontWeight.Bold


                            )
                        }
                    }

                }

            }

        }

    }

}