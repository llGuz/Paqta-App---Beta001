package com.optic.paqta.presentation.screens.posts

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.optic.paqta.presentation.screens.posts.components.DeleteLikePost
import com.optic.paqta.presentation.screens.posts.components.GetPosts
import com.optic.paqta.presentation.screens.posts.components.LikePost

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PostsScreen(navController: NavHostController, viewModel: PostsViewModel = hiltViewModel()) {
    
    Scaffold(
        content = {
            GetPosts(navController)
        }
    )
    LikePost()
    DeleteLikePost()
} 