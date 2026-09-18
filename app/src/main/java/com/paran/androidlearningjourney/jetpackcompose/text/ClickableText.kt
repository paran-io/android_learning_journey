package com.paran.androidlearningjourney.jetpackcompose.text

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun ClickableTextExample() {

     val context= LocalContext.current


    Column(modifier=Modifier.fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {


        Text(text = "Welcome! Modern Android development ",
            fontSize =25.sp,
            modifier = Modifier.clickable(onClick = {
                Toast.makeText(context," Welcome to the Jetpack Compose" ,
                    Toast.LENGTH_SHORT).show() }
            )

        )


    }



}