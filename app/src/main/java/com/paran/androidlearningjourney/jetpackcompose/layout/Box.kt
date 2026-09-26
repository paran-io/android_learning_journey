package com.paran.androidlearningjourney.jetpackcompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BoxExample() {


    Column(
        modifier = Modifier.fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Box(
            modifier = Modifier
                .width(200.dp)
                .height(400.dp)
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(15.dp)
        ) {

            Text(
                text = "App",
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.TopEnd)
            )

            Text(
                text = "KMP",
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.Center)
            )

            Text(
                text = "CMP",
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.BottomStart)
            )

        }

    }
}