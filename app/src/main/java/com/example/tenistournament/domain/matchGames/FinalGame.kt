package com.example.tenistournament.domain.matchGames

import javax.inject.Inject

//Aqui se sortearan los rivales
class FinalGame @Inject constructor(matchGames: MatchGames) {

    private val playerWin: Int = matchGames.firstWin
    private val secondWin: Int = matchGames.secondWin
    private val firstWinName = matchGames.firstMatch()
    private val secondWinName = matchGames.secondMatch()
     var winner: String = ""

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