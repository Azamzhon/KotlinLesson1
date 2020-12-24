package com.geektech.kotlinlesson1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        btn_plus.setOnClickListener {
            if (eText.text.isNotEmpty() && eText2.text.isNotEmpty()) {
                var number1 = eText.text.toString().toInt()
                var number2 = eText2.text.toString().toInt()
                var sum = number1 + number2
                textView.text = sum.toString()
            }
        }
        btn_minus.setOnClickListener {
            if (eText.text.isNotEmpty() && eText2.text.isNotEmpty()) {
                var number1 = eText.text.toString().toInt()
                var number2 = eText2.text.toString().toInt()
                var sum = number1 - number2
                textView.text = sum.toString()
            }
        }
        btn_multiply.setOnClickListener {
            if (eText.text.isNotEmpty() && eText2.text.isNotEmpty()) {
                var number1 = eText.text.toString().toInt()
                var number2 = eText2.text.toString().toInt()
                var sum = number1 * number2
                textView.text = sum.toString()
            }
        }
        btn_divide.setOnClickListener {
            if (eText.text.isNotEmpty() && eText2.text.isNotEmpty()) {
                var number1 = eText.text.toString().toInt()
                var number2 = eText2.text.toString().toInt()
                if (number2 != 0) {
                    var sum = number1 / number2
                    textView.text = sum.toString()
                } else
                    Toast.makeText(this, "Arithmetic exception", Toast.LENGTH_SHORT).show()
            }
        }
    }
}