package com.ahmetazizov.calculator;

public class Subtraction extends Number{
    Subtraction(){
        if (isNull()){
            setResult(Float.parseFloat(getDisplayNumber()));
            setDigit(0);
        }else{
            setDigit(Float.parseFloat(getDisplayNumber()));
            float temporaryResult = getResult();
            temporaryResult -= getDigit();
            setResult(temporaryResult);
        }

        if (!isIsResult()) setDisplayNumber("");
    }
}
