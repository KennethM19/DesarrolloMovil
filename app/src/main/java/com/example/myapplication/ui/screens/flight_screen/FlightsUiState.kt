package com.example.myapplication.ui.screens.flight_screen

import com.example.myapplication.model.Airport
import com.example.myapplication.model.Favorite

data class FlightsUiState(
    val code: String = "",
    val favoriteList: List<Favorite> = emptyList(),
    val destinationList: List<Airport> = emptyList(),
    val departureAirport: Airport = Airport(),
)