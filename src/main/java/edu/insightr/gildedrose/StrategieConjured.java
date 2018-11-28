package edu.insightr.gildedrose;

public class StrategieConjured implements UpdateStrategy{

    public int update(Item cj)
    {
        cj.setSellIn(cj.getSellIn()-1);

        if(cj.getSellIn()>0)
        {
            cj.setQuality(cj.getQuality()-2);
        }
        else
        {
            cj.setQuality(cj.getQuality()-4);
        }
        if(cj.getQuality()<0)
        {
            cj.setQuality(0);
        }

        return cj.getQuality();
    }


}
