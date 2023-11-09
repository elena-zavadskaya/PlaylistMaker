package com.practicum.playlistmaker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.search_button)

        val buttonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку поиска!", Toast.LENGTH_SHORT).show()
            }
        }

        searchButton.setOnClickListener(buttonClickListener)

        val mediaButton = findViewById<Button>(R.id.media_button)

        mediaButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку медиатеки!", Toast.LENGTH_SHORT).show()
        }

        val settingButton = findViewById<Button>(R.id.setting_button)

        settingButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку настройки!", Toast.LENGTH_SHORT).show()
        }
    }
}