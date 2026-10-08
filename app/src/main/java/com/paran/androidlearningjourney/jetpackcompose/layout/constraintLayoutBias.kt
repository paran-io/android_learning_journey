package com.paran.androidlearningjourney.jetpackcompose.layout

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HorizontalBias() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top =50.dp)
        .background(color = Color.Green.copy(alpha = 0.9f)),


        ){


        ConstraintLayout(
            modifier = Modifier
                .size(500.dp)

        ) {

            val (heading,
                paran,
                devLab,

                button) = createRefs()

            Text(
                text = "Heading",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(heading) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    horizontalBias= 0.9f

                }
            )
            Text(
                text = "Paran",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(paran) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom, margin = 150.dp)
                    horizontalBias=0.8f // 80%


                }
            )
            Text(
                text = "DevLab",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(devLab) {
                    top.linkTo(paran.bottom)
                    end.linkTo(paran.start)


                  /*  start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    horizontalBias=0.7f*/





                }
            )



            Button(
                onClick = {},
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    verticalBias=0.5f // 50%


                }
            ) {
                Text(text = "Click Here",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)


            }
        }
    }

}


// Vertical Bias



@Composable
fun VerticalBias() {



        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.Yellow.copy(alpha = 0.8f))
                .padding(16.dp)



            ) {

            val (kmp,
                paran,
                devLab,
                button) = createRefs()

            Text(
                text = "Kotlin Multiplatform",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(kmp) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    verticalBias=0.4f

                }
            )
            Text(
                text = "Paran",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(paran) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    verticalBias=0.7f




                }
            )
            Text(
                text = "DevLab",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(devLab) {
                    top.linkTo(paran.bottom)
                    start.linkTo(paran.end)


                  /*  top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    verticalBias=0.6f // 60%  */






                }
            )



            Button(
                onClick = {},
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    verticalBias=0.5f // 50%


                }
            ) {
                Text(text = "CMP",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)




            }
        }
    }



