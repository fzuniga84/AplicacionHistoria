package com.base.aplicacionhistoria

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_formas7.*

class Formas7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formas7)

        MyToolbar().show(this, "Historia de América", false)

        val c1 = findViewById<View>(R.id.opcion1) as CheckBox
        val c2 = findViewById<View>(R.id.opcion2) as CheckBox
        val c3 = findViewById<View>(R.id.opcion3) as CheckBox
        val c4 = findViewById<View>(R.id.opcion4) as CheckBox

        btn20.isEnabled = false;

        var cadena = ""
        if (opcion1.isChecked && opcion2.isChecked && opcion3.isChecked){

            cadena += "Una de sus respuestas es incorrecta"
            Toast.makeText(applicationContext, cadena, Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext, "Las opciones correctas son la 2, 3 y 4", Toast.LENGTH_SHORT).show()
            }

        if (opcion1.isChecked && opcion2.isChecked && opcion4.isChecked){
            cadena += "Una de sus respuestas es incorrecta"
            Toast.makeText(applicationContext, cadena, Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext, "Las opciones correctas son la 2, 3 y 4", Toast.LENGTH_SHORT).show()
            }

        if (opcion2.isChecked && opcion3.isChecked && opcion4.isChecked){
            cadena += "Todas sus respuestas son correctas... ¡Felicidades!"
            Toast.makeText(applicationContext, cadena, Toast.LENGTH_SHORT).show()
            }

        if (opcion1.isChecked && opcion3.isChecked && opcion4.isChecked){
            cadena += "Una de sus respuestas es incorrecta"
            Toast.makeText(applicationContext, cadena, Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext, "Las opciones correctas son la 2, 3 y 4", Toast.LENGTH_SHORT).show()
            }

        opcion1.isEnabled = false;
        opcion2.isEnabled = false;
        opcion3.isEnabled = false;
        opcion4.isEnabled = false;
        btn20.isEnabled = true;

    }

    fun sig(view: View?) {
        val sig = Intent(this@Formas7, Formas8::class.java)
        startActivity(sig)
    }

    fun ant(view: View?) {
        val ant = Intent(this@Formas7, Formas6::class.java)
        startActivity(ant)
    }

    fun Validar(view: View?) {

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