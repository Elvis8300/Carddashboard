package com.example.carddashboard.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.carddashboard.R
import com.example.carddashboard.navigation.ROUTE_BMI
import com.example.carddashboard.navigation.ROUTE_CALCULATOR
import com.example.carddashboard.navigation.ROUTE_INTENTS
import com.example.carddashboard.ui.theme.CardDashboardTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Text(
            text = "Dashboard Design",
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, bottom = 20.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Column (
            modifier= Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            )
            {
                Card (modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation=CardDefaults.cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.DarkGray),
                    onClick = {
                        navController.navigate(ROUTE_INTENTS)
                    }
                )
                {
                    Column (
                        modifier=Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    )
                    {
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center


                        ){
                            Icon(painter = painterResource(id =
                            R.drawable.baseline_phone_android_24_pro),
                                contentDescription = "My icon",
                                tint = Color.White
                            )
                        }
                        Column(modifier= Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly

                        ) {
                            Text(text = "Intents")

                        }
                    }
                }

                Card (modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation=CardDefaults.cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Cyan),

                    onClick = {
                        navController.navigate(ROUTE_CALCULATOR)
                    }
                )
                {
                    Column (
                        modifier=Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    )
                    {
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center

                        ){
                            Icon(painter = painterResource(id =
                            R.drawable.baseline_phone_android_24_pro),
                                contentDescription = "My icon",
                                tint = Color.White
                            )
                        }
                        Column(modifier= Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly

                        ) {

                            Text(text = "My calculator")

                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            )
            {
                Card(
                    modifier = Modifier
                        .width(165.dp)
                        .height(200.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Yellow),
                    onClick = {
                        navController.navigate(ROUTE_BMI)
                    }

                )


                {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    )
                    {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center


                        ) {
                            Icon(
                                painter = painterResource(
                                    id =
                                    R.drawable.baseline_phone_android_24_pro),
                                contentDescription = "My icon",
                                tint = Color.White
                            )
                        }
                        Column(
                            modifier = Modifier
                                .background(Color.White)
                                .fillMaxWidth()
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly

                        ) {

                            Text(text = "Bmi Scale")

                        }
                    }
                }


            }
        }

    }
}







@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    CardDashboardTheme{
        HomeScreen(rememberNavController() )
    }
}
