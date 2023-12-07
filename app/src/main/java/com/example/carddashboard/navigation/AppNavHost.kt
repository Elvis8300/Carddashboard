package com.example.carddashboard.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carddashboard.ui.theme.screens.home.HomeScreen
import com.example.carddashboard.ui.theme.screens.intents.intentsScreen
import com.example.catapp.ui.theme.screens.bmi.bmiScreen
import com.example.catapp.ui.theme.screens.calculator.calculatorScreen


@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUTE_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUTE_BMI) {
            bmiScreen(navController = navController)
        }

        composable(ROUTE_INTENTS) {
            intentsScreen(navController = navController)
        }

        composable(ROUTE_CALCULATOR) {
            calculatorScreen(navController = navController)
        }
    }
}









