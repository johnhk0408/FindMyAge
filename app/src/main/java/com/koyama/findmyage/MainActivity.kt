package com.koyama.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buGetAge.setOnClickListener {

            // add code run when button click
            val userDOB : Int = Integer.parseInt(etDOB.text.toString())
            val currentYear : Int = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears : Int = currentYear - userDOB
            tvShowAge.text = "あなたの年齢は　$userAgeInYears 歳です"
        }
    }
}