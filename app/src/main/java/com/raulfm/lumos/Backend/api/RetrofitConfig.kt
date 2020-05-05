package com.raulfm.lumos.Backend.api

import com.raulfm.lumos.Backend.api.services.LightSwitchService
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitConfig {
    private val retrofit: Retrofit

    constructor(ipAddress: String, port: String) {
        val url = buildUrl(ipAddress, port)
        retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }

    private fun buildUrl(ipAddress: String, port: String): String {
        return "http://$ipAddress:$port"
    }

    fun lightSwitchService() = retrofit.create(LightSwitchService::class.java)
}