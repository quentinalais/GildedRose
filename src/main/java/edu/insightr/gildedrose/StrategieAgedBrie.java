package edu.insightr.gildedrose;

public class StrategieAgedBrie implements UpdateStrategy {

    public int update(Item ab)
    {
        ab.setSellIn(ab.getSellIn()-1);

        if(ab.getQuality()<50)
        {
            ab.setQuality(ab.getQuality()+1);
        }

        if(ab.getSellIn() < 0){
            if(ab.getQuality() < 50){
                ab.setQuality(ab.getQuality()+1);
            }
        }

        if(ab.getQuality()>50)
        {
            ab.setQuality(50);
        }
        return ab.getQuality();
    }
}
