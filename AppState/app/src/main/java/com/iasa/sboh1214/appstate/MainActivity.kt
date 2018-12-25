package com.iasa.sboh1214.appstate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart()
    {
        super.onStart()
        Log.i("TAG", "Start")
    }

    override fun onResume()
    {
        super.onResume()
        Log.i("TAG","Resume")
    }

    override fun onPause()
    {
        super.onPause()
        Log.i("TAG","Pause")
    }

    override fun onStop()
    {
        super.onStop()
        Log.i("TAG","Stop")
    }

    override fun onRestart()
    {
        super.onRestart()
        Log.i("TAG","Restart")
    }

    override fun onDestroy()
    {
        super.onDestroy()
        Log.i("TAG","Destroy")
    }
}
