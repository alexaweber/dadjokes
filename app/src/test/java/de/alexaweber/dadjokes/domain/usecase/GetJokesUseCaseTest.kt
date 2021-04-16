package de.alexaweber.dadjokes.domain.usecase

import de.alexaweber.dadjokes.domain.repository.JokesRepository
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

internal class GetJokesUseCaseTest {

    @MockK(relaxed = true)
    lateinit var repo: JokesRepository

    lateinit var sut: GetJokesUseCase

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        sut = GetJokesUseCase(repo)
    }

    @Test
    fun `when usecase is executed calls repo`() {
        // Given

        // When
        sut.execute()

        // Then
        verify(exactly = 1) { repo.getRandomJoke() }
    }
}