package edu.badpals.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassTest {

    @Test
    public void testSellInUpdate(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        zero.update_item();
        assertEquals(9,zero.getSellIn()) ;
    }

    @Test
    public void testSellInZero(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 12, 20);
        zero.update_quality();
        assertEquals(21,zero.getQuality()) ;
    }

    @Test
    public void testSellInPositive(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        zero.update_quality();
        assertEquals(23,zero.getQuality()) ;
    }

    @Test
    public void testSellInPositive(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        zero.update_quality();
        assertEquals(23,zero.getQuality()) ;
    }
    @Test
    public void testSellInNegative(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        zero.update_quality();
        assertEquals(22,zero.getQuality()) ;
    }

}
