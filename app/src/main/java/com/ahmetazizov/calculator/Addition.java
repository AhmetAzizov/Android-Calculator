package com.ahmetazizov.calculator;

public class Addition extends Number{
      Addition(){
          if (isNull()){
              setResult(Float.parseFloat(getDisplayNumber()));
              setDigit(0);
          }else{
              setDigit(Float.parseFloat(getDisplayNumber()));
              float temporaryResult = getResult();
              temporaryResult += getDigit();
              setResult(temporaryResult);
          }

          if (!isIsResult()) setDisplayNumber("");
     }
}
