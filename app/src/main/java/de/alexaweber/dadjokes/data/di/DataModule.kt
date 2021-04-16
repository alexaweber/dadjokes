package de.alexaweber.dadjokes.data.di

import de.alexaweber.dadjokes.data.model.JokeDto
import de.alexaweber.dadjokes.data.repository.JokesRepositoryImpl
import de.alexaweber.dadjokes.domain.repository.JokesRepository
import org.koin.dsl.module

private val repositoryModule = module {
    single<JokesRepository> { JokesRepositoryImpl() }
    single { JokeDto(get()) }
}

val datamodules = repositoryModule
