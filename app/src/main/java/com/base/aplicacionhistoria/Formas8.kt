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
import com.base.aplicacionhistoria.databinding.ActionBarToolbarBinding
import com.base.aplicacionhistoria.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_formas8.*
import www.sanju.motiontoast.MotionToast

class Formas8 : AppCompatActivity() {

   // private lateinit var binding: ActivityMainBinding

    var idTarget:Int=0
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_formas8)

        btn22.isEnabled = false;

        MyToolbar().show(this, "Historia de América", false)

        cmaya1.setOnLongClickListener(longClickListener)
        cmaya2.setOnLongClickListener(longClickListener)
        cmaya3.setOnLongClickListener(longClickListener)
        cmaya4.setOnLongClickListener(longClickListener)
        cmaya5.setOnLongClickListener(longClickListener)
        cmaya6.setOnLongClickListener(longClickListener)


        drop1.setOnDragListener(dragListener)
        drop2.setOnDragListener(dragListener)
        drop3.setOnDragListener(dragListener)
        drop4.setOnDragListener(dragListener)
        drop5.setOnDragListener(dragListener)
        drop6.setOnDragListener(dragListener)

        btn22.isEnabled = true;
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
        val blankShape: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cmaya1Shape: Drawable = resources.getDrawable(R.drawable.cmaya1, theme)
        val blankShape1: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cmaya2Shape: Drawable = resources.getDrawable(R.drawable.cmaya2, theme)
        val blankShape2: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cmaya3Shape: Drawable = resources.getDrawable(R.drawable.cmaya3, theme)
        val blankShape3: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cmaya4Shape: Drawable = resources.getDrawable(R.drawable.cmaya4, theme)
        val blankShape4: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cmaya5Shape: Drawable = resources.getDrawable(R.drawable.cmaya5, theme)
        val blankShape5: Drawable = resources.getDrawable(R.drawable.drop, theme)
        val cmaya6Shape: Drawable = resources.getDrawable(R.drawable.cmaya6, theme)


        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                MotionToast.createToast(this, "Estas arrastrando una respuesta!", "Asegurate de seleccionar la ubicación correcta", MotionToast.TOAST_WARNING, MotionToast.GRAVITY_BOTTOM,MotionToast.SHORT_DURATION, null)

                true
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                if(event.clipDescription.label == receiverView.tag as String) {
                    receiverView.setColorFilter(Color.GREEN)
                   MotionToast.createToast(this, "Muy bien!", "Felicidades, continua así", MotionToast.TOAST_SUCCESS, MotionToast.GRAVITY_BOTTOM,MotionToast.SHORT_DURATION, null)

                } else {
                    receiverView.setColorFilter(Color.RED)
                    MotionToast.createToast(this, "Respuesta Incorrecta!", "Vaya, seleccionaste la respuesta incorrecta", MotionToast.TOAST_ERROR, MotionToast.GRAVITY_BOTTOM,MotionToast.SHORT_DURATION, null)

                }
                v.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text


                /*Seis casos  soltar (1-2-3-4-5-6) con caracteristica1 */
                if (v.id == drop1.id && cmaya1.id == idTarget) {
                    drop1.background = cmaya1Shape
                    cmaya1.background = blankShape
                    cmaya1.isEnabled=false

                } else
                    if (v.id == drop2.id && cmaya1.id == idTarget) {
                        drop2.background = cmaya1Shape
                        cmaya1.background = blankShape
                        cmaya1.isEnabled=false
                    }
                    else
                        if (v.id == drop3.id && cmaya1.id == idTarget) {
                            drop3.background = cmaya1Shape
                            cmaya1.background = blankShape
                            cmaya1.isEnabled=false
                        }
                        else
                            if (v.id == drop4.id && cmaya1.id == idTarget) {
                                drop4.background = cmaya1Shape
                                cmaya1.background = blankShape
                                cmaya1.isEnabled=false
                            }
                            else
                                if (v.id == drop5.id && cmaya1.id == idTarget) {
                                    drop5.background = cmaya1Shape
                                    cmaya1.background = blankShape
                                    cmaya1.isEnabled=false
                                }
                                else
                                    if (v.id == drop6.id && cmaya1.id == idTarget) {
                                        drop6.background = cmaya1Shape
                                        cmaya1.background = blankShape
                                        cmaya1.isEnabled=false
                                    }
                /*seis casos soltar (1-2-3-4-5-6) con Caracteristica2*/
                if (v.id == drop1.id && cmaya2.id == idTarget) {
                    drop1.background = cmaya2Shape
                    cmaya2.background = blankShape1
                    cmaya2.isEnabled=false

                } else
                    if (v.id == drop2.id && cmaya2.id == idTarget) {
                        drop2.background = cmaya2Shape
                        cmaya2.background = blankShape1
                        cmaya2.isEnabled=false
                    }
                    else
                        if (v.id == drop3.id && cmaya2.id == idTarget) {
                            drop3.background = cmaya2Shape
                            cmaya2.background = blankShape1
                            cmaya2.isEnabled=false
                        }
                        else
                            if (v.id == drop4.id && cmaya2.id == idTarget) {
                                drop4.background = cmaya2Shape
                                cmaya2.background = blankShape1
                                cmaya2.isEnabled=false
                            }
                            else
                                if (v.id == drop5.id && cmaya2.id == idTarget) {
                                    drop5.background = cmaya2Shape
                                    cmaya2.background = blankShape1
                                    cmaya2.isEnabled=false
                                }
                                else
                                    if (v.id == drop6.id && cmaya2.id == idTarget) {
                                        drop6.background = cmaya2Shape
                                        cmaya2.background = blankShape1
                                        cmaya2.isEnabled=false
                                    }
                /*seis casos soltar (1-2-3-4-5-6) con Caracteristica3*/
                if (v.id == drop1.id && cmaya3.id == idTarget) {
                    drop1.background = cmaya3Shape
                    cmaya3.background = blankShape2
                    cmaya3.isEnabled=false

                } else
                    if (v.id == drop2.id && cmaya3.id == idTarget) {
                        drop2.background = cmaya3Shape
                        cmaya3.background = blankShape2
                        cmaya3.isEnabled=false
                    }
                    else
                        if (v.id == drop3.id && cmaya3.id == idTarget) {
                            drop3.background = cmaya3Shape
                            cmaya3.background = blankShape2
                            cmaya3.isEnabled=false
                        }
                        else
                            if (v.id == drop4.id && cmaya3.id == idTarget) {
                                drop4.background = cmaya3Shape
                                cmaya3.background = blankShape2
                                cmaya3.isEnabled=false
                            }
                            else
                                if (v.id == drop5.id && cmaya3.id == idTarget) {
                                    drop5.background = cmaya3Shape
                                    cmaya3.background = blankShape2
                                    cmaya3.isEnabled=false
                                }
                                else
                                    if (v.id == drop6.id && cmaya3.id == idTarget) {
                                        drop6.background = cmaya3Shape
                                        cmaya3.background = blankShape2
                                        cmaya3.isEnabled=false
                                    }
                /*seis casos soltar (1-2-3-4-5-6) con Caracteristica4*/
                if (v.id == drop1.id && cmaya4.id == idTarget) {
                    drop1.background = cmaya4Shape
                    cmaya4.background = blankShape3
                    cmaya4.isEnabled=false

                } else
                    if (v.id == drop2.id && cmaya4.id == idTarget) {
                        drop2.background = cmaya4Shape
                        cmaya4.background = blankShape3
                        cmaya4.isEnabled=false
                    }
                    else
                        if (v.id == drop3.id && cmaya4.id == idTarget) {
                            drop3.background = cmaya4Shape
                            cmaya4.background = blankShape3
                            cmaya4.isEnabled=false
                        }
                        else
                            if (v.id == drop4.id && cmaya4.id == idTarget) {
                                drop4.background = cmaya4Shape
                                cmaya4.background = blankShape3
                                cmaya4.isEnabled=false
                            }
                            else
                                if (v.id == drop5.id && cmaya4.id == idTarget) {
                                    drop5.background = cmaya4Shape
                                    cmaya4.background = blankShape3
                                    cmaya4.isEnabled=false
                                }
                                else
                                    if (v.id == drop6.id && cmaya4.id == idTarget) {
                                        drop6.background = cmaya4Shape
                                        cmaya4.background = blankShape3
                                        cmaya4.isEnabled=false
                                    }
                /*seis casos soltar (1-2-3-4-5-6) con Caracteristica5*/
                if (v.id == drop1.id && cmaya5.id == idTarget) {
                    drop1.background = cmaya5Shape
                    cmaya5.background = blankShape4
                    cmaya5.isEnabled=false

                } else
                    if (v.id == drop2.id && cmaya5.id == idTarget) {
                        drop2.background = cmaya5Shape
                        cmaya5.background = blankShape4
                        cmaya5.isEnabled=false
                    }
                    else
                        if (v.id == drop3.id && cmaya5.id == idTarget) {
                            drop3.background = cmaya5Shape
                            cmaya5.background = blankShape4
                            cmaya5.isEnabled=false
                        }
                        else
                            if (v.id == drop4.id && cmaya5.id == idTarget) {
                                drop4.background = cmaya5Shape
                                cmaya5.background = blankShape4
                                cmaya5.isEnabled=false
                            }
                            else
                                if (v.id == drop5.id && cmaya5.id == idTarget) {
                                    drop5.background = cmaya5Shape
                                    cmaya5.background = blankShape4
                                    cmaya5.isEnabled=false
                                }
                                else
                                    if (v.id == drop6.id && cmaya5.id == idTarget) {
                                        drop6.background = cmaya5Shape
                                        cmaya5.background = blankShape4
                                        cmaya5.isEnabled=false
                                    }
                /*seis casos soltar (1-2-3-4-5-6) con Caracteristica6*/
                if (v.id == drop1.id && cmaya6.id == idTarget) {
                    drop1.background = cmaya6Shape
                    cmaya6.background = blankShape5
                    cmaya6.isEnabled=false

                } else
                    if (v.id == drop2.id && cmaya6.id == idTarget) {
                        drop2.background = cmaya6Shape
                        cmaya6.background = blankShape5
                        cmaya6.isEnabled=false
                    }
                    else
                        if (v.id == drop3.id && cmaya6.id == idTarget) {
                            drop3.background = cmaya6Shape
                            cmaya6.background = blankShape5
                            cmaya6.isEnabled=false
                        }
                        else
                            if (v.id == drop4.id && cmaya6.id == idTarget) {
                                drop4.background = cmaya6Shape
                                cmaya6.background = blankShape5
                                cmaya6.isEnabled=false
                            }
                            else
                                if (v.id == drop5.id && cmaya6.id == idTarget) {
                                    drop5.background = cmaya6Shape
                                    cmaya6.background = blankShape5
                                    cmaya6.isEnabled=false
                                }
                                else
                                    if (v.id == drop6.id && cmaya6.id == idTarget) {
                                        drop6.background = cmaya6Shape
                                        cmaya6.background = blankShape5
                                        cmaya6.isEnabled=false
                                    }

                true
            }
            DragEvent.ACTION_DRAG_LOCATION ->
                true

            DragEvent.ACTION_DRAG_EXITED -> {
                if(event.clipDescription.label == receiverView.tag as String) {
                    receiverView.setColorFilter(Color.YELLOW)
                    eval.text = "¡Casi la tenías!"
                    //Toast.makeText(this@Formas8, "¡Casi la tenías!", Toast.LENGTH_SHORT).show()
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
        val sig = Intent(this@Formas8, Menu2::class.java)
        startActivity(sig)

    }

    fun ant (view: View?) {
        val ant = Intent(this@Formas8, Formas6::class.java)
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