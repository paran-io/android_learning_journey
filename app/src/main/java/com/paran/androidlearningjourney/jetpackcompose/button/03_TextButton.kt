package com.paran.androidlearningjourney.jetpackcompose.button

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
 fun TextButtonExample() {


     val context= LocalContext.current

    Column(modifier = Modifier.fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {

        // ===========================TextButton ============================
        TextButton(onClick = {
            Toast.makeText(
                context,"This is PARAN",
                Toast.LENGTH_LONG
            ).show()
        },


            ) {

            Text(text = "This is Paran",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)

        }


        TextButton(onClick = {},


        ) {

            Text(text = " Android",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)

        }

        TextButton(onClick = {},


        ) {

            Text(text = " Development",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold)

        }
        // =========================== Normal Clickable Text ============================//

        Text(text = "This is Paran",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold ,
            modifier = Modifier.clickable(onClick = {
                Toast.makeText(
                    context,"This is PARAN",
                    Toast.LENGTH_LONG
                ).show()


            }))

        Text(text = " Android",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Text(text = " Development",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(15.dp ))


        Text(text = " Modern Development ",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.background(color = Color.LightGray,
                shape = RoundedCornerShape(10.dp))
                .padding(20.dp)
                .clickable{
                    Toast.makeText(
                        context,"MODERN DEVELOPMENT",
                        Toast.LENGTH_LONG
                    ).show()
                }


        
        
        )














    }





}


@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun TextButtonPreview() {
    TextButtonExample()
}