package edu.insightr.gildedrose;

public abstract class Item {

    private String name;
    private int sellIn;

    private int quality;

    public Item()
    {

    }

    public Item(String name, int sellIn, int quality) {

        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void accept( IVisitor v )
    {

        v.visit(this);
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