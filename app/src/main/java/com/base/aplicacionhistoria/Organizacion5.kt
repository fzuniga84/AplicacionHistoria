package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exploracion1.*
import kotlinx.android.synthetic.main.activity_organizacion4.*
import kotlinx.android.synthetic.main.activity_organizacion5.*
import kotlinx.android.synthetic.main.activity_exploracion1.resp1 as resp11
import kotlinx.android.synthetic.main.activity_exploracion1.resp3 as resp31
import kotlinx.android.synthetic.main.activity_organizacion4.resp2 as resp21
import kotlinx.android.synthetic.main.activity_organizacion5.resp1 as resp11
import kotlinx.android.synthetic.main.activity_organizacion5.resp2 as resp21
import kotlinx.android.synthetic.main.activity_organizacion5.resp3 as resp31

class Organizacion5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organizacion5)

        MyToolbar().show(this, "Historia de América", false)

        btn28.isEnabled = false;

        rg10.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.resp1)
                Toast.makeText(this@Organizacion5, "Lo has hecho muy bien, felicidades...", Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.resp2){
                Toast.makeText(this@Organizacion5, "Vaya, aún te falta aprender...", Toast.LENGTH_SHORT).show()
                Toast.makeText(this@Organizacion5, "La opción correcta era la primera", Toast.LENGTH_SHORT).show()
            }

            if (checkedId == R.id.resp3){
                Toast.makeText(this@Organizacion5, "Vaya, aún te falta aprender...", Toast.LENGTH_SHORT).show()
                Toast.makeText(this@Organizacion5, "La opción correcta era la primera", Toast.LENGTH_SHORT).show()
            }
            resp1.isEnabled = false;
            resp2.isEnabled = false;
            resp3.isEnabled = false;
            btn28.isEnabled = true;
        }

    }

    fun sig (view: View?) {
        val sig = Intent(this@Organizacion5, Organizacion6::class.java)
        startActivity(sig)
    }

    fun ant (view: View?) {
        val ant = Intent(this@Organizacion5, Organizacion4::class.java)
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