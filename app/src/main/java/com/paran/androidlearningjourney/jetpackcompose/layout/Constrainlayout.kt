package com.paran.androidlearningjourney.jetpackcompose.layout


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ConstraintLayoutsExample() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 100.dp)
        .background(color = Color.LightGray.copy(alpha = 0.7f)),


    ){


        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
        ) {

            val (heading,
                title,
                button) = createRefs()

            Text(
                text = "Heading",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.constrainAs(heading) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top, margin = 20.dp)
                }
            )

            Text(
                text = "Title",
                fontSize = 16.sp,
                modifier = Modifier.constrainAs(title) {

                    top.linkTo(heading.bottom,margin = 8.dp)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints //Occupy Available Width
                }
            )

            Button(
                onClick = {},
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(title.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            ) {
                Text(text = "Click Here")


            }
        }
    }

}
