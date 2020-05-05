package com.raulfm.lumos

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raulfm.lumos.Backend.SoundManager
import com.raulfm.lumos.Backend.api.RetrofitConfig
import com.raulfm.lumos.Backend.api.controllers.LightSwitchController
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    companion object {
        var context: Context? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = applicationContext
        setContentView(R.layout.activity_main)

        light_bulb_button.setOnClickListener { lightBulbClick() }
    }

    private fun lightBulbClick() {
        SoundManager.playSound(R.raw.lumos_sound_effect)

        LightSwitchController.switchLight("192.168.0.2", "3000",
            onSuccess = {
                print("ok")
            },
            onFailure = {
                print("not ok :(")
            }
        )
    }
}
