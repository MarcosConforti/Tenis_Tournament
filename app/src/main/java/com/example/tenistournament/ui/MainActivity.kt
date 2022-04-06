package com.example.tenistournament.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tenistournament.R
import com.example.tenistournament.domain.matchGames.FinalGame
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var playerWin: FinalGame

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWin()
    }
    private fun getWin(): String {
        return playerWin.finalGame()
    }

}