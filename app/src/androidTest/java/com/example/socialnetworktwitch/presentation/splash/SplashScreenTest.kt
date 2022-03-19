package com.example.socialnetworktwitch.presentation.splash

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.NavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.socialnetworktwitch.presentation.MainActivity
import com.example.socialnetworktwitch.presentation.ui.theme.SocialNetworkTwitchTheme
import com.example.socialnetworktwitch.presentation.util.Constants
import com.example.socialnetworktwitch.presentation.util.Screen
import com.plcoding.socialnetworktwitch.util.MainCoroutineScopeRule
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class SplashScreenTest{

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @RelaxedMockK
    lateinit var navController: NavController

    @Before
    fun setUp(){
        MockKAnnotations.init(this)
    }

    @Test
    fun splashScreen_displaysAndDissapear() = runBlockingTest{
        composeTestRule.setContent {
            SocialNetworkTwitchTheme {
                SplashScreen(navController = navController)
            }
        }

        composeTestRule
            .onNodeWithContentDescription("Logo")
            .assertExists()
    }
}