package edu.badpals.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    public void testSellInUpdate(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", 10, 20);
        zero.update_item();
        assertEquals(9,zero.getSellIn()) ;
    }

    @Test
    public void testSellInZero(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", 0, 20);
        zero.update_quality();
        assertEquals(18,zero.getQuality()) ;
    }
    @Test
    public void testSellInPositive(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", 10, 20);
        zero.update_quality();
        assertEquals(19,zero.getQuality()) ;
    }
    @Test
    public void testSellInNegative(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", -1, 20);
        zero.update_quality();
        assertEquals(18,zero.getQuality()) ;
    }

    @Test
    public void testQualityEqualsOne(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", 10, 1);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityEqualsOneNegativeSellIn(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", -1, 1);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityEqualsZero(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", 10, 0);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityEqualsZeroNegativeSellIn(){
        NormalItem zero = new NormalItem("+5 Dexterity Vest", -1, 0);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }


}
