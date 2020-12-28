package com.point;


import net.sf.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class PointsSystemTest {

    private List<PointsSystem> list = new ArrayList<PointsSystem>();
    CalculateDoublePoints calculateDoublePoints = new CalculateDoublePoints();

    @Test
    public void user_buy_XX_yuan_of_goods_will_get_XX_points() {
        PointsSystem generalGoods1 = new PointsSystem("mil", 1, 10);
        PointsSystem generalGoods2 = new PointsSystem("mi", 10, 10);
        PointsSystem generalGoods3 = new PointsSystem("mik", 10, 10);

        list.clear();
        list.add(generalGoods1);
        list.add(generalGoods2);
        list.add(generalGoods3);

        int getPoints = calculateDoublePoints.getPoints(list);
        int expected = 210;

        Assert.assertEquals(expected, getPoints);
    }


    @Test
    public void user_buy_promotional_goods_will_get_doubled_points() {

        PointsSystem apple = new PointsSystem("Apples", 2.53, 15.25);
        PointsSystem beef = new PointsSystem("beef", 2.53, 15.25);
        PointsSystem watermelons = new PointsSystem("watermelons", 0.6, 102);
        PointsSystem milk = new PointsSystem("milk", 55.23, 3);

        list.clear();
        list.add(apple);
        list.add(beef);
        list.add(watermelons);
        list.add(milk);

        int getPoints = calculateDoublePoints.getPoints(list);
        int expected = 608;

        Assert.assertEquals(expected, getPoints);
    }

    @Test
    public void total_price_more_than_1000_and_point_for_every_20_yuan_of_the_excess() {
        PointsSystem generalGoods1 = new PointsSystem("generalGoodsName", 10.59, 235);

        list.clear();
        list.add(generalGoods1);

        int getPoints = calculateDoublePoints.getPoints(list);
        int expected = 1074;

        Assert.assertEquals(expected, getPoints);
    }

    @Test
    public void promotional_goods_total_price_more_than_1000_and_point_for_every_1_yuan_of_the_excess() {
        PointsSystem TV = new PointsSystem("TV", 2000, 1);
        PointsSystem refrigerator = new PointsSystem("refrigerator", 2000, 1);

        list.clear();
        list.add(TV);
        list.add(refrigerator);

        int getPoints = calculateDoublePoints.getPoints(list);
        int expected = 5000;

        Assert.assertEquals(expected, getPoints);
    }

    @Test
    public void buy_promotional_and_general_goods_and_total_price_exceeds_1000_yuan() {
        PointsSystem TV = new PointsSystem("TV", 2000, 1);//促销商品 TV
        PointsSystem ref = new PointsSystem("ref", 2000, 1);//普通商品
        PointsSystem milk = new PointsSystem("milk", 50.56, 10);//促销商品 milk
        PointsSystem re = new PointsSystem("re", 5000, 1);//普通商品

        list.clear();
        list.add(TV);
        list.add(ref);
        list.add(milk);
        list.add(re);

        int getPoints = calculateDoublePoints.getPoints(list);
        int expected = 3855;

        Assert.assertEquals(expected, getPoints);
    }
    @Test
    public void test1()
    {
        JSONObject object = new JSONObject();
        JSONObject object2 = new JSONObject();
        object.put("string","string");
        object.put("int",2);
        object.put("boolean",true);
        List<Integer> integers = Arrays.asList(1,2,3);
        object.put("list",integers);

        System.out.println(object.get("string"));


    /*    Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("name", "孙笑川");
        map.put("age", 25);
        map.put("height", 1.70);
        map.put("major", new String[] { "理发", "挖掘机" });
        map.put("hasGirlFriend", false);
        map.put("car", null);
        map.put("house", null);
        JSONObject object = new JSONObject();
        object.putAll(map);
        System.out.println(object.toString());*/

        //Assert.assertEquals("", object.toString());
    }
}