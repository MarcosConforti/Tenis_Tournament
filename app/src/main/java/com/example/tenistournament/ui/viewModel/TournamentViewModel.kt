package com.example.tenistournament.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tenistournament.domain.model.DomainPlayerModel
import com.example.tenistournament.domain.useCase.GetMatchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class TournamentViewModel(private val getMatchUseCase: GetMatchUseCase):ViewModel() {

   val tournamentLiveData = MutableLiveData<DomainPlayerModel>()

    //esta funcion se encarga mostrar el ganador
    fun getWinner(){
        viewModelScope.launch {
          val result = getMatchUseCase.winner
            tournamentLiveData.value = result
        }
    }
}