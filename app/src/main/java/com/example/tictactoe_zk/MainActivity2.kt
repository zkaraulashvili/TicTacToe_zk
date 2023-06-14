package com.example.tictactoe_zk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var b1 : Button
    private lateinit var b2 : Button
    private lateinit var b3 : Button
    private lateinit var b4 : Button
    private lateinit var b5 : Button
    private lateinit var b6 : Button
    private lateinit var b7 : Button
    private lateinit var b8 : Button
    private lateinit var b9 : Button
    private lateinit var txt : TextView
    var turnNumber : Int  = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
        listeners()
    }

    public fun checkButtons(){




        if(b1.text=="X" && b2.text == "X" && b3.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b4.text=="X" && b5.text == "X" && b6.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b7.text=="X" && b8.text == "X" && b9.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b1.text=="X" && b4.text == "X" && b7.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b2.text=="X" && b5.text == "X" && b8.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b3.text=="X" && b6.text == "X" && b9.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b1.text=="X" && b5.text == "X" && b9.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b3.text=="X" && b5.text == "X" && b7.text=="X"){
            txt.text = "Winner is X!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b1.text=="O" && b2.text == "O" && b3.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b4.text=="O" && b5.text == "O" && b6.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b7.text=="O" && b8.text == "O" && b9.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b1.text=="O" && b4.text == "O" && b7.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b2.text=="O" && b5.text == "O" && b8.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b3.text=="O" && b6.text == "O" && b9.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b1.text=="O" && b5.text == "O" && b9.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(b3.text=="O" && b5.text == "O" && b7.text=="O"){
            txt.text = "Winner is O!!!"
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        } else if(turnNumber == 9){
            txt.text= "DRAW!!!"
        }
    }


    private fun listeners() {
        b1.setOnClickListener() {
            if (turnNumber % 2 == 0) {
                b1.text = "X"
            } else {
                b1.text = "O"
            }
            turnNumber += 1
            b1.setEnabled(false);
            checkButtons()
        }

        b2.setOnClickListener() {
            if (turnNumber % 2 == 0) {
                b2.text = "X"
            } else {
                b2.text = "O"
            }
            turnNumber += 1
            b2.setEnabled(false);
            checkButtons()

        }

        b3.setOnClickListener{
            if (turnNumber%2==0){
                b3.text="X"
            } else
            {
                b3.text="O"
            }
            turnNumber +=1
            b3.setEnabled(false);
            checkButtons()

        }
        b4.setOnClickListener{
            if (turnNumber%2==0){
                b4.text="X"
            } else
            {
                b4.text="O"
            }
            turnNumber +=1
            b4.setEnabled(false);
            checkButtons()

        }
        b5.setOnClickListener{
            if (turnNumber%2==0){
                b5.text="X"
            } else
            {
                b5.text="O"
            }
            turnNumber +=1
            b5.setEnabled(false);
            checkButtons()

        }
        b6.setOnClickListener{
            if (turnNumber%2==0){
                b6.text="X"
            } else
            {
                b6.text="O"
            }
            turnNumber +=1
            b6.setEnabled(false);
            checkButtons()

        }
        b7.setOnClickListener{
            if (turnNumber%2==0){
                b7.text="X"
            } else
            {
                b7.text="O"
            }
            turnNumber +=1
            b7.setEnabled(false);
            checkButtons()

        }
        b8.setOnClickListener{
            if (turnNumber%2==0){
                b8.text="X"
            } else
            {
                b8.text="O"
            }
            turnNumber +=1
            b8.setEnabled(false);
            checkButtons()

        }
        b9.setOnClickListener{
            if (turnNumber%2==0){
                b9.text="X"
            } else
            {
                b9.text="O"
            }
            turnNumber +=1
            b9.setEnabled(false);
            checkButtons()

        }

    }
    private fun init(){
        b1 = findViewById(R.id.button1)
        b2 = findViewById(R.id.button2)
        b3 = findViewById(R.id.button3)
        b4 = findViewById(R.id.button4)
        b5 = findViewById(R.id.button5)
        b6 = findViewById(R.id.button6)
        b7 = findViewById(R.id.button7)
        b8 = findViewById(R.id.button8)
        b9 = findViewById(R.id.button9)
        txt = findViewById(R.id.winn)
    }
}