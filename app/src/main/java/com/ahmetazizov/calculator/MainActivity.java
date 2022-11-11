package com.ahmetazizov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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


        public void buttonResult(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if (number.length() > 0){
                output.setText("");
                digit = Float.parseFloat(number.toString());
                calculation();

                if (result % 1 == 0) output.setText(String.valueOf((int)result));
                else output.setText(String.valueOf(result));

                result = 0.72398762345F;
            }
        }

        public void buttonAddition(View view){
            TextView output = findViewById(R.id.txtMessageOutput);
            if(number.length() > 0){
                output.setText(" ");
                digit = Float.parseFloat(number.toString());
                calculation();
                sign = '+';
                output.setText("+");
                number.delete(0, number.length());
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
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("0");

            output.setText(number);
        }

        public void button1(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("1");

            output.setText(number);
        }

        public void button2(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("2");
            output.setText(number.toString());
        }

        public void button3(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("3");
            output.setText(number.toString());
        }

        public void button4(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("4");
            output.setText(number.toString());
        }

        public void button5(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("5");
            output.setText(number.toString());
        }

        public void button6(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("6");
            output.setText(number.toString());
        }

        public void button7(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("7");
            output.setText(number.toString());
        }

        public void button8(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("8");
            output.setText(number.toString());
        }

        public void button9(View view){
            TextView output = findViewById(R.id.txtMessageOutput);

            number.append("9");
            output.setText(number.toString());
        }



}