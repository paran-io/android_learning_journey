package com.paran.androidlearningjourney.jetpackcompose.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun TextFieldExample() {

     var userName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {

        TextField(value = userName,
            onValueChange = {userName=it},
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            label = {Text(text = "  Enter your name")},
            placeholder = {Text("Please Enter your name")}





        )

        Spacer(Modifier.height(8.dp))

        TextField(value = email,
            onValueChange = {email=it},
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            label = {Text(text = "  Enter your email")},
            placeholder = {Text("Please Enter your email")}


        )

        Spacer(Modifier.height(8.dp))

        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color.DarkGray,
                contentColor = Color.White)




        ) {
            Text(
                text = "Login Button"
            )



        }







    }








}