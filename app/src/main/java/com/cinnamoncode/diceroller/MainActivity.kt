package com.cinnamoncode.diceroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
        val rollButton: Button = findViewById(R.id.roll_button)
        val diceImage: ImageView = findViewById(R.id.dice_image)

        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            // Dynamic dice number resource
            val dice =
                resources.getIdentifier("dice_" + RandomNumber(), "drawable", packageName)
            diceImage.setImageResource(dice)
        }
    }

    private fun RandomNumber(): Int {
        return Random().nextInt(6) + 1;
    }

}
