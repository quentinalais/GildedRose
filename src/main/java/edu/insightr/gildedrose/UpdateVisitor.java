package edu.insightr.gildedrose;

public  class UpdateVisitor implements IVisitor {


    public void visit(Item v)
    {
        if(v.getClass()==AgedBrie.class)
        {
            visit((AgedBrie)v);
        }
        else if(v.getClass()== Conjured.class)
        {
            visit((Conjured)v);
        }
        else if(v.getClass()==ElixirMongoose.class)
        {

            visit((ElixirMongoose)v);
        }
        else if(v.getClass()==Backstage.class)
        {
            visit((Backstage)v);
        }
        else if(v.getClass()==DexterityVest.class)
        {
            visit((DexterityVest)v);
        }
    }

    public void visit(AgedBrie ab)
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

    }

    public void visit(Backstage bk)
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

    }


    public void visit(DexterityVest dk)
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

    public void visit(ElixirMongoose em)
    {
        em.setSellIn(em.getSellIn()-1);

        if(em.getSellIn()>0)
        {
            em.setQuality(em.getQuality()-1);
        }
        else
        {
            em.setQuality(em.getQuality()-2);
        }
        if(em.getQuality()<0)
        {
            em.setQuality(0);
        }
    }

    public void visit(Conjured cj)
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
    }






}
