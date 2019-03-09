package com.daniel.ssejjemba.findage

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class GameActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        btn_calc.setOnClickListener{
            val dob:Int? = et_user_dob.text.toString().toInt()
            val age = calculateAge(dob)
            tv_show_age.text = "You're now $age years old"
        }
    }

    private fun calculateAge(dob: Int?): Int {
        val yearNow = Calendar.getInstance().get(Calendar.YEAR)
        return yearNow - dob!!
    }
}
