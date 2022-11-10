package com.base.aplicacionhistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exploracion1.*
import kotlinx.android.synthetic.main.activity_formas6.*
import www.sanju.motiontoast.MotionToast
import kotlinx.android.synthetic.main.activity_exploracion1.resp1 as resp11
import kotlinx.android.synthetic.main.activity_exploracion1.resp2 as resp21
import kotlinx.android.synthetic.main.activity_exploracion1.resp3 as resp31

class Formas6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formas6)

        MyToolbar().show(this, "Historia de América", false)

        btn18.isEnabled = false;

        rg8.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.resp1){
               // Toast.makeText(this@Formas6, "La opción correcta era la segunda", Toast.LENGTH_SHORT).show()
                MotionToast.createToast(this, "Lo siento, te has equivocado!", "La opción correcta era la segunda", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
            }
            if (checkedId == R.id.resp2)
                MotionToast.createToast(this, "Respuesta correcta!", "Lo has hecho muy bien, felicidades", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)


            if (checkedId == R.id.resp3){
                MotionToast.createToast(this, "Lo siento, te has equivocado!", "La opción correcta era la segunda", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                    MotionToast.SHORT_DURATION, null)
                }
            resp1.isEnabled = false;
            resp2.isEnabled = false;
            resp3.isEnabled = false;
            btn18.isEnabled = true;
        }

    }

    fun sig (view: View?) {
        val sig = Intent(this@Formas6, Formas8::class.java)
        startActivity(sig)
    }

    fun ant (view: View?) {
        val ant = Intent(this@Formas6, Formas5::class.java)
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