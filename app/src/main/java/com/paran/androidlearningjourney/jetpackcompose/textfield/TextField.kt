package com.paran.androidlearningjourney.jetpackcompose.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.AttachEmail
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonSearch
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*


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
            placeholder = {Text("Please Enter your name")},
            colors = TextFieldDefaults.colors(
                focusedTextColor =Color.Black,
                unfocusedTextColor = Color.Black,
                focusedLabelColor =Color.Blue,
                unfocusedLabelColor = Color.Black,
                focusedContainerColor = Color.LightGray,
                unfocusedContainerColor = Color.White.copy(alpha = 0.5f ),
                focusedPlaceholderColor =Color.Magenta,
                unfocusedPlaceholderColor = Color.Black,
                focusedLeadingIconColor = Color.DarkGray,
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Black,
                cursorColor =Color.Blue


            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person,
                    contentDescription = null)
            },

            trailingIcon = {Icon(imageVector = Icons.Default.PersonSearch,
                contentDescription = "Person Search")
            },
            maxLines = 2,
            singleLine = true,
            readOnly = true,
            shape = RoundedCornerShape(12.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()






        )

        Spacer(Modifier.height(8.dp))

        TextField(value = email,
            onValueChange = {email=it},
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            label = {Text(text = "  Enter your email")},
            placeholder = {Text("Please Enter your email")},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = null)
            },
            trailingIcon = {Icon(imageVector = Icons.Default.AttachEmail,
                contentDescription = "Attach Email")},
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Transparent,
                focusedLabelColor = Color.Cyan,
                unfocusedLabelColor = Color.Blue,
                focusedContainerColor = Color.LightGray,
                unfocusedContainerColor = Color.Transparent,
                focusedPlaceholderColor = Color.Magenta,
                unfocusedPlaceholderColor = Color.Black,
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Black,
                cursorColor = Color.Blue
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)






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