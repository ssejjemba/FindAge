package com.daniel.ssejjemba.findage

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_continue -> {

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val typeFace: Typeface? = ResourcesCompat.getFont(this, R.font.Ginga)
        val appName:TextView = findViewById(R.id.tv_app_name)
        appName.typeface = typeFace
    }
}
