package com.ahmetazizov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        StringBuffer number = new StringBuffer("");
        float result = 0.72398762345F;
        char sign = ' ';
        float digit;
        boolean newDigit = true;
        boolean reset = false;
        boolean sqrt = false;


        public void ButtonCalculation(int digit){
            if (reset) {
                number.delete(0, number.length());
                result = 0.72398762345F;
                reset = false;
                newDigit = true;
            }

            TextView output = findViewById(R.id.txtMessageOutput);
            number.append(String.valueOf(digit));
            output.setText(number);
        }

        public void calculation(){
            if (result == 0.72398762345F){
                result = digit;
            }
            else{
                switch (sign){
                    case '+': result += digit; break;
                    case '-': result -= digit; break;
                    case '*': result *= digit; break;
                    case '/': result /= digit; break;
                }
            }
        }

        public void buttonClear(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            output.setText("");
            result = 0.72398762345F;
            digit = 0;
            number.delete(0, number.length());
            newDigit = true;
        }

        public void buttonResult(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if (number.length() > 0){
                output.setText("");
                digit = Float.parseFloat(number.toString());
                calculation();

                digit = result;

                if (result % 1 == 0) output.setText(String.valueOf((int)result));
                else output.setText(String.valueOf(result));

                result = 0.72398762345F;

                sqrt = true;
                newDigit = false;
                reset = true;
            }
        }

        public void buttonPower(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if (number.length() > 0){
                output.setText("");

                digit = Float.parseFloat(number.toString());

                digit = digit * digit;

                number.delete(0, number.length());
                number.append(digit);

                Toast.makeText(this, number, Toast.LENGTH_LONG).show();

                if (digit % 1 == 0) output.setText(String.valueOf((int)digit));
                else output.setText(String.valueOf(digit));

                result = 0.72398762345F;

                sqrt = true;
                newDigit = false;
                reset = true;
            }
        }

        public void buttonAddition(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if(number.length() > 0){
                output.setText("");
                if (newDigit) digit = Float.parseFloat(number.toString());
                calculation();
                sign = '+';
                output.setText("+");
                number.delete(0, number.length());
                newDigit = true;
                reset = false;
                sqrt = false;
            }
        }

        public void buttonSubtraction(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if(number.length() > 0){
                output.setText("");
                if (newDigit) digit = Float.parseFloat(number.toString());
                calculation();
                sign = '-';
                output.setText("-");
                number.delete(0, number.length());
                newDigit = true;
                reset = false;
                sqrt = false;
            }
        }

        public void buttonMultiplication(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if(number.length() > 0){
                output.setText("");
                if (newDigit) digit = Float.parseFloat(number.toString());
                calculation();
                sign = '*';
                output.setText("*");
                number.delete(0, number.length());
                newDigit = true;
                reset = false;
            }
        }

        public void buttonDivision(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if(number.length() > 0){
                output.setText("");
                if (newDigit) digit = Float.parseFloat(number.toString());
                calculation();
                sign = '/';
                output.setText("/");
                number.delete(0, number.length());
                newDigit = true;
                reset = false;
            }
        }

        public void buttonDot(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            number.append(".");
            digit = Float.parseFloat(number.toString());
            output.setText(number);
        }

        public void buttonPositiveNegative(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            digit = Float.parseFloat(number.toString()) * -1;

            number.delete(0, number.length());

            if (digit % 1 == 0) number.append((int)digit);
            else number.append(digit);

            output.setText(number);
        }


        public void button0(View view){
            ButtonCalculation(0);
        }

        public void button1(View view){
            ButtonCalculation(1);
        }

        public void button2(View view){
            ButtonCalculation(2);
        }

        public void button3(View view){
            ButtonCalculation(3);
        }

        public void button4(View view){
            ButtonCalculation(4);
        }

        public void button5(View view){
            ButtonCalculation(5);
        }

        public void button6(View view){
            ButtonCalculation(6);
        }

        public void button7(View view){
            ButtonCalculation(7);
        }

        public void button8(View view){
            ButtonCalculation(8);
        }

        public void button9(View view){
            ButtonCalculation(9);
        }
}