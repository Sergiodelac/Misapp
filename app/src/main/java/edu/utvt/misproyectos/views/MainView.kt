package edu.utvt.misproyectos.views

import android.annotation.SuppressLint
import androidx.annotation.OptIn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import edu.utvt.misproyectos.components.BottomTitleBar
import edu.utvt.misproyectos.components.CustomFloatingActionButton
import edu.utvt.misproyectos.components.MainButton
import edu.utvt.misproyectos.components.MainTitle
import edu.utvt.misproyectos.components.TitleBar


@kotlin.OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainView(navController: NavController){
Scaffold(
    topBar={
        CenterAlignedTopAppBar(
            title = { TitleBar()},
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
            )
        )
    },

    bottomBar = {
        BottomAppBar(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.primary,
         ){
           BottomTitleBar()
        }
    },

    floatingActionButton = {
        CustomFloatingActionButton();
    }
){
    ContentDetails(navController)
}

}


@Composable
private fun ContentDetails(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainTitle()
        MainButton() {
            navController.navigate("exampleView");
        }
    }

}

