package com.base.aplicacionhistoria

import androidx.appcompat.app.AppCompatActivity

class MyToolbar {

    fun show (activities : AppCompatActivity, title:String, upBotton:Boolean){
        activities.setSupportActionBar(activities.findViewById(R.id.toolbar))
        activities.supportActionBar?.title = title
        activities.supportActionBar?.setDisplayHomeAsUpEnabled(upBotton)
    }

}