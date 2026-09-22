package com.paran.androidlearningjourney.jetpackcompose.layout


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.paran.androidlearningjourney.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowExample() {

    val context= LocalContext.current


    Column(modifier = Modifier.fillMaxSize()
        .padding(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center )



        {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
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

                Text(
                    text = "Paran",
                    fontSize = 24.sp
                )

                Text(
                    text = "Dev",
                    fontSize = 24.sp
                )

                Text(
                    text = "Lab",
                    fontSize = 24.sp
                )



                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "ArrowBack"
                )

                IconButton(
                    onClick = {},


                    ) {

                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu"
                    )


                }

                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo ",
                    modifier = Modifier.size(100.dp)
                        .padding(23.dp)


                )


                Text(
                    text = "Paran",
                    fontSize = 24.sp
                )

                Text(
                    text = "Dev",
                    fontSize = 24.sp
                )

                Text(
                    text = "Lab",
                    fontSize = 24.sp
                )






            }
            }

        }


