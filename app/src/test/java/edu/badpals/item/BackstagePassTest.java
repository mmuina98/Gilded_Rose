
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
    public void testQualityOver10Days(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 20, 20);
        zero.update_quality();
        assertEquals(21,zero.getQuality()) ;
    }

    @Test
    public void testQualityUnderOr10Days(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        zero.update_quality();
        assertEquals(22,zero.getQuality()) ;
    }

    @Test
    public void testQualityUnderOr5Days(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        zero.update_quality();
        assertEquals(23,zero.getQuality()) ;
    }

    @Test
    public void testQuality1Day(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 1, 20);
        zero.update_quality();
        assertEquals(23,zero.getQuality()) ;
    }

    @Test
    public void testQuality0Day(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityNegativeDays(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", -1, 20);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityOver10DaysLimit50(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 20, 50);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }

    @Test
    public void testQualityUnder10DaysLimit50(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 50);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }
    @Test
    public void testQualityOver5DaysLimit50(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 50);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }

    @Test
    public void testQualityUnder0DaysLimit50(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", -1, 50);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityOver10DaysLimit49(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 20, 49);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }

    @Test
    public void testQualityUnder10DaysLimit49(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }
    @Test
    public void testQualityOver5DaysLimit49(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }

    @Test
    public void testQualityUnder0DaysLimit49(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", -1, 49);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityOver10DaysLimit48(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 20, 48);
        zero.update_quality();
        assertEquals(49,zero.getQuality());
    }

    @Test
    public void testQualityUnder10DaysLimit48(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 48);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }
    @Test
    public void testQualityOver5DaysLimit48(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 48);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }

    @Test
    public void testQualityUnder0DaysLimit48(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", -1, 48);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }

    @Test
    public void testQualityOver10DaysLimit47(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 20, 47);
        zero.update_quality();
        assertEquals(48,zero.getQuality());
    }

    @Test
    public void testQualityUnder10DaysLimit47(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 47);
        zero.update_quality();
        assertEquals(49,zero.getQuality());
    }
    @Test
    public void testQualityOver5DaysLimit47(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 47);
        zero.update_quality();
        assertEquals(50,zero.getQuality());
    }

    @Test
    public void testQualityUnder0DaysLimit47(){
        BackstagePass zero = new BackstagePass("Backstage passes to a TAFKAL80ETC concert", -1, 47);
        zero.update_quality();
        assertEquals(0,zero.getQuality());
    }


}
