package ru.nordbird.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener {
            Log.e("M_MainActivity", "Click on Button One")
        }
        btn_two.setOnClickListener {
            Log.e("M_MainActivity", "Click on Button Two")
        }
        btn_three.setOnClickListener {
            Log.e("M_MainActivity", "Click on Button Three")
        }
    }
}
