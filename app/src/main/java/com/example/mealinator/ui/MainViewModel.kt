package com.example.mealinator.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealinator.entities.Receita
import com.example.mealinator.services.repository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val receita = MutableLiveData<List<Receita>>()

    fun getReceita() {
        try {
            viewModelScope.launch {
                receita.value = repository.getReceitaRepo().listaReceitas
            }
        } catch (exception: Exception) {
            Log.e("MainViewModel", exception.toString())
        }
    }
}