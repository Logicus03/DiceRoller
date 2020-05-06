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

    // lateinit variable - to optimize code
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set value here to avoid call it multiple times
        diceImage = findViewById(R.id.dice_image)
        // Call function roll()
        rollDice()
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice(){
        val rollButton: Button = findViewById(R.id.roll_button)

//        rollButton.text = "Let's Roll"
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
