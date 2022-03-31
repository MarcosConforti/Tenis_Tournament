package com.example.tenistournament.domain.useCase

import android.widget.Toast
import com.example.tenistournament.data.model.PlayerModel
import com.example.tenistournament.data.model.PlayerProvide
import com.example.tenistournament.data.model.PlayerProvide.Companion.list
import javax.inject.Inject

//Aqui se sortearan los rivales
class GetPlayersUseCase @Inject constructor(private val playerProvide: PlayerProvide,
                                            private val playerModel: PlayerModel) {
    //sera de manera aleatoria mendiante un numero ramdom que coincida con el id del jugador
    private val randomNumber:Int = (0..3).random()
     val playerOneId = playerModel.id
     val playerOneHability = playerModel.hability
     val playerTwoId = playerModel.id
     val playerTwoHability = playerModel.hability

     suspend fun ramdonPlayerOne(): Int {
         if (playerOneId == randomNumber && playerTwoId == randomNumber && playerTwoId != playerOneId) {
             val playerOneSelected = playerOneId
             val playerTwoSelected = playerTwoId
         }
         return ramdonPlayerOne()
     }
}