package com.cinnamoncode.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Call function roll()
        rollDice()
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice(){
        val rollButton: Button = findViewById(R.id.roll_button);
        val resultText: TextView = findViewById(R.id.result_text)

        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
//            Toast.makeText(this, "ROLL", Toast.LENGTH_LONG).show()
            resultText.text = RandomNumber().toString()
        }
    }

    private fun RandomNumber(): Int {
        return Random().nextInt(6) + 1;
    }

}
