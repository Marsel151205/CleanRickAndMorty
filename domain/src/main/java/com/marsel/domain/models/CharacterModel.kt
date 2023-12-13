package com.marsel.domain.models


data class CharacterModel(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: List<OriginModel>,
    val location: List<LocationModel>,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

data class OriginModel(
    val name: String,
    val url: String
)

data class LocationModel(
    val name: String,
    val url: String
)
