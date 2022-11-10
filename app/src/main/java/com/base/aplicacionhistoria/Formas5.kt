package com.base.aplicacionhistoria

import android.content.ClipData
import android.content.ClipDescription
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Point
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_formas5.*

class Formas5 : AppCompatActivity() {

    var idTarget:Int=0
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formas5)

        btn16.isEnabled = false;

        MyToolbar().show(this, "Historia de América", false)

        img1.setOnLongClickListener(longClickListener)
        img2.setOnLongClickListener(longClickListener)
        img3.setOnLongClickListener(longClickListener)
        img4.setOnLongClickListener(longClickListener)
        img5.setOnLongClickListener(longClickListener)

        ca1.setOnDragListener(dragListener)
        ca2.setOnDragListener(dragListener)
        ca3.setOnDragListener(dragListener)
        ca4.setOnDragListener(dragListener)
        ca5.setOnDragListener(dragListener)

        btn16.isEnabled = true;
    }

    private class MyDragShadowBuilder(val v: View) : View.DragShadowBuilder(v) {

        override fun onProvideShadowMetrics(size: Point, touch: Point) {
            size.set(view.width, view.height)
            touch.set(view.width / 2, view.height / 2)
        }
        override fun onDrawShadow(canvas: Canvas) {
            v.draw(canvas)
        }
    }

    private val longClickListener = View.OnLongClickListener { v ->
        idTarget=v.id
        val item = ClipData.Item(v.tag as? CharSequence)

        val dragData = ClipData(
            v.tag as CharSequence,
            arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN),
            item
        )

        val myShadow = MyDragShadowBuilder(v)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            v.startDragAndDrop(dragData, myShadow,null,0)
        } else {
            v.startDrag(dragData, myShadow,null,0)
        }

        true
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private val dragListener = View.OnDragListener { v, event ->
        val receiverView: ImageView = v as ImageView
        val blankShape: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cazamShape: Drawable = resources.getDrawable(R.drawable.cazam, theme)
        val blankShape1: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val agriShape: Drawable = resources.getDrawable(R.drawable.agri, theme)
        val blankShape2: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val conspiedShape: Drawable = resources.getDrawable(R.drawable.conspied, theme)
        val blankShape3: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val guermayShape: Drawable = resources.getDrawable(R.drawable.guermay, theme)
        val blankShape4: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val ediciuShape: Drawable = resources.getDrawable(R.drawable.ediciu, theme)

        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                eval.text = "Estás arrastrando una imagen"
                //Toast.makeText(this@Formas5, "Estás arrastrando una imagen", Toast.LENGTH_SHORT).show()
                true
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                if(event.clipDescription.label == receiverView.tag as String) {
                    receiverView.setColorFilter(Color.GREEN)
                    eval.text = "¡Muy bien!"
                   // Toast.makeText(this@Formas5, "¡Muy bien!", Toast.LENGTH_SHORT).show()
                } else {
                    receiverView.setColorFilter(Color.RED)
                    eval.text = "¡Respuesta incorrecta!"
                    //Toast.makeText(this@Formas5, "¡Respuesta incorrecta!", Toast.LENGTH_SHORT).show()
                }
                v.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text


                /*Sentencias para arrastre de la imagen1*/
                if (v.id == ca1.id && img1.id == idTarget) {
                    ca1.background = agriShape
                    img1.background = blankShape1
                    img1.isEnabled=false

                } else
                    if (v.id == ca2.id && img1.id == idTarget) {
                        ca2.background = agriShape
                        img1.background = blankShape1
                        img1.isEnabled=false
                    } else
                        if (v.id == ca3.id && img1.id == idTarget) {
                            ca3.background = agriShape
                            img1.background = blankShape1
                            img1.isEnabled=false
                        }else
                            if (v.id == ca4.id && img1.id == idTarget) {
                                ca4.background = agriShape
                                img1.background = blankShape1
                                img1.isEnabled=false
                            }
                            else
                                if (v.id == ca5.id && img1.id == idTarget) {
                                    ca5.background = agriShape
                                    img1.background = blankShape1
                                    img1.isEnabled=false
                                }
                /*Sentencias para arrastre de la imagen2*/
                if (v.id == ca1.id && img2.id == idTarget) {
                    ca1.background = conspiedShape
                    img2.background = blankShape2
                    img2.isEnabled=false

                } else
                    if (v.id == ca2.id && img2.id == idTarget) {
                        ca2.background = conspiedShape
                        img2.background = blankShape2
                        img2.isEnabled=false
                    } else
                        if (v.id == ca3.id && img2.id == idTarget) {
                            ca3.background = conspiedShape
                            img2.background = blankShape2
                            img2.isEnabled=false
                        }else
                            if (v.id == ca4.id && img2.id == idTarget) {
                                ca4.background = conspiedShape
                                img2.background = blankShape2
                                img2.isEnabled=false
                            }
                            else
                                if (v.id == ca5.id && img2.id == idTarget) {
                                    ca5.background = conspiedShape
                                    img2.background = blankShape2
                                    img2.isEnabled=false
                                }
                /*Sentencias para arrastre de la imagen3*/
                if (v.id == ca1.id && img3.id == idTarget) {
                    ca1.background = cazamShape
                    img3.background = blankShape
                    img3.isEnabled=false

                } else
                    if (v.id == ca2.id && img3.id == idTarget) {
                        ca2.background = cazamShape
                        img3.background = blankShape
                        img3.isEnabled=false
                    } else
                        if (v.id == ca3.id && img3.id == idTarget) {
                            ca3.background = cazamShape
                            img3.background = blankShape
                            img3.isEnabled=false
                        }else
                            if (v.id == ca4.id && img3.id == idTarget) {
                                ca4.background = cazamShape
                                img3.background = blankShape
                                img3.isEnabled=false
                            }
                            else
                                if (v.id == ca5.id && img3.id == idTarget) {
                                    ca5.background = cazamShape
                                    img3.background = blankShape
                                    img3.isEnabled=false
                                }
                /*Sentencias para arrastre de la imagen4*/
                if (v.id == ca1.id && img4.id == idTarget) {
                    ca1.background = guermayShape
                    img4.background = blankShape3
                    img4.isEnabled=false

                } else
                    if (v.id == ca2.id && img4.id == idTarget) {
                        ca2.background = guermayShape
                        img4.background = blankShape3
                        img4.isEnabled=false
                    } else
                        if (v.id == ca3.id && img4.id == idTarget) {
                            ca3.background = guermayShape
                            img4.background = blankShape3
                            img4.isEnabled=false
                        }else
                            if (v.id == ca4.id && img4.id == idTarget) {
                                ca4.background = guermayShape
                                img4.background = blankShape3
                                img4.isEnabled=false
                            }
                            else
                                if (v.id == ca5.id && img4.id == idTarget) {
                                    ca5.background = guermayShape
                                    img4.background = blankShape3
                                    img4.isEnabled=false
                                }
                /*Sentencias para arrastre de la imagen5*/
                if (v.id == ca1.id && img5.id == idTarget) {
                    ca1.background = ediciuShape
                    img5.background = blankShape4
                    img5.isEnabled=false

                } else
                    if (v.id == ca2.id && img5.id == idTarget) {
                        ca2.background = ediciuShape
                        img5.background = blankShape4
                        img5.isEnabled=false
                    } else
                        if (v.id == ca3.id && img5.id == idTarget) {
                            ca3.background = ediciuShape
                            img5.background = blankShape4
                            img5.isEnabled=false
                        }else
                            if (v.id == ca4.id && img5.id == idTarget) {
                                ca4.background = ediciuShape
                                img5.background = blankShape4
                                img5.isEnabled=false
                            }
                            else
                                if (v.id == ca5.id && img5.id == idTarget) {
                                    ca5.background = guermayShape
                                    img5.background = blankShape4
                                    img5.isEnabled=false
                                }
                true
            }
            DragEvent.ACTION_DRAG_LOCATION ->
                true

            DragEvent.ACTION_DRAG_EXITED -> {
                if(event.clipDescription.label == receiverView.tag as String) {
                    receiverView.setColorFilter(Color.YELLOW)
                    eval.text = "¡Casi la tenías!"
                   // Toast.makeText(this@Formas5, "¡Casi la tenías!", Toast.LENGTH_SHORT).show()
                    v.invalidate()
                }
                true
            }



            DragEvent.ACTION_DRAG_ENDED -> {
                true
            }

            else -> {
                false
            }
        }
    }



    fun sig (view: View?) {
        val sig = Intent(this@Formas5, Formas6::class.java)
        startActivity(sig)
    }

    fun ant (view: View?) {
        val ant = Intent(this@Formas5, Formas4::class.java)
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