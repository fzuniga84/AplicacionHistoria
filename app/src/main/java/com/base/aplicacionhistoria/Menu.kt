package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

abstract class Menu : AppCompatActivity(), Menu {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        MyToolbar().show(this, "Historia de América", false)

    }

    //Método Origen
    fun origen(view: View?) {
        val origen = Intent(this@Menu, Origen::class.java)
        startActivity(origen)
    }

    //Método Formas
    fun formas(view: View?) {
        val formas = Intent(this@Menu, Formas::class.java)
        startActivity(formas)
    }

    //Método Organización
    fun organizacion(view: View?) {
        val organizacion = Intent(this@Menu, Organizacion::class.java)
        startActivity(organizacion)
    }

    //Método Anterior
    fun ant(view: View?) {
        val ant = Intent(this@Menu, MainActivity2::class.java)
        startActivity(ant)
    }

  /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual, menu)
        return super.onCreateOptionsMenu(menu)
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

        if (item.itemId == R.id.option_seis)
            finish()

        return super.onOptionsItemSelected(item)
    }**/

}