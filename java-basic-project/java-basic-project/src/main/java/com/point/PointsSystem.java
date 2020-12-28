package com.point;

import java.util.ArrayList;
import java.util.List;

public class PointsSystem {
    private double price;
    private double amount;
    private String goondsName;

    private double promotionalGoodsTotal = 0;
    private double generalGoodsTotal = 0;
    private List<Double> list = new ArrayList<Double>(2);

    public PointsSystem() {

    }

    public PointsSystem(String goondsName, double price, double amount) {
        this.goondsName = goondsName;
        this.price = price;
        this.amount = amount;
    }

    public List<Double> getGoodsPriceList(List<PointsSystem> listPS) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (PromotionGoodsEnum pge : PromotionGoodsEnum.values()) {
            arrayList.add(pge.toString());
        }

        for (PointsSystem Ps : listPS) {
            if (arrayList.contains(Ps.goondsName)) {
                promotionalGoodsTotal += Ps.amount * Ps.price;
            } else {
                generalGoodsTotal += Ps.amount * Ps.price;
            }
        }
        list.add(generalGoodsTotal);
        list.add(promotionalGoodsTotal);
        return list;
    }

}
