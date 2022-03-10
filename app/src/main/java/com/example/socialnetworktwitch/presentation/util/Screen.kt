package com.example.socialnetworktwitch.presentation.util

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object LoginScreen: Screen("login_screen")
    object RegisterScreen: Screen("register_screen")
    object MainFeedScreen: Screen("mainFeed_screen")
    object PostDetailScreen: Screen("postDetail_screen")
    object ChatScreen: Screen("chat_screen")
    object MessageScreen: Screen("message_screen")
    object ProfileScreen: Screen("profile_screen")
    object EditProfileScreen: Screen("editProfile_screen")
    object PersonListScreen: Screen("personList_screen")
    object CreatePostScreen: Screen("createPost_screen")
    object ActivityScreen: Screen("activity_screen")
    object SearchScreen: Screen("search_screen")
}
