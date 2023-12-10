package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuestionOne: AppCompatActivity() {

    //val counter = 0;
    object QuizCounter {
        var counter = 0
    }



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_one)

        var ans1 = "Indira Gandhi"
        var ans2 = "Mumbai"
        var ans3 = "Brahmaputra"
        var ans4 = "Aryabhata"
        var ans5 = "1975"
        var ans6 = "Himachal Pradesh"
        var ans7 = "Odisha"
        var ans8 = "West Bengal"
        var ans9 = "Indian Rebellion of 1857"
        var ans10 = "Himalayas"


        var submit = findViewById<Button>(R.id.next)


        submit.setOnClickListener(){
            val radioGroup = findViewById<RadioGroup>(R.id.ans1Group)
            val radioGroup2 = findViewById<RadioGroup>(R.id.ans2Group)
            val radioGroup3 = findViewById<RadioGroup>(R.id.ans3Group)
            val radioGroup4 = findViewById<RadioGroup>(R.id.ans4Group)
            val radioGroup5 = findViewById<RadioGroup>(R.id.ans5Group)
            val radioGroup6 = findViewById<RadioGroup>(R.id.ans6Group)
            val radioGroup7 = findViewById<RadioGroup>(R.id.ans7Group)
            val radioGroup8 = findViewById<RadioGroup>(R.id.ans8Group)
            val radioGroup9 = findViewById<RadioGroup>(R.id.ans9Group)
            val radioGroup10 = findViewById<RadioGroup>(R.id.ans10Group)

            // for question one
            var selectedId = radioGroup.checkedRadioButtonId
            if (selectedId != -1){
                val radioBtn = findViewById<RadioButton>(selectedId)
                val radioTxt = radioBtn.text
                //Toast.makeText(applicationContext,"test : $radioTxt",Toast.LENGTH_SHORT).show()
                if(radioTxt == ans1){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 1",Toast.LENGTH_SHORT).show()
            }

            // for question two
            var selectedId2 = radioGroup2.checkedRadioButtonId
            if (selectedId2 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId2)
                val radioTxt = radioBtn.text
                if(radioTxt == ans2){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 2",Toast.LENGTH_SHORT).show()
            }

            // for question three
            var selectedId3 = radioGroup3.checkedRadioButtonId
            if (selectedId3 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId3)
                val radioTxt = radioBtn.text
                if(radioTxt == ans3){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 3",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId4 = radioGroup4.checkedRadioButtonId
            if (selectedId4 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId4)
                val radioTxt = radioBtn.text
                if(radioTxt == ans4){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 4",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId5 = radioGroup5.checkedRadioButtonId
            if (selectedId5 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId5)
                val radioTxt = radioBtn.text
                if(radioTxt == ans5){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 5",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId6 = radioGroup6.checkedRadioButtonId
            if (selectedId6 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId6)
                val radioTxt = radioBtn.text
                if(radioTxt == ans6){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 6",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId7 = radioGroup7.checkedRadioButtonId
            if (selectedId7 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId7)
                val radioTxt = radioBtn.text
                if(radioTxt == ans7){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 7",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId8 = radioGroup8.checkedRadioButtonId
            if (selectedId8 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId8)
                val radioTxt = radioBtn.text
                if(radioTxt == ans8){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 8",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId9 = radioGroup9.checkedRadioButtonId
            if (selectedId9 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId9)
                val radioTxt = radioBtn.text
                if(radioTxt == ans9){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 9",Toast.LENGTH_SHORT).show()
            }
            // for question four
            var selectedId10 = radioGroup10.checkedRadioButtonId
            if (selectedId10 != -1){
                val radioBtn = findViewById<RadioButton>(selectedId10)
                val radioTxt = radioBtn.text
                if(radioTxt == ans10){
                    QuizCounter.counter++
                }
            }else{
                Toast.makeText(applicationContext,"Please Select Answer 10",Toast.LENGTH_SHORT).show()
            }


            //Toast.makeText(applicationContext, "Correct Answer : "+ QuizCounter.counter,Toast.LENGTH_SHORT).show()

            //Change Activity
            val intent = Intent(this, com.example.quizapp.Result::class.java)
            startActivity(intent)
        }


    }
}