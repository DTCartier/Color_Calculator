/*
Darryl Carter
CEG 4110
HW 1 Color Calculator
9-19-19
 */
package com.example.colorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button buttonColor, button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAdd, buttonSub, buttonDiv, buttonMul, buttonClear,
            buttonEql;
    EditText textDisplay;
    RelativeLayout relativeLayout;
    int val1, val2, val2Pos;
    boolean ifAdd, ifSub, ifMul, ifDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonColor = findViewById(R.id.buttonColor);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEql = findViewById(R.id.buttonEql);
        textDisplay = findViewById(R.id.editDisplay);
        relativeLayout = findViewById(R.id.relativeLayout);

        buttonColor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256),
                        random.nextInt(256));
                relativeLayout.setBackgroundColor(color);
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("4");
            }
        });button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textDisplay.append("9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strVal = textDisplay.getText().toString();
                val2Pos = strVal.length() + 1;
                val1 = Integer.parseInt(strVal);
                textDisplay.append("+");
                ifAdd = true;
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strVal = textDisplay.getText().toString();
                val2Pos = strVal.length() + 1;
                val1 = Integer.parseInt(strVal);
                textDisplay.append("-");
                ifSub= true;
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strVal = textDisplay.getText().toString();
                val2Pos = strVal.length() + 1;
                val1 = Integer.parseInt(strVal);
                textDisplay.append("*");
                ifMul = true;
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strVal = textDisplay.getText().toString();
                val2Pos = strVal.length() + 1;
                val1 = Integer.parseInt(strVal);
                textDisplay.append("/");
                ifDiv = true;
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newString = textDisplay.getText().toString();
                int strLength = newString.length();
                if(strLength > 0){
                    newString = newString.substring(0, strLength - 1);
                    textDisplay.setText(newString);
                }
            }
        });
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ifAdd) {
                    String valText = textDisplay.getText().toString();
                    String strVal2 = valText.substring(val2Pos, valText.length());
                    val2 = Integer.parseInt(strVal2);
                    val1 += val2;
                    textDisplay.setText(String.valueOf(val1));
                    ifAdd = false;
                }

                if (ifSub) {
                    String valText = textDisplay.getText().toString();
                    String strVal2 = valText.substring(val2Pos, valText.length());
                    val2 = Integer.parseInt(strVal2);
                    val1 -= val2;
                    textDisplay.setText(String.valueOf(val1));
                    ifSub = false;
                }

                if (ifMul) {
                    String valText = textDisplay.getText().toString();
                    String strVal2 = valText.substring(val2Pos, valText.length());
                    val2 = Integer.parseInt(strVal2);
                    val1 *= val2;
                    textDisplay.setText(String.valueOf(val1));
                    ifMul = false;
                }

                if (ifDiv) {
                    String valText = textDisplay.getText().toString();
                    String strVal2 = valText.substring(val2Pos, valText.length());
                    val2 = Integer.parseInt(strVal2);
                    if(val2 == 0){
                        Toast.makeText(getApplicationContext(), "Can not Divide by 0", Toast.LENGTH_SHORT).show();
                        textDisplay.setText("");
                    }
                    else {
                        val1 /= val2;
                        textDisplay.setText(String.valueOf(val1));
                    }
                    ifDiv = false;
                }
            }
        });
    }
}
