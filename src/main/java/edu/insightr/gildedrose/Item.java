package edu.insightr.gildedrose;

public  class Item {

    protected String name;
    protected int sellIn;

    protected int quality;



    public Item(String name, int sellIn, int quality) {

        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }
}