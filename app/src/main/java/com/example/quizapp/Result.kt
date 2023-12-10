package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.QuestionOne

class Result: AppCompatActivity() {
    val myCounter = QuestionOne.QuizCounter.counter.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val getResultText = findViewById<TextView>(R.id.resultScore)
        getResultText.text = myCounter + "/10"

        val homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener(){
            val intent = Intent(this, com.example.quizapp.MainActivity::class.java)
            startActivity(intent)
        }
    }
}