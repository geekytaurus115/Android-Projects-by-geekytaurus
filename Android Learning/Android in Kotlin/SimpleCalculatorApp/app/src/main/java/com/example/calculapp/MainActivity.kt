package com.example.calculapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculapp.ui.theme.CalculAppTheme
import kotlinx.android.synthetic.main.activity_main.btnDiv
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMul
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.eTInput1
import kotlinx.android.synthetic.main.activity_main.eTInput2
import kotlinx.android.synthetic.main.activity_main.tVResult

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1 + input2).toString()
        }

        btnMinus.setOnClickListener {
            val num1 = eTInput1.text.toString().toInt()
            val num2 = eTInput2.text.toString().toInt()

            tVResult.text = (num1 - num2).toString()
        }

        btnMul.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1 * input2).toString()
        }

        btnDiv.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1 / input2).toString()
        }
    }
}
