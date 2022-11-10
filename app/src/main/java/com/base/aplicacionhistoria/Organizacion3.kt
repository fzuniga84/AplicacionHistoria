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
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_organizacion3.*
import kotlinx.android.synthetic.main.activity_organizacion3.soltar1
import kotlinx.android.synthetic.main.activity_organizacion3.soltar2
import kotlinx.android.synthetic.main.activity_organizacion3.soltar3


class Organizacion3 : AppCompatActivity() {

    var idTarget:Int=0

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organizacion3)

        btn4.isEnabled = false;

        MyToolbar().show(this, "Historia de América", false)

        eti1.setOnLongClickListener(longClickListener)
        eti2.setOnLongClickListener(longClickListener)
        eti3.setOnLongClickListener(longClickListener)
        eti4.setOnLongClickListener(longClickListener)
        eti5.setOnLongClickListener(longClickListener)


        soltar1.setOnDragListener(dragListener)
        soltar2.setOnDragListener(dragListener)
        soltar3.setOnDragListener(dragListener)
        soltar4.setOnDragListener(dragListener)
        soltar5.setOnDragListener(dragListener)

        btn4.isEnabled = true;

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
        val item = ClipData.Item(v.tag as? CharSequence)
        idTarget=v.id
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
        val blankShape: Drawable = resources.getDrawable(R.drawable.drop1, theme)
        val etiqueta2Shape: Drawable = resources.getDrawable(R.drawable.etiqueta2, theme)
        val blankShape1: Drawable = resources.getDrawable(R.drawable.drop1, theme)
        val etiqueta1Shape: Drawable = resources.getDrawable(R.drawable.etiqueta1, theme)
        val blankShape2: Drawable = resources.getDrawable(R.drawable.drop1, theme)
        val etiqueta3Shape: Drawable = resources.getDrawable(R.drawable.etiqueta3, theme)
        val blankShape3: Drawable = resources.getDrawable(R.drawable.drop1, theme)
        val etiqueta4Shape: Drawable = resources.getDrawable(R.drawable.etiqueta4, theme)
        val blankShape4: Drawable = resources.getDrawable(R.drawable.drop1, theme)
        val etiqueta5Shape: Drawable = resources.getDrawable(R.drawable.etiqueta5, theme)

        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                evaluar.text = "Estas arrastrando una imagen"
                true
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                if(event.clipDescription.label == receiverView.tag as String) {
                    receiverView.setColorFilter(Color.GREEN)
                    evaluar.text = "Muy bien!"
                } else {
                    receiverView.setColorFilter(Color.RED)
                    evaluar.text = "Respuesta Incorrecta! :("
                }
                v.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text

                /*Setencias para soltar Etiqueta1 */
                if (v.id == soltar1.id && eti1.id == idTarget) {
                    soltar1.background = etiqueta2Shape
                    eti1.background = blankShape
                    eti1.isEnabled=false

                } else
                    if (v.id == soltar2.id && eti1.id == idTarget) {
                        soltar2.background = etiqueta2Shape
                        eti1.background = blankShape
                        eti1.isEnabled=false
                    } else
                        if (v.id == soltar3.id && eti1.id == idTarget) {
                            soltar3.background = etiqueta2Shape
                            eti1.background = blankShape
                            eti1.isEnabled=false
                        }
                        else
                            if (v.id == soltar4.id && eti1.id == idTarget) {
                                soltar4.background = etiqueta2Shape
                                eti1.background = blankShape
                                eti1.isEnabled=false
                            }
                            else
                                if (v.id == soltar5.id && eti1.id == idTarget) {
                                    soltar5.background = etiqueta2Shape
                                    eti1.background = blankShape
                                    eti1.isEnabled=false
                                }

                /*Setencias para soltar Etiqueta2 */
                if (v.id == soltar1.id && eti2.id == idTarget) {
                    soltar1.background = etiqueta1Shape
                    eti2.background = blankShape1
                    eti2.isEnabled=false

                } else
                    if (v.id == soltar2.id && eti2.id == idTarget) {
                        soltar2.background = etiqueta1Shape
                        eti2.background = blankShape1
                        eti2.isEnabled=false
                    } else
                        if (v.id == soltar3.id && eti2.id == idTarget) {
                            soltar3.background = etiqueta1Shape
                            eti2.background = blankShape1
                            eti2.isEnabled=false
                        }
                        else
                            if (v.id == soltar4.id && eti2.id == idTarget) {
                                soltar4.background = etiqueta1Shape
                                eti2.background = blankShape1
                                eti2.isEnabled=false
                            }
                            else
                                if (v.id == soltar5.id && eti2.id == idTarget) {
                                    soltar5.background = etiqueta1Shape
                                    eti2.background = blankShape1
                                    eti2.isEnabled=false
                                }
                /*Setencias para soltar Etiqueta3 */
                if (v.id == soltar1.id && eti3.id == idTarget) {
                    soltar1.background = etiqueta3Shape
                    eti3.background = blankShape2
                    eti3.isEnabled=false

                } else
                    if (v.id == soltar2.id && eti3.id == idTarget) {
                        soltar2.background = etiqueta3Shape
                        eti3.background = blankShape2
                        eti3.isEnabled=false
                    } else
                        if (v.id == soltar3.id && eti3.id == idTarget) {
                            soltar3.background = etiqueta3Shape
                            eti3.background = blankShape2
                            eti3.isEnabled=false
                        }
                        else
                            if (v.id == soltar4.id && eti3.id == idTarget) {
                                soltar4.background = etiqueta3Shape
                                eti3.background = blankShape2
                                eti3.isEnabled=false
                            }
                            else
                                if (v.id == soltar5.id && eti3.id == idTarget) {
                                    soltar5.background = etiqueta3Shape
                                    eti3.background = blankShape2
                                    eti3.isEnabled=false
                                }
                /*Setencias para soltar Etiqueta4 */
                if (v.id == soltar1.id && eti4.id == idTarget) {
                    soltar1.background = etiqueta4Shape
                    eti4.background = blankShape3
                    eti4.isEnabled=false

                } else
                    if (v.id == soltar2.id && eti4.id == idTarget) {
                        soltar2.background = etiqueta4Shape
                        eti4.background = blankShape3
                        eti4.isEnabled=false
                    } else
                        if (v.id == soltar3.id && eti4.id == idTarget) {
                            soltar3.background = etiqueta4Shape
                            eti4.background = blankShape3
                            eti4.isEnabled=false
                        }
                        else
                            if (v.id == soltar4.id && eti4.id == idTarget) {
                                soltar4.background = etiqueta4Shape
                                eti4.background = blankShape3
                                eti4.isEnabled=false
                            }
                            else
                                if (v.id == soltar5.id && eti4.id == idTarget) {
                                    soltar5.background = etiqueta4Shape
                                    eti4.background = blankShape3
                                    eti4.isEnabled=false
                                }
                /*Setencias para soltar Etiqueta5 */
                if (v.id == soltar1.id && eti5.id == idTarget) {
                    soltar1.background = etiqueta5Shape
                    eti5.background = blankShape4
                    eti5.isEnabled=false

                } else
                    if (v.id == soltar2.id && eti5.id == idTarget) {
                        soltar2.background = etiqueta5Shape
                        eti5.background = blankShape4
                        eti5.isEnabled=false
                    } else
                        if (v.id == soltar3.id && eti5.id == idTarget) {
                            soltar3.background = etiqueta5Shape
                            eti5.background = blankShape4
                            eti5.isEnabled=false
                        }
                        else
                            if (v.id == soltar4.id && eti5.id == idTarget) {
                                soltar4.background = etiqueta5Shape
                                eti5.background = blankShape4
                                eti5.isEnabled=false
                            }
                            else
                                if (v.id == soltar5.id && eti5.id == idTarget) {
                                    soltar5.background = etiqueta5Shape
                                    eti5.background = blankShape4
                                    eti5.isEnabled=false
                                }
                true

            }
            DragEvent.ACTION_DRAG_LOCATION ->
                true

            DragEvent.ACTION_DRAG_EXITED -> {
                if(event.clipDescription.label == receiverView.tag as String) {
                    receiverView.setColorFilter(Color.YELLOW)
                    evaluar.text = "Casi la tenias!"
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
        val sig = Intent(this@Organizacion3, Organizacion4::class.java)
        startActivity(sig)
    }

    fun ant (view: View?) {
        val ant = Intent(this@Organizacion3, Organizacion2::class.java)
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