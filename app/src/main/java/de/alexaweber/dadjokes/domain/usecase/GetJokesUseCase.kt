package de.alexaweber.dadjokes.domain.usecase

import de.alexaweber.dadjokes.data.model.JokeDto
import de.alexaweber.dadjokes.domain.repository.JokesRepository

class GetJokesUseCase(val repo: JokesRepository) {

    fun execute(): JokeDto {
        return repo.getRandomJoke()
    }
}