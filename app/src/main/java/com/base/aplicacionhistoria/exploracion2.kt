package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exploracion2.*
import www.sanju.motiontoast.MotionToast
import kotlin.system.exitProcess


class exploracion2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exploracion2)

        MyToolbar().show(this, "Historia de América", false)

       btn4.isEnabled = false;

        rg2.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.resp01){
                //Toast.makeText(this@exploracion2, "Vaya, aún te falta aprender...", Toast.LENGTH_SHORT).show()
                MotionToast.createToast(this, "Vaya, te has equivocado!", "La opción correcta era la tercera", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
            }
            if (checkedId == R.id.resp02){
                MotionToast.createToast(this, "Vaya, te has equivocado!", "La opción correcta era la tercera", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
            }
            if (checkedId == R.id.resp03)
                MotionToast.createToast(this, "Respuesta Correcta!", "Lo has hecho muy bien, felicidades", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
            resp01.isEnabled = false;
            resp02.isEnabled = false;
            resp03.isEnabled = false;
                btn4.isEnabled = true;


    }
}

    //Método Siguiente
    fun sig2 (view: View?) {
        val sig2 = Intent(this@exploracion2, Exploracion3::class.java)
        startActivity(sig2)
    }

    //Método Anterior
    fun ant2 (view: View?) {
        val ant2 = Intent(this@exploracion2, exploracion1::class.java)
        startActivity(ant2)
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