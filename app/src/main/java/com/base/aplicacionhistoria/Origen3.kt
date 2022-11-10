package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exploracion1.*
import kotlinx.android.synthetic.main.activity_exploracion1.rg1
import kotlinx.android.synthetic.main.activity_origen3.*
import www.sanju.motiontoast.MotionToast

class Origen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_origen3)

        MyToolbar().show(this, "Historia de América", false)

        btn8.isEnabled = false;

        rg4.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.verdadero)
                MotionToast.createToast(this, "Vaya, te has equivocado!", "La respuesta era Verdadero", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)


            if (checkedId == R.id.falso)
                MotionToast.createToast(this, "Respuesta Correcta!", "Lo has hecho muy bien, felicidades", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)

            verdadero.isEnabled = false;
            falso.isEnabled = false;
            btn8.isEnabled = true;

        }

    }

    fun sig (view: View?) {
        val sig = Intent(this@Origen3, Origen4::class.java)
        startActivity(sig)
    }


    fun ant (view: View?) {
        val ant = Intent(this@Origen3, Origen2::class.java)
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