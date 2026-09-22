package com.paran.androidlearningjourney.jetpackcompose.modifier

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true,)
@Composable
fun ModifiersExample() {

    val context= LocalContext.current



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Green)
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Text(text = "Water Lily", fontSize = 20.sp)
            Text(text = "Magpie Robin", fontSize = 20.sp)
            Text(text = "Jackfruit", fontSize = 20.sp)

        }

        Box(
            modifier = Modifier
                .background(
                    color = Color.Red,
                    shape = RoundedCornerShape(16.dp)
                )
                .size(200.dp)
                .clickable(onClick = {
                    Toast.makeText(
                        context,
                        "Welcome to Bangladesh Flag Theme!🏴",
                        Toast.LENGTH_LONG
                    ).show()

                })
                .border(width = 5.dp, color = Color.White,
                    shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Center", fontSize = 20.sp, color = Color.White)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Text(text = "Tiger", fontSize = 20.sp)
            Text(text = "Hilsa", fontSize = 20.sp)
            Text(text = "Mango", fontSize = 20.sp)

        }

    }

}