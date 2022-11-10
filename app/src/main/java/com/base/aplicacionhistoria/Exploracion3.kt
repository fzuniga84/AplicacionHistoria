package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exploracion3.*
import www.sanju.motiontoast.MotionToast


class Exploracion3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exploracion3)

        MyToolbar().show(this, "Historia de América", false)

        btn6.isEnabled = false;

        rg3.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.resp001)
                MotionToast.createToast(this, "Respuesta Correcta!", "Lo has hecho muy bien, felicidades", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)

            if (checkedId == R.id.resp002){
                MotionToast.createToast(this, "Vaya, te has equivocado!", "La opción correcta era la primera", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
            }
            if (checkedId == R.id.resp003){
                MotionToast.createToast(this, "Vaya, te has equivocado!", "La opción correcta era la primera", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
                }
            resp001.isEnabled = false;
            resp002.isEnabled = false;
            resp003.isEnabled = false;
            btn6.isEnabled = true;
        }

    }

    //Método Siguiente
    fun sig (view: View?) {
        val sig1 = Intent(this@Exploracion3, MainActivity2::class.java)
        startActivity(sig1)
    }

    //Método Anterior
    fun ant (view: View?) {
        val ant1 = Intent(this@Exploracion3, exploracion2::class.java)
        startActivity(ant1)
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