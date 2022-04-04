package com.example.tenistournament.data.model

data class PlayerModel(
    val playerOne: String = "PlayerOne",
    val playerOneHability: Int = (0..100).random(),
    val playerTwo: String = "PlayerTwo",
    val playerTwoHability: Int = (0..100).random(),
    val playerThree: String = "PlayerThree",
    val playerThreeHability: Int = (0..100).random(),
    val playerFour: String = "PlayerFour",
    val playerFourHability: Int = (0..100).random()
)
