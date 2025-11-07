package com.example.myapplication.ui.screens.search

import com.example.myapplication.model.Airport
import com.example.myapplication.model.Favorite

data class SearchUiState(
    val searchQuery: String = "",
    val selectedCode: String = "",
    val airportList: List<Airport> = emptyList(),
    val favoriteList: List<Favorite> = emptyList(),
)