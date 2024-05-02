package edu.badpals.item;

public class NormalItem extends Item implements Updateable{


     NormalItem(String name, int sellIn, int quality) {
         super(name,sellIn, quality);
    }

    public int getQuality(){
         return this.quality;
    }

    public int getSellIn(){
        return this.sellIn;
    }

    @Override
    public void update_item() {
         this.sellIn -= 1;

    }

    @Override
    public void update_quality() {

         if (this.sellIn <= 0){
             this.quality -= 2 ;
         } else {
             this.quality -= 1 ;
         }

    }
}
