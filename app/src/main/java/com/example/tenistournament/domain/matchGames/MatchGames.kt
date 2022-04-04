package com.example.tenistournament.domain.matchGames

import com.example.tenistournament.data.model.PlayerModel
import com.example.tenistournament.domain.PlayerSelect
import javax.inject.Inject

//esta funcion se encarga de decidir el ganador segun su nivel de habilidad
class MatchGames @Inject constructor(
    private val playerSelect: PlayerSelect,
    private val playerSkills: PlayerModel,
) {

    private val luckyFactor: Int = (0..100).random()

    private val playerNumberOne: Int = playerSkills.playerOneHability + luckyFactor
    private val playerNumberTwo: Int = playerSkills.playerTwoHability + luckyFactor
    private val playerNumberThree: Int = playerSkills.playerThreeHability + luckyFactor
    private val playerNumberFour: Int = playerSkills.playerFourHability + luckyFactor

    var firstWin: Int = 0
    var firstPlayerWin: String = ""
    var secondWin: Int = 0
    var secondPlayerWin: String = ""


    fun firstMatch(): String {
        playerSelect.getRandomMatches()
        if (playerNumberOne > playerNumberTwo) {
            firstWin = playerNumberOne
            firstPlayerWin = playerSkills.playerOne
            println("Ganador $playerSkills.playerOne")
        } else if (playerNumberOne < playerNumberTwo) {
            firstWin = playerNumberTwo
            firstPlayerWin = playerSkills.playerTwo
            println("Ganador $playerSkills.playerTwo")
        }
        if (playerNumberOne > playerNumberThree) {
            firstWin = playerNumberOne
            firstPlayerWin = playerSkills.playerOne
            println("Ganador $playerSkills.playerOne")
        } else if (playerNumberOne < playerNumberThree) {
            firstWin = playerNumberThree
            firstPlayerWin = playerSkills.playerThree
            println("Ganador $playerSkills.playerThree")
        }
        if (playerNumberOne > playerNumberFour) {
            firstWin = playerNumberOne
            firstPlayerWin = playerSkills.playerOne
            println("Ganador $playerSkills.playerOne")
        } else if (playerNumberOne < playerNumberFour) {
            firstWin = playerNumberFour
            firstPlayerWin = playerSkills.playerFour
            println("Ganador $playerSkills.playerFour")
        }
        return firstPlayerWin
    }

    fun SecondMatch(): String {

        if (playerNumberThree > playerNumberFour) {
            secondWin = playerNumberThree
            secondPlayerWin = playerSkills.playerThree
            println("Ganador ${playerSkills.playerThree}")
        } else if (playerNumberThree < playerNumberFour) {
            secondWin = playerNumberFour
            secondPlayerWin = playerSkills.playerFour
            println("Ganador ${playerSkills.playerFour}")
        }
        if (playerNumberTwo > playerNumberFour) {
            secondWin = playerNumberTwo
            secondPlayerWin = playerSkills.playerTwo
            println("Ganador ${playerSkills.playerTwo}")
        } else if (playerNumberTwo < playerNumberFour) {
            secondWin = playerNumberFour
            secondPlayerWin = playerSkills.playerFour
            println("Ganador ${playerSkills.playerFour}")
        }
        if (playerNumberTwo > playerNumberThree) {
            secondWin = playerNumberTwo
            secondPlayerWin = playerSkills.playerTwo
            println("Ganador ${playerSkills.playerTwo}")
        } else if (playerNumberTwo < playerNumberThree) {
            secondWin = playerNumberThree
            secondPlayerWin = playerSkills.playerThree
            println("Ganador ${playerSkills.playerThree}")
        }
        return secondPlayerWin
    }
}