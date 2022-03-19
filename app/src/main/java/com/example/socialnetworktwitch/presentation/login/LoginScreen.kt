package com.example.socialnetworktwitch.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.socialnetworktwitch.R
import com.example.socialnetworktwitch.presentation.ui.theme.paddingMedium

@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = paddingMedium),
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = stringResource(id = R.string.Login),
            color = MaterialTheme.colors.onBackground
        )
    }
}