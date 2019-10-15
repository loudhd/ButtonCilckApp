package com.example.buttoncilckapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG= "MainActivity"

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.editText)
         val button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView2)
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("")

        button?.setOnClickListener {object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    Log.d(TAG,"onCreate: called")
                    textView?.append( userInput?.text)
                    textView?.append("\n")
                    userInput.text.clear()
                    userInput.setText("")
                }
            }
        }
    }
}
