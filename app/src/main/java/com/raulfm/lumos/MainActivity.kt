package com.raulfm.lumos

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raulfm.lumos.backend.SoundManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    companion object{
        var context: Context? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = applicationContext
        setContentView(R.layout.activity_main)

        light_bulb_button.setOnClickListener{ lightBulbClick() }
    }

    private fun lightBulbClick() {
        SoundManager.playSound(R.raw.lumos_sound_effect)
    }
}
