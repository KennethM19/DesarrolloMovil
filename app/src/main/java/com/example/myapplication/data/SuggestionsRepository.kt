package com.example.myapplication.data

import com.example.myapplication.R

object SuggestionsRepository {
    val suggestions = listOf(
        Suggestion(
            day = 1,
            title = R.string.tittle1,
            description = R.string.description1,
            imageResId = R.drawable.day1
        ),
        Suggestion(
            day = 2,
            title = R.string.tittle2,
            description = R.string.description2,
            imageResId = R.drawable.day2
        ),
        Suggestion(
            day = 3,
            title = R.string.tittle3,
            description = R.string.description3,
            imageResId = R.drawable.day2
        ),
        Suggestion(
            day = 4,
            title = R.string.tittle4,
            description = R.string.description4,
            imageResId = R.drawable.day2
        ),

        )
}