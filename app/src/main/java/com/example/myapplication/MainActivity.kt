package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val LOG_MSG = "main_activity"
    var textView1: TextView? = null
    lateinit var button: Button

    lateinit var showButton:Button
    lateinit var editText: EditText

    //buttons long
    lateinit var logError:Button
    lateinit var logWarn:Button
    lateinit var logInfo:Button
    lateinit var logDebug:Button
    lateinit var logVerbose:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textView1 = findViewById<TextView>(R.id.textView) as TextView
        Log.d(LOG_MSG,textView1?.text.toString())

        button = findViewById<TextView>(R.id.button) as Button
        button.setOnClickListener(){
            Log.d(LOG_MSG,"button click")
        }

        showButton = findViewById<Button>(R.id.button10)
        editText = findViewById<EditText>(R.id.editTextText)

        showButton.setOnClickListener {
            val text = editText.text
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

        logError = findViewById<Button>(R.id.logErro)
        logWarn = findViewById<Button>(R.id.logWarn)
        logInfo = findViewById<Button>(R.id.logInfo)
        logDebug = findViewById<Button>(R.id.logDebug)
        logVerbose = findViewById<Button>(R.id.logVerbose)

        logError.setOnClickListener {
            Log.e(LOG_MSG,"LOG ERROR")
        }
        logWarn.setOnClickListener {
            Log.w(LOG_MSG,"LOG Warning")
        }
        logInfo.setOnClickListener {
            Log.i(LOG_MSG,"LOG Info")
        }
        logDebug.setOnClickListener {
            Log.d(LOG_MSG,"LOG Debug")
        }
        logVerbose.setOnClickListener {
            Log.v(LOG_MSG,"LOG Verbose")
        }


    }



}