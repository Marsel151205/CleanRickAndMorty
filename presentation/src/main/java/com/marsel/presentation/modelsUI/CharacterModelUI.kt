package com.marsel.presentation.modelsUI

import com.marsel.domain.models.CharacterModel
import com.marsel.domain.models.LocationModel
import com.marsel.domain.models.OriginModel

data class CharacterModelUI(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: List<OriginModelUI>,
    val location: List<LocationModelUI>,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

data class OriginModelUI(
    val name: String,
    val url: String
)

data class LocationModelUI(
    val name: String,
    val url: String
)

fun CharacterModel.toUI() = CharacterModelUI(
    id = id,
    name = name,
    status = status,
    species = species,
    type = type,
    gender = gender,
    origin = origin.map { it.toUI() },
    location = location.map { it.toUI() },
    image = image,
    episode = episode,
    url = url,
    created = created
)

fun OriginModel.toUI() = OriginModelUI(
    name = name,
    url = url
)

fun LocationModel.toUI() = LocationModelUI(
    name = name,
    url = url
)