package com.marsel.domain.usecases

import com.marsel.domain.repositories.CharacterRepository
import javax.inject.Inject

class CharacterUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) {

    operator fun invoke() = characterRepository.getCharacter()
}