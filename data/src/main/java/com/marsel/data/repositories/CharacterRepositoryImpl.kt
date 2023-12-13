package com.marsel.data.repositories

import com.marsel.data.base.BaseRepository
import com.marsel.data.remote.dtos.toDomain
import com.marsel.data.remote.services.CharactersApiService
import com.marsel.domain.models.CharacterModel
import com.marsel.domain.repositories.CharacterRepository
import com.marsel.domain.tools.Either
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val charactersApiService: CharactersApiService
) : CharacterRepository, BaseRepository() {

    override fun getCharacter(): Flow<Either<String, List<CharacterModel>>> = doRequest {
        charactersApiService.fetchCharacter().results.map { it.toDomain() }
    }
}