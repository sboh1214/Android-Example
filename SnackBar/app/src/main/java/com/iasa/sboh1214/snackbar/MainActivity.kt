package com.iasa.sboh1214.snackbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View

class MainActivity : AppCompatActivity() {

    var snackbar:Snackbar?=null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPopSnackbarButtonClicked(view: View)
    {
        var snackbar:Snackbar = Snackbar.make(view,"Hello World",Snackbar.LENGTH_INDEFINITE)
        snackbar.show()
    }

    fun onDismissButtonClicked(view: View)
    {

    }
}
