package com.iasa.sboh1214.toast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPopToastButtonClicked(view:View)
    {
        val toast: Toast = Toast.makeText(this,"Error",Toast.LENGTH_SHORT)

        //set toast's duration
        if (ShortRadio.isChecked)
        {
            toast.duration = Toast.LENGTH_SHORT
        }
        else if (LongRadio.isChecked)
        {
            toast.duration = Toast.LENGTH_LONG
        }

        //set toast's text
        toast.setText(ContentEdit.text)

        //set toast's gravity,offset
        val gravity:String = GravitySpinner.selectedItem as String
        val xOffset:Int =  XoffsetEdit.text.toString().toInt()
        val yOffset:Int = YoffsetEdit.text.toString().toInt()
        when(gravity)
        {
            "NO_GRAVITY" -> toast.setGravity(Gravity.NO_GRAVITY,xOffset,yOffset)
            "CENTER" -> toast.setGravity(Gravity.CENTER,xOffset,yOffset)
            "TOP" -> toast.setGravity(Gravity.TOP,xOffset,yOffset)
            "BOTTOM" -> toast.setGravity(Gravity.BOTTOM,xOffset,yOffset)
            "LEFT" -> toast.setGravity(Gravity.LEFT,xOffset,yOffset)
            "RIGHT" -> toast.setGravity(Gravity.RIGHT,xOffset,yOffset)
            "START" -> toast.setGravity(Gravity.START,xOffset,yOffset)
            "END" -> toast.setGravity(Gravity.END,xOffset,yOffset)
        }

        //set toast's margin
        val xMargin:Float = XmarginEdit.text.toString().toFloat()
        val yMargin:Float = YmarginEdit.text.toString().toFloat()
        toast.setMargin(xMargin,yMargin)

        toast.show()
    }
}
