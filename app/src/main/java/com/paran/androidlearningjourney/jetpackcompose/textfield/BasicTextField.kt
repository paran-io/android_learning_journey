package com.paran.androidlearningjourney.jetpackcompose.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun BasicTextFieldExample() {

var userName by remember {
    mutableStateOf("")
}
var phone by remember {
    mutableStateOf("")
}

    Column(modifier = Modifier.fillMaxSize()
        .padding(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {




        BasicTextField(
            value =phone,
            onValueChange = {phone=it}



        )

        Spacer(Modifier.height(14.dp))

        BasicTextField(value = userName,
            onValueChange = {userName=it},
            modifier = Modifier
                .background(color = Color.LightGray,
                    shape = RoundedCornerShape(10.dp))
                .size(height = 45.dp, width = 200.dp)




            )















    }









}