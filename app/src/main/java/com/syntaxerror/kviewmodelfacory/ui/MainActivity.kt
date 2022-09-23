package com.syntaxerror.kviewmodelfacory.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.syntaxerror.kviewmodelfacory.R
import com.syntaxerror.kviewmodelfacory.data.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var txtCounter : TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(5)).get(MainViewModel::class.java)
        txtCounter = findViewById(R.id.txtCounter)
        setIndexValue()
    }

    fun setIndexValue(){
        txtCounter.text = mainViewModel.index.toString()
    }

    fun addOneToIndex(view : View){
        mainViewModel.addOneToIndex()
        setIndexValue()
    }

    fun minusOneToIndex(view : View){
        mainViewModel.minusIndexByOne()
        setIndexValue()
    }
}