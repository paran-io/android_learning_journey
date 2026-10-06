package com.paran.androidlearningjourney.jetpackcompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
 fun ConstraintLayoutChain() {



Column(modifier = Modifier.fillMaxSize()
    .padding(top=100.dp)
    .background(color = Color.Green),


) {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
            .padding(top = 16.dp)
            




    ) {

        val(box1,
            box2,
            box3,
            box4,
            box5,
            box6,
            )= createRefs()

        Box(
            modifier = Modifier
                .background(color = Color.Cyan)
                .size(50.dp)
                .constrainAs(box1){}


        )
        Box(
            modifier = Modifier
                .background(color = Color.Gray)
                .size(50.dp)
                .constrainAs(box2){}

        )
        Box(
            modifier = Modifier
                .background(color = Color.LightGray)
                .size(50.dp)
                .constrainAs(box3){}

        )
        Box(
            modifier = Modifier
                .background(color = Color.DarkGray)
                .size(50.dp)
                .constrainAs(box4){}

        )
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .size(50.dp)
                .constrainAs(box5){}

        )
        Box(
            modifier = Modifier
                .background(color = Color.Red)
                .size(50.dp)
                .constrainAs(box6){}

        )

        createHorizontalChain(box1,box2,box3,box4,box5,box6,
            chainStyle = ChainStyle.Spread




        )






    }
 }

 }




