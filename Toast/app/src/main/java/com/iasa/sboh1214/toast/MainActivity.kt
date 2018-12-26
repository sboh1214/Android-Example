package com.iasa.sboh1214.toast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        //set toast's location

        toast.show()
    }
}
