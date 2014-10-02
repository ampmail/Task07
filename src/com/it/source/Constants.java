package com.it.source;

public class Constants {

    public static final String INCOMING_DATA_PATTERN_STRING = "[0-9]{0,10}[.]{0,1}[0-9]{0,2}";

    public enum RatioRangeDependence {
        FIRST_RANGE (0, 1000, 1.0),
        SECOND_RANGE(1000,  10000, 1.5),
        THIRD_RANGE (10000, 100000, 2.5),
        FOURTH_RANGE(100000, 1000000000, 5.0);

        Integer LowBorder;
        Integer HiBorder;
        Double Profit;

        RatioRangeDependence(Integer LowBorder, Integer HiBorder, Double Profit) {
            this.LowBorder = LowBorder;
            this.HiBorder = HiBorder;
            this.Profit = Profit;
        }
        Double getProfit() {
            return Profit;
        }
    }

}
