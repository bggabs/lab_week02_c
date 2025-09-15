package com.example.lab_week02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class StandardActivity : AppCompatActivity() {
    companion object{
        private const val DEBUG = "DEBUG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)
        Log.d(DEBUG, "onCreate")
        findViewById<Button>(R.id.button_standard).setOnClickListener{
            startActivity(
                Intent(this,
                    StandardActivity::class.java)
            )
        }
    }
    override fun onNewIntent(intent: Intent) {   // <-- perbaikan
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }
}
