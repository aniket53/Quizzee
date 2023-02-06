package com.example.quizzee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart = findViewById<Button>(R.id.startButton)
        val edName = findViewById<EditText>(R.id.edName)
        buttonStart.setOnClickListener {
            if(edName.text.isEmpty()){
                Toast.makeText(this,"Please enter name",Toast.LENGTH_SHORT).show()
            }else{
                val i = Intent(this,QuizQuestionsActivity::class.java)
                i.putExtra(Constants.USER_NAME, edName.text.toString())
                startActivity(i)
                finish()
            }
        }
    }
}