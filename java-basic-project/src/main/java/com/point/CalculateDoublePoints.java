package com.point;

import java.util.List;

public class CalculateDoublePoints {

    private int points = 0;
    private double totalPrice = 0;
    private final double OVER_1000_TAG = 1000.00;
    private final int POINT_PER_20 = 20;
    private final int MULTIPLE_2 = 2;

    public int generalGoodsGetPoints(List<PointsSystem> list) {
        goodsTotalPrice(list);
        if (totalPrice <= OVER_1000_TAG) {
            return (int) Math.floor(totalPrice);
        } else {
            return (int) Math.floor(OVER_1000_TAG + (totalPrice - OVER_1000_TAG) / POINT_PER_20);
        }

    }

    public int promotionGoodsDoublePoints(List<PointsSystem> list) {
        goodsTotalPrice(list);
        if (totalPrice <= OVER_1000_TAG) {
            return (int) Math.floor(totalPrice) * MULTIPLE_2;
        } else {
            return (int) Math.floor(OVER_1000_TAG * MULTIPLE_2 + (totalPrice - OVER_1000_TAG));
        }
    }

    private double goodsTotalPrice(List<PointsSystem> list) {
        if (list.size() != 0) {
            for (PointsSystem PS : list) {
                totalPrice += PS.totalPrice();
            }
        }
        return totalPrice;
    }
}
