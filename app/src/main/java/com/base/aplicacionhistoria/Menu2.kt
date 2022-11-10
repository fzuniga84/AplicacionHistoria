package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class Menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        MyToolbar().show(this, "Historia de América", false)
    }

    //Método Origen
    fun origen(view: View?) {
        val origen = Intent(this@Menu2, Origen::class.java)
        startActivity(origen)
    }

    //Método Formas
    fun formas(view: View?) {
        val formas = Intent(this@Menu2, Formas::class.java)
        startActivity(formas)
    }

    //Método Organización
    fun organizacion(view: View?) {
        val organizacion = Intent(this@Menu2, Organizacion::class.java)
        startActivity(organizacion)
    }

    //Método Anterior
    fun antes(view: View?) {
        val antes = Intent(this@Menu2, MainActivity2::class.java)
        startActivity(antes)
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