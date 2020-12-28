package com.point;

import java.util.ArrayList;
import java.util.List;


public class CalculateDoublePoints {

    private final int promotionalGoodsTotalExceeds_1000_Tag = 2000;
    private final double OVER_1000_TAG = 1000.00;
    private final int POINT_PER_20 = 20;
    private final int MULTIPLE_2 = 2;
    private double generalGoodsTotal;
    private double promotionalGoodsTotal;
    private List<Double> list = new ArrayList<Double>(2);


    public int getPoints(List<PointsSystem> listPS) {
        PointsSystem pointsSystem = new PointsSystem();
        list = pointsSystem.getGoodsPriceList(listPS);
        generalGoodsTotal = list.get(0);
        promotionalGoodsTotal = list.get(1);

        if (buy_promotional_and_general_goods_and_total_price_exceeds_1000()) {
            int pgp = promotionalGoodsTotalPoints(promotionalGoodsTotal);
            int ot = 0, gpo = 0, ggt = 0;
            if (pgp <= promotionalGoodsTotalExceeds_1000_Tag) {
                ot = (int) Math.floor(OVER_1000_TAG - promotionalGoodsTotal);
                gpo = (int) Math.floor((generalGoodsTotal + promotionalGoodsTotal - OVER_1000_TAG) / POINT_PER_20);
            } else {
                //促销商品>1000
                ggt = (int) Math.floor(generalGoodsTotal / POINT_PER_20);
            }
            return pgp + ot + gpo + ggt;
        }
        return promotionalGoodsTotalPoints(promotionalGoodsTotal) + generalGoodsTotalPoints(generalGoodsTotal);
    }

    private int promotionalGoodsTotalPoints(double promotionalGoodsTotal) {
        int pgt_0 = 0, pgt_1000 = 0;
        if (promotionalGoodsTotal >= 0 && promotionalGoodsTotal <= OVER_1000_TAG) {
            pgt_0 = (int) Math.floor(promotionalGoodsTotal) * MULTIPLE_2;
        }
        if (promotionalGoodsTotal > OVER_1000_TAG) {
            pgt_1000 = (int) Math.floor(OVER_1000_TAG * MULTIPLE_2 + (promotionalGoodsTotal - OVER_1000_TAG));
        }
        return pgt_0 + pgt_1000;
    }

    private int generalGoodsTotalPoints(double generalGoodsTotal) {
        int ggt_0 = 0, ggt_1000 = 0;
        if (generalGoodsTotal >= 0 && generalGoodsTotal <= OVER_1000_TAG) {
            ggt_0 = (int) Math.floor(generalGoodsTotal);
        }
        if (generalGoodsTotal > OVER_1000_TAG) {
            ggt_1000 = (int) Math.floor(OVER_1000_TAG + (generalGoodsTotal - OVER_1000_TAG) / POINT_PER_20);
        }
        return ggt_0 + ggt_1000;
    }

    private boolean buy_promotional_and_general_goods_and_total_price_exceeds_1000() {
        return generalGoodsTotal + promotionalGoodsTotal > OVER_1000_TAG && promotionalGoodsTotal > 0 && generalGoodsTotal > 0;
    }
}
