package edu.insightr.gildedrose;

public class ElixirMongoose extends Item{



    public ElixirMongoose()
    {
        super();
        this.name="Elixir of the Mongoose";
        this.sellIn=5;
        this.quality=7;
    }

    public ElixirMongoose(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

}