package com.example.ndichuandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textview = findViewById<TextView>(R.id.Textviewname)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val textviewCount = findViewById<TextView>(R.id.textviewcount)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)

        textviewCount.text = count.toString()

        buttonAdd.setOnClickListener {
            val newnumber = add()
            textviewCount.text = newnumber.toString()

        }
        buttonSubtract.setOnClickListener {
            val newnumber = subtract()
            textviewCount.text = newnumber.toString()

        }
    }

    private fun add(): Int {
        val newNumber = count++
        return newNumber
    }
    private fun subtract(): Int {
        val newNumber = count--
        return newNumber

    }
}