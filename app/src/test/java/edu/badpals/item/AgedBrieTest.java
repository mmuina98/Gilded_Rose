package edu.badpals.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    public void testSellInUpdate(){
        AgedBrie zero = new AgedBrie("Aged Brie", 10, 20);
        zero.update_item();
        assertEquals(9,zero.getSellIn()) ;
    }

    @Test
    public void testSellInZero(){
        AgedBrie zero = new AgedBrie("Aged Brie", 0, 20);
        zero.update_quality();
        assertEquals(22,zero.getQuality()) ;
    }
    @Test
    public void testSellInPositive(){
        AgedBrie zero = new AgedBrie("Aged Brie", 10, 20);
        zero.update_quality();
        assertEquals(21,zero.getQuality()) ;
    }
    @Test
    public void testSellInNegative(){
        AgedBrie zero = new AgedBrie("Aged Brie", -1, 20);
        zero.update_quality();
        assertEquals(22,zero.getQuality()) ;
    }

}
