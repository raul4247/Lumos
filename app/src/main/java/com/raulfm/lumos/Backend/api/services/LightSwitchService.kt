package com.raulfm.lumos.Backend.api.services

import retrofit2.Call
import retrofit2.http.GET

interface LightSwitchService {
    @GET("/")
    fun switchLight(): Call<String>
}