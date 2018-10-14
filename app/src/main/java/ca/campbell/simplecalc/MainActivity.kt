package ca.campbell.simplecalc

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

//  TODO: add buttons & methods for multiply, divide
//  TODO: extra input validation: no divide by zero
//  TODO: add a clear button that will clear the result & input fields
//  TODO: the hint for the result widget is hard coded, put it in the strings file
//  TODO: apply styles / themes changes
class MainActivity : Activity() {
    private lateinit var etNum1: EditText
    private lateinit var etNum2: EditText
    private lateinit var result: TextView
    internal var total: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get a handle on the text fields
        etNum1 = findViewById(R.id.num1) as EditText
        etNum2 = findViewById(R.id.num2) as EditText
        result = findViewById(R.id.result) as TextView
    }  //onCreate()

    // TODO: input validation: set text to show error
    fun addNums(v: View) {
        total = (etNum1.text.toString()).toDouble() + (etNum2.text.toString()).toDouble();
        result.text = total.toString()
    }  //addNums()

    fun subtrNums(v: View) {
        total =((etNum1.text.toString()).toDouble() - (etNum2.text.toString()).toDouble());
        result.text = total.toString()
    }  //subtrNums()

}