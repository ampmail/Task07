package com.it.source;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    public static String calculateIncome(String checkedInputData) throws MyArithmeticException, MyIllegalArgumentException {
        BigDecimal result = null;
        BigDecimal inputAmount, profit = null;
        try {
            inputAmount = new BigDecimal(checkedInputData);
            for (Constants.RatioRangeDependence Range : Constants.RatioRangeDependence.values()) {
                if (inputAmount.compareTo(new BigDecimal(Range.LowBorder)) == 0 ||
                    (inputAmount.compareTo(new BigDecimal(Range.LowBorder)) == 1 &&
                      inputAmount.compareTo(new BigDecimal(Range.HiBorder)) == -1)  ) {
                    profit = new BigDecimal(Range.getProfit());
                    break;
                }
            }
            if (profit == null) {
                throw new MyArithmeticException();
            } else {
                result = inputAmount.multiply(profit);
                result = result.divide( new BigDecimal(100));
                result = inputAmount.add(result).setScale(2, RoundingMode.DOWN);
            }
        } catch (NumberFormatException e) {
            throw new MyIllegalArgumentException();
        }
        return result.toString();
    }

    public static void checkIncomingData(String incomingData) throws MyIllegalArgumentException {

        if (incomingData != null && incomingData.length() > 0) {
            String pattern = Constants.INCOMING_DATA_PATTERN_STRING;
            Pattern pat = Pattern.compile(pattern);
            Matcher mat = pat.matcher(incomingData);
            if (!mat.matches()) {
                throw new MyIllegalArgumentException(incomingData);
            }
            return;
        }
        throw new MyIllegalArgumentException("incoming data was not defined or invalid");
    }
}
