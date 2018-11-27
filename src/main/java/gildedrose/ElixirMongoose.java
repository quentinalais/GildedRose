package edu.insightr.gildedrose;

public class ElixirMongoose extends Item{

    public String name ;
    public int sellin;
    public int quality;

    public ElixirMongoose()
    {
        super();
        this.name="Elixir of the Mongoose";
        this.sellin=5;
        this.quality=7;
    }
}