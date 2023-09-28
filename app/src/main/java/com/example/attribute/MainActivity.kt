package com.example.attribute

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.graphics.Color

import com.example.attribute.R

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализируем EditText
        editText = findViewById(R.id.editTextText)

        // Инициализируем кнопки
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        // Создаем обработчик нажатия для кнопок
        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.button1 -> {
                    // Изменяем атрибуты EditText при нажатии на кнопку "Черный текст"
                    editText.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white)) // Сбрасываем фон
                    editText.setTextColor(ContextCompat.getColor(this, android.R.color.black))
                    editText.textSize = 14f
                }
                R.id.button2 -> {
                    // Изменяем атрибуты EditText при нажатии на кнопку "Красный текст"
                    editText.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white)) // Сбрасываем фон
                    editText.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
                    editText.textSize = 14f
                }
                R.id.button3 -> {
                    // Изменяем атрибуты EditText при нажатии на кнопку "Размер - 8sp"
                    editText.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white)) // Сбрасываем фон
                    editText.setTextColor(ContextCompat.getColor(this, android.R.color.black))
                    editText.textSize = 8f
                }
                R.id.button4 -> {
                    // Изменяем атрибуты EditText при нажатии на кнопку "Размер - 24sp"
                    editText.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white)) // Сбрасываем фон
                    editText.setTextColor(ContextCompat.getColor(this, android.R.color.black))
                    editText.textSize = 24f
                }
                R.id.button5 -> {
                    // Изменяем атрибуты EditText при нажатии на кнопку "Белый фон"
                    editText.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white))
                    editText.setTextColor(ContextCompat.getColor(this, android.R.color.black)) // Цвет текста ставим обратно в черный
                    editText.textSize = 14f
                }
                R.id.button6 -> {
                    // Изменяем атрибуты EditText при нажатии на кнопку "Желтый фон"
                    editText.setBackgroundColor(Color.parseColor("#FFFF00")) // Желтый цвет
                    editText.setTextColor(ContextCompat.getColor(this, android.R.color.black)) // Цвет текста ставим обратно в черный
                    editText.textSize = 14f
                }
            }
        }

        // Присваиваем обработчик нажатия каждой кнопке
        button1.setOnClickListener(clickListener)
        button2.setOnClickListener(clickListener)
        button3.setOnClickListener(clickListener)
        button4.setOnClickListener(clickListener)
        button5.setOnClickListener(clickListener)
        button6.setOnClickListener(clickListener)
    }
}
