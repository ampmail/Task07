package com.it.source;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    public static String calculateIncome(String checkedInputData) throws ArithmeticException {
        BigDecimal result = null;

        try {
            result = new BigDecimal(checkedInputData);
        } catch (ArithmeticException e) {

        }
        return result.toString();
    }

    public static boolean checkIncomingData(String incomingData) throws MyIllegalArgumentException {

        if (incomingData != null && incomingData.length() > 0) {
            String pattern = Constants.INCOMING_DATA_PATTERN_STRING;
            Pattern pat = Pattern.compile(pattern);
            Matcher mat = pat.matcher(incomingData);
//            return (mat.find()) ? (true) : (false);
            if(!mat.find()){
                throw new MyIllegalArgumentException("Mismatch format data");
            }
        }
        throw new MyIllegalArgumentException("Incoming data was not defined or invalid");
    }
}
