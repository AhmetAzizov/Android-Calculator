package com.ahmetazizov.calculator;

public class BasicOperations extends Number{
    BasicOperations(char sign){
        if (isNull()){
            setResult(Float.parseFloat(getDisplayNumber()));
            setDigit(0);
        }else{
            setDigit(Float.parseFloat(getDisplayNumber()));

            float temporaryResult = getResult();

            switch (sign){
                case '+': temporaryResult += getDigit(); break;
                case '-': temporaryResult -= getDigit(); break;
                case '*': temporaryResult *= getDigit(); break;
                case '/': temporaryResult /= getDigit(); break;
            }
            setResult(temporaryResult);
        }
        if (!isIsResult()) setDisplayNumber("");
    }
}
