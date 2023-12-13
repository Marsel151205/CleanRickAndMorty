package com.marsel.rickandmorty.di

import com.marsel.data.repositories.CharacterRepositoryImpl
import com.marsel.domain.repositories.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideCharacterRepository(characterRepositoryImpl: CharacterRepositoryImpl): CharacterRepository
}