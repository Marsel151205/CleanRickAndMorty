package com.marsel.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.marsel.domain.models.CharacterModel
import com.marsel.domain.models.LocationModel
import com.marsel.domain.models.OriginModel

data class CharacterDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("origin")
    val origin: List<Origin>,
    @SerializedName("location")
    val location: List<Location>,
    @SerializedName("image")
    val image: String,
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("url")
    val url: String,
    @SerializedName("created")
    val created: String
)

data class Origin(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

fun CharacterDto.toDomain() = CharacterModel(
    id = id,
    name = name,
    status = status,
    species = species,
    type = type,
    gender = gender,
    origin = origin.map { it.toDomain() },
    location = location.map { it.toDomain() },
    image = image,
    episode = episode,
    url = url,
    created = created
)

fun Origin.toDomain() = OriginModel(
    name = name,
    url = url
)

fun Location.toDomain() = LocationModel(
    name = name,
    url = url
)
