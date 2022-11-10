package com.base.aplicacionhistoria

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_origen2.*

class Origen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_origen2)

        MyToolbar().show(this, "Historia de América", false)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(vv1)

        val offLineUri = Uri.parse("android.resource://$packageName/${R.raw.origenpobladores}")

        vv1.setMediaController(mediaController)
        vv1.setVideoURI(offLineUri)
        vv1.requestFocus()
        vv1.start()

    }

    fun sig (view: View?) {
        val sig = Intent(this@Origen2, Origen3::class.java)
        startActivity(sig)
    }


    fun ant (view: View?) {
        val ant = Intent(this@Origen2, Origen::class.java)
        startActivity(ant)

    }



    override fun onCreateOptionsMenu(menus: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual2, menus)
        return super.onCreateOptionsMenu(menus)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.option_uno)
            startActivity(Intent(this, MainActivity::class.java))

        if (item.itemId == R.id.option_tres)
            startActivity(Intent(this, Origen::class.java))

        if (item.itemId == R.id.option_cuatro)
            startActivity(Intent(this, Formas::class.java))

        if (item.itemId == R.id.option_cinco)
            startActivity(Intent(this, Organizacion::class.java))

        return super.onOptionsItemSelected(item)
    }
}