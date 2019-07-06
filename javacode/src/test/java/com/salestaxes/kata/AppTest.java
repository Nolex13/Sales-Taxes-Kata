package com.salestaxes.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.salestaxes.kata.products.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldCalculateValuesForInput1() {
        Book book = new Book();
        book.setQuantity(1);
        book.setPrice(12.49f);

        MusicCd musicCd = new MusicCd();
        musicCd.setQuantity(1);
        musicCd.setPrice(14.99f);

        ChocolateBar chocolateBar = new ChocolateBar();
        chocolateBar.setQuantity(1);
        chocolateBar.setPrice(0.85f);

        Cart cart = new Cart();
        cart.add(book);
        cart.add(musicCd);
        cart.add(chocolateBar);

        assertEquals(1.50f, cart.getTotalTaxes(), 2);
        assertEquals(29.83f, cart.getTotal(), 2);
    }

    @Test
    public void shouldCalculateValuesForInput2() {
        BoxChocolates boxChocolates = new BoxChocolates();
        boxChocolates.setQuantity(1);
        boxChocolates.setPrice(10.00f);
        boxChocolates.setAsImported(true);

        BottlePerfume bottlePerfume = new BottlePerfume();
        bottlePerfume.setQuantity(1);
        bottlePerfume.setPrice(47.50f);
        boxChocolates.setAsImported(true);

        Cart cart = new Cart();
        cart.add(boxChocolates);
        cart.add(bottlePerfume);

        assertEquals(7.65f, cart.getTotalTaxes(), 2);
        assertEquals(65.15f, cart.getTotal(), 2);
    }

    @Test
    public void shouldCalculateValuesForInput3() {
        BottlePerfume impBottlePerfume = new BottlePerfume();
        impBottlePerfume.setQuantity(1);
        impBottlePerfume.setPrice(27.99f);
        impBottlePerfume.setAsImported(true);

        BottlePerfume bottlePerfume = new BottlePerfume();
        bottlePerfume.setQuantity(1);
        bottlePerfume.setPrice(18.99f);

        HeadachePills headachePills = new HeadachePills();
        headachePills.setQuantity(1);
        headachePills.setPrice(9.75f);

        BoxChocolates boxChocolates = new BoxChocolates();
        boxChocolates.setQuantity(1);
        boxChocolates.setPrice(11.85f);
        boxChocolates.setAsImported(true);

        Cart cart = new Cart();
        cart.add(impBottlePerfume);
        cart.add(bottlePerfume);
        cart.add(headachePills);
        cart.add(boxChocolates);

        assertEquals(6.70f, cart.getTotalTaxes(), 2);
        assertEquals(74.68f, cart.getTotal(), 2);
    }
}
