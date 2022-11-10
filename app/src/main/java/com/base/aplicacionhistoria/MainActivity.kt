package com.base.aplicacionhistoria
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyToolbar().show(this, "Historia de América", false)
}

    //Método Empezar
    fun empezar(view: View?) {
        val empezar = Intent(this@MainActivity, exploracion1::class.java)
        startActivity(empezar)
    }

    fun informacion(view: View?) {
        val informacion = Intent(this@MainActivity, Informacion::class.java)
        startActivity(informacion)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
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
    }
}

