package edu.insightr.gildedrose;

public class StrategieBackstage implements UpdateStrategy {

    public int update(Item bk)
    {
        bk.setSellIn(bk.getSellIn()-1);

        if(bk.sellIn>0 )
        {
            if(bk.getQuality()<50)
            {
                if(bk.getSellIn() > 10){
                    bk.setQuality(bk.getQuality()+1);
                }
                if(bk.getSellIn()<=10)
                {
                    bk.setQuality(bk.getQuality()+2);
                }
                if(bk.getSellIn()<=5)
                {
                    bk.setQuality(bk.getQuality()+1);
                }
            }

            else
            {
                bk.setQuality(50);
            }
        }
        else
        {
            bk.setQuality(0);
        }

        return bk.getQuality();

    }
}
