package com.iasa.sboh1214.snackbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var snackbar:Snackbar?=null

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

        //set Snackbar's content and length
        snackbar = Snackbar.make(view,content,when(RadioGroup.checkedRadioButtonId)
        {
            ShortRadio.id -> Snackbar.LENGTH_SHORT
            LongRadio.id -> Snackbar.LENGTH_LONG
            IndefiniteRadio.id -> Snackbar.LENGTH_INDEFINITE
            else -> Snackbar.LENGTH_SHORT
        })

        //set Snackbar's action
        val actionContent:String = ActionContentEdit.text.toString()
        if (ActionSwitch.isChecked)
        {
            snackbar?.setAction(actionContent) {
                Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            }
        }

        snackbar?.show()
    }

    fun onDismissButtonClicked(view: View)
    {
        snackbar?.dismiss()
    }
}
