package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mAnswer: TextView
    lateinit var mFNum: EditText
    lateinit var mSNum: EditText
    lateinit var mAdd: Button
    lateinit var mSub: Button
    lateinit var mDiv: Button
    lateinit var mMul: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFNum = findViewById(R.id.mEdtFNum)
        mSNum = findViewById(R.id.mEdtSNum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mDiv = findViewById(R.id.mBtnDiv)
        mMul = findViewById(R.id.mBtnMul)

        // Set onclick Listeners to all the buttons
        mAdd.setOnClickListener {
            // Receive the first and second numbers to compute
            var firstNumber = mFNum.text.toString().trim()
            var secondNumber = mSNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers"
            }
            else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }

        mSub.setOnClickListener {
            // Receive the first and second numbers to compute
            var firstNumber = mFNum.text.toString().trim()
            var secondNumber = mSNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers"
            }
            else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }

        mDiv.setOnClickListener {
            // Receive the first and second numbers to compute
            var firstNumber = mFNum.text.toString().trim()
            var secondNumber = mSNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers"
            }
            else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }

            mMul.setOnClickListener {
                // Receive the first and second numbers to compute
                var firstNumber = mFNum.text.toString().trim()
                var secondNumber = mSNum.text.toString().trim()
                if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                    mAnswer.text = "Please enter valid numbers"
                }
                else{
                    // Proceed to compute the values
                    var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                    mAnswer.text = jibu.toString()
                }
            }
    }
}