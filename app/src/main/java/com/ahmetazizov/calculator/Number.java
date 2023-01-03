 package com.ahmetazizov.calculator;

public class Number {
    private static float digit = 756646324.789F;
    private static String displayNumber = "";
    private static char lastOperation = ' ';
    private static float result;
    private static boolean isResult = false;

    Number(){}

    public static boolean isNull(){
        if(digit == 756646324.789F){
            return true;
        }else{
            return false;
        }
    }

    public static float getDigit() {
        return digit;
    }

    public static void setDigit(float digit) {
        Number.digit = digit;
    }

    public static String getDisplayNumber() {
        return displayNumber;
    }

    public static void setDisplayNumber(String displayNumber) {
        Number.displayNumber = displayNumber;
    }

    public static boolean isIsResult() {
        return isResult;
    }

    public static void setIsResult(boolean isResult) {
        Number.isResult = isResult;
    }

    public static char getLastOperation() {
        return lastOperation;
    }

    public static void setLastOperation(char lastOperation) {
        Number.lastOperation = lastOperation;
    }

    public static float getResult() {
        return result;
    }

    public static void setResult(float result) {
        Number.result = result;
    }
}
