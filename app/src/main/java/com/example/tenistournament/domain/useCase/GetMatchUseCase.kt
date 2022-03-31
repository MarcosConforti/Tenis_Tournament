package com.example.tenistournament.domain.useCase

import com.example.tenistournament.data.model.PlayerModel
import com.example.tenistournament.domain.model.DomainPlayerModel
import javax.inject.Inject

//esta funcion se encarga de decidir el ganador segun su nivel de habilidad
class GetMatchUseCase @Inject constructor(
    private val getPlayersUseCase: GetPlayersUseCase,
    private val playerModel: PlayerModel,
    var winner: Int
) {


    private val playerOne = getPlayersUseCase.playerOneId
    private val playerTwo = getPlayersUseCase.playerTwoId
    private val playerTwoHability = playerModel.hability
    private val playerOneHability = playerModel.hability

    suspend fun MatchGame(): Int {
        if("50" in playerOneHability..playerTwoHability){
             winner = playerOne
        }else if(playerOneHability < "50" && playerTwoHability <= "50"){
             winner = playerTwo
        }
        return winner
    }
}