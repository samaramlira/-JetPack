package com.example.jetpackexercicio

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val contador = MutableLiveData<Int>(0)

    fun adicionar(){
        contador.value = contador.value?.plus(1)
    }
}