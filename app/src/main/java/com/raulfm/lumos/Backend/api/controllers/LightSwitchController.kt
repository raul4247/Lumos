package com.raulfm.lumos.Backend.api.controllers

import com.raulfm.lumos.Backend.api.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LightSwitchController {
    fun switchLight(ipAddress: String, port: String, onSuccess: () -> Unit, onFailure: () -> Unit) {
        val call = RetrofitConfig(ipAddress, port).lightSwitchService().switchLight()
        call?.enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>?, response: Response<String>?) {
                onSuccess()
            }

            override fun onFailure(call: Call<String>?, t: Throwable?) {
                onFailure()
            }
        })
    }
}