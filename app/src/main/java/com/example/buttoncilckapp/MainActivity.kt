package com.example.buttoncilckapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.ActionMode
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG = "MainActivity"

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

        button?.setOnClickListener {
            object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    Log.d(TAG, "onCreate: called")
                    textView?.append(userInput?.text)
                    textView?.append("\n")
                    userInput.text.clear()
                    userInput.setText("")
                }
            }

        }

    }

    override fun onStart() {
        Log.d(TAG,"onCreate: called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG,"onRestoreInstanceState: called")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(TAG,"onResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause: called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(TAG,"onSaveInstanceState: called")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onStop() {
        Log.d(TAG,"onStop: called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG,"onRestart: called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy: called")
        super.onDestroy()
    }

}
