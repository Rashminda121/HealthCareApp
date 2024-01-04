package com.example.healthcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Override as Override

class LoginActivity2 : AppCompatActivity() {

    private lateinit var edUsername: EditText
    private lateinit var edPassword: EditText
    private lateinit var btn:Button
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        // Initialize your EditText variables
        edUsername = findViewById(R.id.editTextUsername)
        edPassword = findViewById(R.id.editTextPassword)
        val btn = findViewById<Button>(R.id.loginbtn)
        val tv = findViewById<TextView>(R.id.tView)

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Login Successful.", Toast.LENGTH_SHORT).show()
        }
    }

}
