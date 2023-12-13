package com.marsel.data.remote.services

import com.marsel.data.remote.dtos.CharactersResponse
import retrofit2.http.GET

interface CharactersApiService {

    @GET("/character")
    suspend fun fetchCharacter(): CharactersResponse
}