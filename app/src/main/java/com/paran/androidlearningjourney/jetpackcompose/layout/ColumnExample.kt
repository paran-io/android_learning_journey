package com.paran.androidlearningjourney.jetpackcompose.layout

import android.widget.Space
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.paran.androidlearningjourney.R

@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun ColumnExample() {

    val context= LocalContext.current
    var userName by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
            .windowInsetsPadding(WindowInsets.systemBars)
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(2.dp)

    ) {
        Text(
            text = "AnDev",
            fontSize = 24.sp,
            modifier = Modifier.padding(vertical = 16.dp)
                .clickable(onClick = {
                    Toast.makeText(
                        context, " Master Jetpack Compose 🚀",
                        Toast.LENGTH_LONG
                    ).show()


                })
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "Paran",

            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "Dev",
            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))

        Text(
            text = "Lab",
            fontSize = 24.sp
        )

        Spacer(Modifier.height(10.dp))

        Icon(
            imageVector = Icons.Default.ArrowBackIosNew,
            contentDescription = "ArrowBack"
        )
        Spacer(Modifier.height(10.dp))
        IconButton(
            onClick = {Toast.makeText(
                context, " Learn Jetpack Compose with Paran 🚀",
                Toast.LENGTH_LONG
            ).show()
            },


            ) {

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu"
            )


        }
        Spacer(Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo ",
            modifier = Modifier.size(200.dp)
                .padding(23.dp)


        )

        Spacer(Modifier.height(10.dp))

        Text(
            text = "Paran",
            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))

        Text(
            text = "Dev",
            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "Lab",
            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = userName,
            onValueChange = { userName=it },
            label={Text(text = "Enter your name")}
        )
        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password=it },
            label={Text(text = "Enter your password")}
        )
        Spacer(Modifier.height(10.dp))

        OutlinedButton(onClick = {


            Toast.makeText(
                context,
                " Please Enter Your Name & password ",
                Toast.LENGTH_LONG
            ).show()
        },
            modifier = Modifier
                .size(height = 50.dp, width = 300.dp)


        )


        {

            Text(text = "LOGIN")


        }
        Spacer(Modifier.height(10.dp))

        Text(
            text = "Paran",
            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "Dev",
            fontSize = 24.sp
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "Lab",
            fontSize = 24.sp
        )








    }






















}