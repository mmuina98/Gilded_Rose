package edu.badpals.gildedRose;

import edu.badpals.item.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    private static GildedRose shop;

    @BeforeAll
    public static void createList(){

        shop = new GildedRose();

        ConjuredItem conjuredItem = new ConjuredItem("ConjuredItem",10,10);
        BackstagePass backstagePass = new BackstagePass("BackstagePass",10,10);
        NormalItem normalItem = new NormalItem("NormalItem",10,10);
        Sulfuras sulfuras = new Sulfuras("Sulfuras",0,20);
        AgedBrie agedBrie = new AgedBrie("AgedBrie",10,10);

        shop.addItem(conjuredItem);
        shop.addItem(backstagePass);
        shop.addItem(normalItem);
        shop.addItem(sulfuras);
        shop.addItem(agedBrie);
    }

    @Test
    public void testAddItem() {

        ConjuredItem conjuredItem = new ConjuredItem("ConjuredItem",10,10);
        shop.addItem(conjuredItem);
        assertEquals(6, shop.getInventory().size());
    }

    @Test
    public void testUpdateItems(){

        shop.updateItems();
        assertEquals(8,shop.getInventory().get(0).getQuality());
        assertEquals(9,shop.getInventory().get(0).getSellIn());

    }

    @Test
    public void testUpdateSulfuras(){

        shop.updateItems();
        assertEquals(80,shop.getInventory().get(3).getQuality());
        assertEquals(0,shop.getInventory().get(3).getSellIn());

    }

}