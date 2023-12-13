package com.marsel.domain.repositories

import com.marsel.domain.models.CharacterModel
import com.marsel.domain.tools.Either
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacter(): Flow<Either<String, List<CharacterModel>>>
}