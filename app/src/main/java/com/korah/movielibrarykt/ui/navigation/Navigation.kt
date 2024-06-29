package com.korah.movielibrarykt.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
object MainScreen

@Serializable
data class DetailScreen(val id: String)