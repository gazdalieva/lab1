package com.example.lab_two

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvPlus.setOnClickListener{
            if(!expOne.text.isEmpty() && !expTwo.text.isEmpty()) {
                val a = expOne.getText().toString().toBigDecimal()
                val b = expTwo.getText().toString().toBigDecimal()
                val c = a+b
                resultView.setText(c.toPlainString())
            }
            else {
                val snackbar = Snackbar.make(
                    this.resultView,
                    "Incorrect values!",
                    Snackbar.LENGTH_LONG)
                snackbar.show()
            }


        }

        tvMinus.setOnClickListener{
            if(!expOne.text.isEmpty() && !expTwo.text.isEmpty())  {
                val a = expOne.getText().toString().toBigDecimal()
                val b = expTwo.getText().toString().toBigDecimal()
                val c = a-b
                resultView.setText(c.toPlainString())
            }
            else {
            val snackbar = Snackbar.make(
                this.resultView,
                "Incorrect values!",
                Snackbar.LENGTH_LONG)
            snackbar.show()
        }
        }

        tvMult.setOnClickListener{
            if(!expOne.text.isEmpty() && !expTwo.text.isEmpty()) {
                val a = expOne.getText().toString().toBigDecimal()
                val b = expTwo.getText().toString().toBigDecimal()
                val c = a*b
                resultView.setText(c.toPlainString())
            }
            else {
            val snackbar = Snackbar.make(
                this.resultView,
                "Incorrect values!",
                Snackbar.LENGTH_LONG)
            snackbar.show()
        }
        }

        tvDivide.setOnClickListener{
            if(!expOne.text.isEmpty() && !expTwo.text.isEmpty())  {
                val a = expOne.getText().toString().toBigDecimal()
                val b = expTwo.getText().toString().toBigDecimal()
                if(b!= BigDecimal.ZERO) {
                    val c = a/b
                    resultView.setText(c.toPlainString())
                }
                else resultView.setText("Infinite")
            }
            else {
                val snackbar = Snackbar.make(
                    this.resultView,
                    "Incorrect values!",
                    Snackbar.LENGTH_LONG)
                snackbar.show()
            }
        }

    }
}
