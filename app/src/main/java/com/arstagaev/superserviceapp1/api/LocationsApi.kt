package com.arstagaev.superserviceapp1.api

import com.arstagaev.superserviceapp1.models.pojo.DefaultLocation
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET




interface LocationsApi {

    @GET("getTagData?format=defaultLocation&humanReadable=true&maxAge=5000/")
    suspend fun getAlfaRequest() : Response<DefaultLocation>



}