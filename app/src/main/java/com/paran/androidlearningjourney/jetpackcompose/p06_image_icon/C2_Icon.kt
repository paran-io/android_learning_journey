package com.paran.androidlearningjourney.jetpackcompose.p06_image_icon


import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun IconExample() {

    Column(modifier=Modifier
        .fillMaxSize()
        .padding(top = 20.dp, start = 12.dp, end = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)




    ) {



        Box(
            modifier = Modifier.size(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.fillMaxSize(),
                tint = Color.Green
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically


        ) {



            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )


            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )




        }

        //============Column Icon==============//


        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally


        ) {



            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )


            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.size(100.dp),
                tint = Color.Green
            )

        }











    }


}

