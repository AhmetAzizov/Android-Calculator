package com.ahmetazizov.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void buttonResult(View view){
        if (!Number.isNull() && Number.getDisplayNumber() != "") {
                Number calculation = new Number(Number.getLastOperation());

                TextView output = findViewById(R.id.txtMessageOutput);
                output.setText(String.valueOf(Number.getResult()));
            }
        }

        public void buttonSubtraction(){
            if (!Number.isIsResult()) {
                Subtraction subtraction = new Subtraction();
            }
            Number.setIsResult(false);
            Number.setDisplayNumber("");

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += "-";

            Number.setDisplayNumber(temporaryDisplayNumber);
            Number.setLastOperation('-');

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
            Number.setDisplayNumber("");
        }

        public void buttonAddition(View view){
            if (!Number.isIsResult()) {
                Addition addition = new Addition();
            }
            Number.setIsResult(false);
            Number.setDisplayNumber("");

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += "+";

            Number.setDisplayNumber(temporaryDisplayNumber);
            Number.setLastOperation('+');

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
            Number.setDisplayNumber("");
        }

        public void buttonFunction(int digit){
            if (Number.isIsResult()) {
                Number.setDisplayNumber("");
                Number.setIsResult(false);
                Number.setDigit(756646324);
            }

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += String.format("%d", digit);

            Number.setDisplayNumber(temporaryDisplayNumber);

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
        }

        public void button0(View view){
            buttonFunction(0);
        }

        public void button1(View view){
            buttonFunction(1);
        }

        public void button2(View view){
            buttonFunction(2);
        }

        public void button3(View view){
            buttonFunction(3);
        }

        public void button4(View view){
            buttonFunction(4);
        }

        public void button5(View view){
            buttonFunction(5);
        }

        public void button6(View view){
            buttonFunction(6);
        }

        public void button7(View view){
            buttonFunction(7);
        }

        public void button8(View view){
            buttonFunction(8);
        }

        public void button9(View view){
            buttonFunction(9);
        }
}