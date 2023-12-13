package com.marsel.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class CharactersResponse(
    val info: Info,
    @SerializedName("results")
    val results: List<CharacterDto>
)

data class Info(
    @SerializedName("count")
    val count: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("prev")
    val prev: String
)
