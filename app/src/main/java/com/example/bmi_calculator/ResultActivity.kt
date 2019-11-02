package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.math.round

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        button_calculate.setOnClickListener { btnSet() }
    }

    private fun btnSet() {
        if (editText_height.text.isNotEmpty() && editText_weight.text.isNotEmpty()) {

            // Get value
            val height: Double = editText_height.text.toString().toDouble()/100
            val weight: Double = editText_weight.text.toString().toDouble()

            // BMI
            val bmi: Double = round((weight/(height*height))*10)/10

            // Show result
            textView_answer.text = bmi.toString()
        } else {
            Toast.makeText(this, "Please input the value!", Toast.LENGTH_SHORT).show()
        }
    }
}
