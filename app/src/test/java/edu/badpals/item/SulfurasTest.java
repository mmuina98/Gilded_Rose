package edu.badpals.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    public void testSellInUpdate(){
        Sulfuras zero = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        zero.update_item();
        assertEquals(0,zero.getSellIn()) ;
    }

    @Test
    public void testQualityUpdate(){
        Sulfuras zero = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        zero.update_item();
        zero.update_quality();
        assertEquals(80,zero.getQuality()) ;
        assertEquals(0,zero.getSellIn()) ;
    }

    @Test
    public void testSellInUpdateNegative(){
        Sulfuras zero = new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80);
        zero.update_item();
        zero.update_quality();
        assertEquals(80,zero.getQuality()) ;
        assertEquals(-1,zero.getSellIn()) ;
    }

    @Test
    public void testSellInUpdatePositive(){
        Sulfuras zero = new Sulfuras("Sulfuras, Hand of Ragnaros", 1, 80);
        zero.update_item();
        zero.update_quality();
        assertEquals(80,zero.getQuality()) ;
        assertEquals(1,zero.getSellIn()) ;
    }

}
