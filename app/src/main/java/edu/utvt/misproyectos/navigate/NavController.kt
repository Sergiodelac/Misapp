package edu.utvt.misproyectos.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.utvt.misproyectos.views.ExampleView
import edu.utvt.misproyectos.views.MainView


@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainView"){

        composable("mainView"){
            MainView(navController = navController)
        }

        composable("exampleView"){
            ExampleView(navController = navController)
        }
    }
}

