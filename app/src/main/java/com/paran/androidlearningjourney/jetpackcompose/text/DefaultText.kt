package com.paran.androidlearningjourney.jetpackcompose.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextExamplePreview() {


    Column(modifier = Modifier.fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {


        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Welcome our android journey" +
                    "Welcome our android journey" +
                    "Welcome  ",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Start,
            textDecoration = TextDecoration.LineThrough,
            maxLines = 1,
            overflow = TextOverflow.MiddleEllipsis,
            letterSpacing =4.sp,
            style = MaterialTheme.typography.titleSmall,
            color= Color.Blue


        )

        Spacer(Modifier.height(25.dp))

        Text(

            text = "Development Journey",
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge.copy(
                
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold

                
            )



        )










    }






}