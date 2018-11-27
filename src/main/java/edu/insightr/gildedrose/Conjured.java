package edu.insightr.gildedrose;

public class Conjured extends Item{

    public Conjured()
    {
        super();
        this.name="Conjured Mana Cake";
        this.sellIn=3;
        this.quality=6;

    }

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

}
