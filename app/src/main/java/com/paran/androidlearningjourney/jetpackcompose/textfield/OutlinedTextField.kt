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
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.LockOpen
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
fun OutlinedTextFieldExample() {

    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        OutlinedTextField(value = userName,
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
                focusedContainerColor = Color.White.copy(alpha = 0.5f ),
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
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),








            )

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(value = password,
            onValueChange = {password=it},
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            label = {Text(text = "  Enter your password")},
            placeholder = {Text("Please Enter your password")},
            leadingIcon = {
                Icon(imageVector = Icons.Default.LockOpen, contentDescription = null)
            },
            trailingIcon = {Icon(imageVector = Icons.Default.Lock,
                contentDescription = "Lock")},
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Transparent,
                focusedLabelColor = Color.Blue,
                unfocusedLabelColor = Color.Black,
                focusedContainerColor = Color.White.copy(alpha = 0.5f ),
                unfocusedContainerColor = Color.Transparent,
                focusedPlaceholderColor = Color.Magenta,
                unfocusedPlaceholderColor = Color.Black,
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Black,
                cursorColor = Color.Blue
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
            visualTransformation = PasswordVisualTransformation()






        )

        Spacer(Modifier.height(15.dp))

        Button(onClick = {},
            modifier = Modifier.fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color.Blue.copy(alpha = 0.8f),
                contentColor = Color.White,



            )




        ) {
            Text(
                text = "Login Button",
                fontSize = 18.sp
            )



        }







    }








}








