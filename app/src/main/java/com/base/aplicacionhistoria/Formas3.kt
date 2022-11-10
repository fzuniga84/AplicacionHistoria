package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class Formas3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formas3)

        MyToolbar().show(this, "Historia de América", false)

    }

    fun sig (view: View?) {
        val sig = Intent(this@Formas3, Formas4::class.java)
        startActivity(sig)
    }

    fun ant (view: View?) {
        val ant = Intent(this@Formas3, Formas2::class.java)
        startActivity(ant)
        finish()
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