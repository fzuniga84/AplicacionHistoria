package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_origen3.*
import kotlinx.android.synthetic.main.activity_origen5.*
import kotlinx.android.synthetic.main.activity_origen6.*
import www.sanju.motiontoast.MotionToast
import kotlinx.android.synthetic.main.activity_origen3.falso as falso1
import kotlinx.android.synthetic.main.activity_origen3.verdadero as verdadero1
import kotlinx.android.synthetic.main.activity_origen6.falso as falso1
import kotlinx.android.synthetic.main.activity_origen6.verdadero as verdadero1

class Origen6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_origen6)

        MyToolbar().show(this, "Historia de América", false)

        btn14.isEnabled = false;

        rg7.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.verdadero)
                MotionToast.createToast(this, "Respuesta Correcta!", "Lo has hecho muy bien, felicidades", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)

            if (checkedId == R.id.falso)
                MotionToast.createToast(this, "Vaya, te has equivocado!", "La respuesta era Verdadero", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)


            verdadero.isEnabled = false;
            falso.isEnabled = false;
            btn14.isEnabled = true;
        }

    }

    fun sig (view: View?) {
        val sig = Intent(this@Origen6, Menu2::class.java)
        startActivity(sig)
    }

    fun ant (view: View?) {
        val ant = Intent(this@Origen6, Origen5::class.java)
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