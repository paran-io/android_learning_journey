package com.paran.androidlearningjourney.jetpackcompose.p07_divider


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HorizontalDividerExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Paran",
            fontSize = 24.sp
        )

        HorizontalDivider(

            modifier = Modifier
                .padding(vertical = 16.dp)
                .width(270.dp),
            thickness = 4.dp,
            color = Color.Blue
        )

        Text(
            text = "Instructor at Paran Dev Lab",
            fontSize = 24.sp
        )

    }

}