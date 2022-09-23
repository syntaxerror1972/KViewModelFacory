package com.syntaxerror.kviewmodelfacory.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.syntaxerror.kviewmodelfacory.ui.MainViewModel

class MainViewModelFactory(val indexValue:Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(indexValue) as T
    }

}