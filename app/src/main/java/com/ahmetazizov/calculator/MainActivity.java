package com.ahmetazizov.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonResult(View view){
        if (!Number.isDigitNull() && Number.getDisplayNumber() != "") {
            Number.setIsResult(true);
            Number.setIsOperation(false);
            BasicOperations calculation = new BasicOperations(Number.getLastOperation());

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(String.valueOf(Number.getResult()).replaceFirst("\\.0+$", ""));
        }
    }

    public void buttonAddition(View view){
        if (!Number.isDisplayNumberNull() || Number.isIsOperation()) {
            if (!Number.isIsResult() && !Number.isIsOperation()) {
                BasicOperations calculation = new BasicOperations(Number.getLastOperation());
            }
            Number.setIsResult(false);
            Number.setIsOperation(true);
            Number.setDisplayNumber("");

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += "+";

            Number.setDisplayNumber(temporaryDisplayNumber);
            Number.setLastOperation('+');

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
            Number.setDisplayNumber("");
        }
    }

    public void buttonSubtraction(View view){
        if (!Number.isDisplayNumberNull() || Number.isIsOperation()) {
            if (!Number.isIsResult() && !Number.isIsOperation()) {
                BasicOperations calculation = new BasicOperations(Number.getLastOperation());
            }
            Number.setIsResult(false);
            Number.setIsOperation(true);
            Number.setDisplayNumber("");

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += "-";

            Number.setDisplayNumber(temporaryDisplayNumber);
            Number.setLastOperation('-');

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
            Number.setDisplayNumber("");
        }
    }

    public void buttonMultiplication(View view){
        if (!Number.isDisplayNumberNull() || Number.isIsOperation()) {
            if (!Number.isIsResult() && !Number.isIsOperation()) {
                BasicOperations calculation = new BasicOperations(Number.getLastOperation());
            }
            Number.setIsResult(false);
            Number.setIsOperation(true);
            Number.setDisplayNumber("");

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += "*";

            Number.setDisplayNumber(temporaryDisplayNumber);
            Number.setLastOperation('*');

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
            Number.setDisplayNumber("");
        }
    }

    public void buttonDivision(View view){
        if (!Number.isDisplayNumberNull() || Number.isIsOperation()) {
            if (!Number.isIsResult() && !Number.isIsOperation()) {
                BasicOperations calculation = new BasicOperations(Number.getLastOperation());
            }
            Number.setIsResult(false);
            Number.setIsOperation(true);
            Number.setDisplayNumber("");

            String temporaryDisplayNumber = Number.getDisplayNumber();
            temporaryDisplayNumber += "/";

            Number.setDisplayNumber(temporaryDisplayNumber);
            Number.setLastOperation('/');

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
            Number.setDisplayNumber("");
        }
    }

    public void buttonFunction(int digit){
        if (Number.isIsResult()) {
            Number.setDisplayNumber("");
            Number.setIsResult(false);
            Number.setDigit(756646324.789F);
        }

        Number.setIsOperation(false);
        String temporaryDisplayNumber = Number.getDisplayNumber();
        temporaryDisplayNumber += String.format("%d", digit);
        Number.setDisplayNumber(temporaryDisplayNumber);

        TextView output = findViewById(R.id.txtMessageOutput);
        output.setText(Number.getDisplayNumber());
    }

    public void buttonDot(View view){
        if (Number.isIsResult()) {
            Number.setDisplayNumber("");
            Number.setIsResult(false);
            Number.setDigit(756646324.789F);
        }

        if (!Number.getDisplayNumber().contains(".")) {
            String temporaryDisplayNumber = Number.getDisplayNumber();

            if (Number.isDisplayNumberNull()) temporaryDisplayNumber += "0";

            temporaryDisplayNumber += ".";
            Number.setDisplayNumber(temporaryDisplayNumber);

            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(Number.getDisplayNumber());
        }
    }

    public void buttonPositiveNegative(View view){
        if (Number.isIsResult()){
            String temporaryResult = String.valueOf(Number.getResult());

            if (temporaryResult.contains("-")) {
                temporaryResult = temporaryResult.substring(1, temporaryResult.length());
            }else{
                temporaryResult = '-' + temporaryResult;
            }

            Number.setResult(Float.parseFloat(temporaryResult));
            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(String.valueOf(Number.getResult()).replaceFirst("\\.0+$", ""));
        } else{
            String displayNumber = Number.getDisplayNumber();

            if (displayNumber.contains("-")){
                displayNumber = displayNumber.substring(1, displayNumber.length());
            }else{
                displayNumber = '-' + displayNumber;
            }

            Number.setDisplayNumber(displayNumber);
            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText(String.valueOf(Number.getDisplayNumber()));
        }
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