package edu.badpals.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {

    @Test
    public void testSellInUpdate(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", 3, 6);
        zero.update_item();
        assertEquals(2,zero.getSellIn()) ;
    }

    @Test
    public void testQualityUpdate(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", 3, 6);
        zero.update_item();
        assertEquals(4,zero.getQuality()) ;
    }

    @Test
    public void testQualityUpdateOverZero(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", 10, 1);
        zero.update_item();
        assertEquals(0,zero.getQuality()) ;
    }

    @Test
    public void testQualityUpdateZero(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", 0, 6);
        zero.update_item();
        assertEquals(2,zero.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", -1, 6);
        zero.update_item();
        assertEquals(2,zero.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero3(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", -1, 3);
        zero.update_item();
        assertEquals(0,zero.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero2(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", -1, 2);
        zero.update_item();
        assertEquals(0,zero.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero1(){
        ConjuredItem zero = new ConjuredItem("Conjured Mana Cake", -1, 1);
        zero.update_item();
        assertEquals(0,zero.getQuality()) ;
    }
}
