package com.example.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var signOutButton: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signOutButton = findViewById(R.id.signOutButton)
        auth = FirebaseAuth.getInstance()


        signOutButton.setOnClickListener {
            auth.signOut()
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

        fun onEnter(view: View){
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            tvAge.text = "Age: " + (currentYear - InputYear.text.toString().toInt())
        }



}