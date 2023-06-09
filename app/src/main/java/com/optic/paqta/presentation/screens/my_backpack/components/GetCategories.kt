package com.optic.paqta.presentation.screens.my_backpack.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.optic.paqta.domain.model.Response
import com.optic.paqta.presentation.components.ProgressBar
import com.optic.paqta.presentation.screens.my_backpack.MyBackpacksViewModel


@Composable
fun GetCategories(navController: NavHostController, viewModel: MyBackpacksViewModel = hiltViewModel()) {
    when (val response = viewModel.categoriesResponse) {
        Response.Loading -> {
            ProgressBar()
        }
        is Response.Success -> {
            MyBackpacksContent(navController = navController, categories = response.data)
        }
        is Response.Failure -> {
            Toast.makeText(LocalContext.current, response.exception?.message ?: "Error desconocido", Toast.LENGTH_LONG).show()
        }
        else -> {}
    }
}