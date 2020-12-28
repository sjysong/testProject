package com.point;

public class PointsSystem {
    double price;
    double amount;


    public PointsSystem(double price, double amount) {
        this.price = price;
        this.amount = amount;
    }

    public PointsSystem(PromotionGoodsEnum promotionGoodsEnum, double price, double amount) {
        for (PromotionGoodsEnum pge : PromotionGoodsEnum.values()) {
            if (pge.equals(promotionGoodsEnum)) {
                this.price = price;
                this.amount = amount;
                break;
            }
        }
    }

    public double totalPrice() {
        return this.price * this.amount;
    }
}
