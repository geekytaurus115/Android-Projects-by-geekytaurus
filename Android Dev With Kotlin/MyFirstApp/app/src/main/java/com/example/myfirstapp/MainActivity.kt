package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //to save content in the same page
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val and var
        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        val buttonEdu = findViewById<Button>(R.id.btnEdu)
        val buttonWork = findViewById<Button>(R.id.btnWork)
        val buttonAcheive = findViewById<Button>(R.id.btnAchieve)

        buttonSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonEdu.setOnClickListener {
            val intent = Intent(this, EduActivity::class.java)
            startActivity(intent)
        }

        buttonWork.setOnClickListener {
            val intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }

        buttonAcheive.setOnClickListener {
            val intentAchieve = Intent(this, AchieveActivity::class.java)
            startActivity(intentAchieve)
        }
    }
}




