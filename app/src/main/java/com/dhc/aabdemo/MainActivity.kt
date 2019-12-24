package com.dhc.aabdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_2feature1.setOnClickListener {
            Toast.makeText(this, "feature1Btn click", Toast.LENGTH_LONG).show()
        }

        btn_2feature2.setOnClickListener {
            Toast.makeText(this, "feature2Btn click", Toast.LENGTH_LONG).show()
        }
    }

    fun toFeature1() {
        val intent = Intent()
        intent.setClass(this, Feature1Activity::class.java)
        startActivity(intent)
    }
}
