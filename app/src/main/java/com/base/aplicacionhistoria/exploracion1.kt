package com.base.aplicacionhistoria
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_exploracion1.*
import www.sanju.motiontoast.MotionToast
import kotlin.system.exitProcess


class exploracion1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exploracion1)

        MyToolbar().show(this, "Historia de América", false)

    btn2.isEnabled = false;

    rg1.setOnCheckedChangeListener { group, checkedId ->
        

        if (checkedId == R.id.resp1){
            //Toast.makeText(this@exploracion1, "Vaya, aún te falta aprender...", Toast.LENGTH_SHORT).show()
            MotionToast.createToast(this, "Vaya, te has equivocado!", "La opción correcta era la tercera", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION, null)
            }

        if (checkedId == R.id.resp2){
            MotionToast.createToast(this, "Vaya, te has equivocado!", "La opción correcta era la tercera", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION, null)

        }

        if (checkedId == R.id.resp3)
            MotionToast.createToast(this, "Respuesta Correcta!", "Lo has hecho muy bien, felicidades", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION, null)

        resp1.isEnabled = false;
        resp2.isEnabled = false;
        resp3.isEnabled = false;
        btn2.isEnabled = true;

    }

    }

    //Método Siguiente
    fun sig1(view: View?) {
        val sig1 = Intent(this@exploracion1, exploracion2::class.java)
        startActivity(sig1)
    }

    //Método Anterior
    fun ant1(view: View?) {
        val ant1 = Intent(this@exploracion1, MainActivity::class.java)
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