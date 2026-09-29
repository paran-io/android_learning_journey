package com.paran.androidlearningjourney.jetpackcompose.button


import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HomeWork
import androidx.compose.material.icons.filled.MenuOpen
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun IconButtonExample() {

    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()
        .padding(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        IconButton(onClick = {
            Toast.makeText(
                context,"Menu Open Icon Button ",
                Toast.LENGTH_LONG
            ).show()



        }

        ) {

            Icon(imageVector = Icons.Default.MenuOpen,
                contentDescription = "Menu Open")


        }


        IconButton(onClick = {}

        ) {

            Icon(imageVector = Icons.Default.HomeWork,
                contentDescription = "Home Work")


        }

        Spacer(modifier = Modifier.height(10.dp))
        //=================== Normal Clickable Icon ================//


        Icon(imageVector = Icons.Default.MenuOpen,
            contentDescription = "Menu Open",
            modifier = Modifier.clickable(onClick = {
                Toast.makeText(
                    context,"Menu Open Icon Button ",
                    Toast.LENGTH_LONG
                ).show()

            })
            )

        Icon(imageVector = Icons.Default.HomeWork,
            contentDescription = "Home Work",
            modifier = Modifier.clickable {
                Toast.makeText(
                    context,"Home Work Icon Button ",
                    Toast.LENGTH_LONG
                ).show()

            }

        )








    }
}