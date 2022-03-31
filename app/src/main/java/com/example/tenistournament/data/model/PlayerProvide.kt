package com.example.tenistournament.data.model

import javax.inject.Inject

class PlayerProvide @Inject constructor(private val playerModel: PlayerModel){
    companion object{

        val list = listOf<PlayerModel>(
            PlayerModel(0,"Player 1" , "50"),
            PlayerModel(1,"Player 2" , "60"),
            PlayerModel(2,"Player 3" , "20"),
            PlayerModel(3,"Player 4" , "80")
        )
    }
}