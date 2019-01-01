package com.iasa.sboh1214.snackbar

import android.drm.DrmStore
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActionSwitch.setOnCheckedChangeListener{ _, isChecked ->
            ActionSwitchText.text = when (ActionSwitch.isChecked)
            {
                true -> getString(R.string.On)
                false -> getString(R.string.Off)
            }
            ActionContentEdit.isEnabled = when (ActionSwitch.isChecked)
            {
                true -> true
                false -> false
            }
        }
    }

    fun onPopSnackbarButtonClicked(view: View)
    {
        val content:String = ContentEdit.text.toString()
        val snackbar:Snackbar?

        //set Snackbar's content and length
        if (ShortRadio.isChecked)
        {
            snackbar = Snackbar.make(view,content,Snackbar.LENGTH_SHORT)
        }
        else if (LongRadio.isChecked)
        {
            snackbar = Snackbar.make(view,content,Snackbar.LENGTH_LONG)
        }
        else if (IndefiniteRadio.isChecked)
        {
            snackbar = Snackbar.make(view,content,Snackbar.LENGTH_INDEFINITE)
        }
        else
        {
            snackbar = Snackbar.make(view,"Error",Snackbar.LENGTH_SHORT)
        }

        //set Snackbar's action
        val actionContent:String = ActionContentEdit.text.toString()
        if (ActionSwitch.isChecked)
        {
            snackbar.setAction(actionContent,View.OnClickListener
            {
                Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            })
        }

        snackbar.show()
    }

    fun onDismissButtonClicked(view: View)
    {

    }
}
