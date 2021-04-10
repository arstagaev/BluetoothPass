package com.arstagaev.superserviceapp1.models.pojo


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("tagId")
    val tagId: String,
    @SerializedName("tagName")
    val tagName: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("tagGroupName")
    val tagGroupName: String,
    @SerializedName("locationType")
    val locationType: String,
    @SerializedName("locationMovementStatus")
    val locationMovementStatus: String,
    @SerializedName("locationRadius")
    val locationRadius: Double,
    @SerializedName("location")
    val location: List<Double>,
    @SerializedName("locationTS")
    val locationTS: Long,
    @SerializedName("locationCoordSysId")
    val locationCoordSysId: String,
    @SerializedName("locationCoordSysName")
    val locationCoordSysName: String,
    @SerializedName("locationZoneIds")
    val locationZoneIds: List<Any>,
    @SerializedName("locationZoneNames")
    val locationZoneNames: List<Any>
)