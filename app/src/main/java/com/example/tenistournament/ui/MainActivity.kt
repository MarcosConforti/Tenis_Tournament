package com.example.tenistournament.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.tenistournament.R
import com.example.tenistournament.ui.viewModel.TournamentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val tournamentViewModel:TournamentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tournamentViewModel.getWinner()

        tournamentViewModel.tournamentLiveData.observe(this, Observer { it })
    }
}