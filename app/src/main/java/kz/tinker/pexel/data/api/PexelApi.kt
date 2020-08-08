package kz.tinker.pexel.data.api

import kz.tinker.pexel.data.model.Photo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface PexelApi {

    @GET("v1/photos/{id}")
    fun getPhoto(@Header("Authorization") apiKey: String, @Path("id") id: Int): Call<Photo>
}