package com.example.tenistournament.domain.matchGames

import com.example.tenistournament.domain.PlayerSelect
import com.example.tenistournament.domain.model.DomainPlayerModel
import javax.inject.Inject

/*
esta funcion se encarga de decidir el ganador segun
su nivel de habilidad sumado al factor suerte
 */

class MatchGames @Inject constructor(
    private val playerSelect: PlayerSelect,
    private val playerSkills: DomainPlayerModel,
) {

    private val luckyFactor: Int = (0..100).random()

    private val playerNumberOne: Int = playerSkills.playerHability + luckyFactor
    private val playerNumberTwo: Int = playerSkills.playerHability + luckyFactor
    private val playerNumberThree: Int = playerSkills.playerHability + luckyFactor
    private val playerNumberFour: Int = playerSkills.playerHability + luckyFactor

    var firstWin: Int = 0
    var firstPlayerWin: String = ""
    var secondWin: Int = 0
    var secondPlayerWin: String = ""


    fun firstMatch(): String {
        playerSelect.getRandomMatches()
        if (playerNumberOne > playerNumberTwo) {
            firstWin = playerNumberOne
            firstPlayerWin = playerSkills.players[0]
            println("Ganador ${playerSkills.players[0]}")
        } else if (playerNumberOne < playerNumberTwo) {
            firstWin = playerNumberTwo
            firstPlayerWin = playerSkills.players[1]
            println("Ganador ${playerSkills.players[1]}")
        }
        if (playerNumberOne > playerNumberThree) {
            firstWin = playerNumberOne
            firstPlayerWin = playerSkills.players[0]
            println("Ganador ${playerSkills.players[0]}")
        } else if (playerNumberOne < playerNumberThree) {
            firstWin = playerNumberThree
            firstPlayerWin = playerSkills.players[2]
            println("Ganador ${playerSkills.players[2]}")
        }
        if (playerNumberOne > playerNumberFour) {
            firstWin = playerNumberOne
            firstPlayerWin = playerSkills.players[0]
            println("Ganador ${playerSkills.players[0]}")
        } else if (playerNumberOne < playerNumberFour) {
            firstWin = playerNumberFour
            firstPlayerWin = playerSkills.players[3]
            println("Ganador ${playerSkills.players[3]}")
        }
        return firstPlayerWin
    }

    fun secondMatch(): String {

        if (playerNumberThree > playerNumberFour) {
            secondWin = playerNumberThree
            secondPlayerWin = playerSkills.players[2]
            println("Ganador ${playerSkills.players[2]}")
        } else if (playerNumberThree < playerNumberFour) {
            secondWin = playerNumberFour
            secondPlayerWin = playerSkills.players[3]
            println("Ganador ${playerSkills.players[3]}")
        }
        if (playerNumberTwo > playerNumberFour) {
            secondWin = playerNumberTwo
            secondPlayerWin = playerSkills.players[1]
            println("Ganador ${playerSkills.players[1]}")
        } else if (playerNumberTwo < playerNumberFour) {
            secondWin = playerNumberFour
            secondPlayerWin = playerSkills.players[3]
            println("Ganador ${playerSkills.players[3]}")
        }
        if (playerNumberTwo > playerNumberThree) {
            secondWin = playerNumberTwo
            secondPlayerWin = playerSkills.players[1]
            println("Ganador ${playerSkills.players[1]}")
        } else if (playerNumberTwo < playerNumberThree) {
            secondWin = playerNumberThree
            secondPlayerWin = playerSkills.players[2]
            println("Ganador ${playerSkills.players[2]}")
        }
        return secondPlayerWin
    }
}