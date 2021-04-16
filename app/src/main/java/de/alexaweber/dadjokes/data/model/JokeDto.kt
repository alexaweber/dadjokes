package de.alexaweber.dadjokes.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JokeDto(
    @Json(name = "joke")
    val jokeDto: String
)
