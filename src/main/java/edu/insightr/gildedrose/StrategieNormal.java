package edu.insightr.gildedrose;

public class StrategieNormal implements UpdateStrategy{

    public void update(Item dk)
    {
        dk.setSellIn(dk.getSellIn()-1);

        if(dk.getSellIn()>=0)
        {
            dk.setQuality(dk.getQuality()-1);
        }
        else
        {

            dk.setQuality(dk.getQuality()-2);

        }
        if(dk.getQuality()<0)
        {
            dk.setQuality(0);
        }
    }


}
