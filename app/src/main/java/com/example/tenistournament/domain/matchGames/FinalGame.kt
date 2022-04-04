package com.example.tenistournament.domain.matchGames

import com.example.tenistournament.data.model.PlayerModel
import javax.inject.Inject

//Aqui se sortearan los rivales
class FinalGame @Inject constructor(private val matchGames: MatchGames) {

    private val playerWin: Int = matchGames.firstWin
    private val secondWin: Int = matchGames.secondWin
    private val firstWinName = matchGames.firstPlayerWin
    private val secondWinName = matchGames.secondPlayerWin
    var winner = ""

    fun finalGame(): String {
        if (playerWin > secondWin) {
            winner = firstWinName
            println("Ganador $firstWinName")
        } else {
            winner = secondWinName
            println("Ganador $secondWinName")
        }
        return winner
    }

}