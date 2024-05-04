package edu.badpals;

import edu.badpals.gildedRose.GildedRose;
import edu.badpals.item.*;

public class App {

    public static void main(String[] args) {
                // todo shop variable name to a better one
        GildedRose shop = new GildedRose();

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

        System.out.println(
                "======================================================================================\n" +

                "\n" +
                "  /$$$$$$ /$$/$$      /$$               /$$       /$$$$$$$                            \n" +
                " /$$__  $|__| $$     | $$              | $$      | $$__  $$                           \n" +
                "| $$  \\__//$| $$ /$$$$$$$ /$$$$$$  /$$$$$$$      | $$  \\ $$ /$$$$$$  /$$$$$$$ /$$$$$$ \n" +
                "| $$ /$$$| $| $$/$$__  $$/$$__  $$/$$__  $$      | $$$$$$$//$$__  $$/$$_____//$$__  $$\n" +
                "| $$|_  $| $| $| $$  | $| $$$$$$$| $$  | $$      | $$__  $| $$  \\ $|  $$$$$$| $$$$$$$$\n" +
                "| $$  \\ $| $| $| $$  | $| $$_____| $$  | $$      | $$  \\ $| $$  | $$\\____  $| $$_____/\n" +
                "|  $$$$$$| $| $|  $$$$$$|  $$$$$$|  $$$$$$$      | $$  | $|  $$$$$$//$$$$$$$|  $$$$$$$\n" +
                " \\______/|__|__/\\_______/\\_______/\\_______/      |__/  |__/\\______/|_______/ \\_______/\n" +
                "                                                                                      \n" +
                "======================================================================================\n"
        );
        System.out.println("------ ITEMS ANTES DE ACTUALIZAR ------\n");
        System.out.println(shop.toString());
        shop.updateItems();
        System.out.println("------ ITEMS DESPUES DE ACTUALIZAR ------\n" );
        System.out.println(shop.toString());
    }
}
