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
        if(ab.getQuality()<50)
        {
            ab.setQuality(ab.getQuality()+1);
        }
        if(ab.getQuality()>50)
        {
            ab.setQuality(50);
        }
    }

    public void visit(Backstage bs)
    {
        if(bs.getSellIn()>0  )
        {
            if(bs.getQuality()<50)
            {
                if(bs.getSellIn()<=10)
                {
                    bs.setQuality(bs.getQuality()+2);
                }
                if(bs.getSellIn()<=5)
                {
                    bs.setQuality(bs.getQuality()+3);
                }
                else
                {
                    bs.setQuality(bs.getQuality()+1);

                }
            }
            else
            {
                bs.setQuality(50);
            }
        }
        else
        {
            bs.setQuality(0);
        }


    }


    public void visit(DexterityVest dv)
    {
        if(dv.getSellIn()>0)
        {
            dv.setQuality(dv.getQuality()-1);
        }
        else
        {
            dv.setQuality(dv.getQuality()-2);
        }
        if(dv.getQuality()<0)
        {
            dv.setQuality(0);
        }
    }

    public void visit(ElixirMongoose em)
    {
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
