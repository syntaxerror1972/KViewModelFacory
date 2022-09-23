package com.syntaxerror.kviewmodelfacory.ui

import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue:Int) : ViewModel(){
    var index = initialValue

    fun addOneToIndex(){
        index+=1
    }

    fun minusIndexByOne(){
        index-=1
    }
}