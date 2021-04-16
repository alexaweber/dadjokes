package de.alexaweber.dadjokes.domain.repository

import de.alexaweber.dadjokes.data.model.JokeDto

interface JokesRepository {

    fun getRandomJoke(): JokeDto
}