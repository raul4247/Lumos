package com.raulfm.lumos.backend

import android.R
import android.media.MediaPlayer
import com.raulfm.lumos.MainActivity


object SoundManager {
    fun playSound(soundResourceId: Int) {
        val mp: MediaPlayer = MediaPlayer.create(MainActivity.context, soundResourceId)
        mp.start()
    }
}