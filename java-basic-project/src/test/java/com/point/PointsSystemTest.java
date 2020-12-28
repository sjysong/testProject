package com.point;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PointsSystemTest {

    private List<PointsSystem> list = new ArrayList<PointsSystem>();
    CalculateDoublePoints calculateDoublePoints = new CalculateDoublePoints();

    @Test
    public void user_buy_XX_yuan_of_goods_will_get_XX_points() {
        PointsSystem generalGoods1 = new PointsSystem(10.88, 10);
        PointsSystem generalGoods2 = new PointsSystem(10.88, 10);
        PointsSystem generalGoods3 = new PointsSystem(10.88, 10);

        list.clear();
        list.add(generalGoods1);
        list.add(generalGoods2);
        list.add(generalGoods3);

        int getPoints = calculateDoublePoints.generalGoodsGetPoints(list);
        int expected = 326;

        Assert.assertEquals(expected, getPoints);
    }

    @Test
    public void user_buy_promotional_goods_will_get_doubled_points() {

        PointsSystem apple = new PointsSystem(PromotionGoodsEnum.Apples, 2.53, 15.25);
        PointsSystem beef = new PointsSystem(PromotionGoodsEnum.beef, 2.53, 15.25);
        PointsSystem watermelons = new PointsSystem(PromotionGoodsEnum.watermelons, 0.6, 102);
        PointsSystem milk = new PointsSystem(PromotionGoodsEnum.milk, 55.23, 3);

        list.clear();
        list.add(apple);
        list.add(beef);
        list.add(watermelons);
        list.add(milk);

        int getPoints = calculateDoublePoints.promotionGoodsDoublePoints(list);
        int expected = 608;

        Assert.assertEquals(expected, getPoints);
    }

    @Test
    public void total_price_more_than_1000_and_point_for_every_20_yuan_of_the_excess() {
        PointsSystem generalGoods1 = new PointsSystem(10.59, 235);

        list.clear();
        list.add(generalGoods1);

        int getPoints = calculateDoublePoints.generalGoodsGetPoints(list);
        int expected = 1074;

        Assert.assertEquals(expected, getPoints);
    }

    @Test
    public void promotional_goods_total_price_more_than_1000_and_point_for_every_1_yuan_of_the_excess(){
        PointsSystem TV = new PointsSystem(PromotionGoodsEnum.TV, 2000, 1);
        PointsSystem refrigerator = new PointsSystem(PromotionGoodsEnum.refrigerator, 2000, 1);

        list.clear();
        list.add(TV);
        list.add(refrigerator);

        int getPoints = calculateDoublePoints.promotionGoodsDoublePoints(list);
        int expected = 5000;

        Assert.assertEquals(expected, getPoints);
    }
}