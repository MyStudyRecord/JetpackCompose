package com.pss.jetpackcomposestudy

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val testFieldState = MutableLiveData("")

    fun onTextChanged(newText : String){
        testFieldState.value = newText
    }
}