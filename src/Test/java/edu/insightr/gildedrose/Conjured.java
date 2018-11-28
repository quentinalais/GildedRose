package edu.insightr.gildedrose;
import org.junit.jupiter.api.Test;

 //import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.Is.is;
import static  org.junit.Assert.assertThat;



public class Conjured {

    @Test
    public void qualityCheck()throws Exception{
        Inventory inventory = new Inventory();
        Item[] items = inventory.getItems();

        Item itemConjured = items[5];
        assertThat(itemConjured.getName(),is("Conjured Mana Cake"));
        assertThat(itemConjured.getQuality(),is(6));
        inventory.updateQuality();
        assertThat(itemConjured.getQuality(),is(4));
    }

}
