package edu.insightr.gildedrose;

public class Updater {

    public void update(Item item, String categorie) {

        UpdateStrategy strategyUpdate;

        switch (categorie) {
            case "Conjured Mana Cake":
                strategyUpdate = new StrategieConjured();
                break;

            case "+5 Dexterity Vest":
                strategyUpdate = new StrategieNormal();
                break;

            case "Aged Brie":
                strategyUpdate = new StrategieAgedBrie();
                break;

            case "Elixir of the Mongoose":
                strategyUpdate = new StrategieNormal();
                break;

            case "Backstage passes to a TAFKAL80ETC concert":
                strategyUpdate = new StrategieBackstage();
                break;

        }


    }
}

