package com.arstagaev.superserviceapp1.models.pojo


import com.google.gson.annotations.SerializedName

data class DefaultLocation(
    @SerializedName("code")
    val code: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("command")
    val command: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("responseTS")
    val responseTS: Long,
    @SerializedName("version")
    val version: String,
    @SerializedName("formatId")
    val formatId: String,
    @SerializedName("formatName")
    val formatName: String,
    @SerializedName("tags")
    val tags: List<Tag>
)