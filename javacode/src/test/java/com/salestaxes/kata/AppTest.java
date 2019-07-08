package com.salestaxes.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.salestaxes.kata.products.*;
import com.salestaxes.kata.utilities.BigDecimalUtilites;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void roundToNearest5Cent(){
        assertEquals(
                new BigDecimal("1.05"),
                BigDecimalUtilites.round(new BigDecimal("1.03")));
        assertEquals(
                new BigDecimal("1.10"),
                BigDecimalUtilites.round(new BigDecimal("1.051")));
        assertEquals(
                new BigDecimal("1.05"),
                BigDecimalUtilites.round(new BigDecimal("1.05")));
        assertEquals(
                new BigDecimal("1.95"),
                BigDecimalUtilites.round(new BigDecimal("1.900001")));
    }

    @Test
    public void shouldCalculatePriceForEachProduct1(){
        Book book = new Book();
        book.setQuantity(1);
        book.setPrice(new BigDecimal("12.49"));

        MusicCd musicCd = new MusicCd();
        musicCd.setQuantity(1);
        musicCd.setPrice(new BigDecimal("14.99"));

        ChocolateBar chocolateBar = new ChocolateBar();
        chocolateBar.setQuantity(1);
        chocolateBar.setPrice(new BigDecimal("0.85"));

        assertEquals(new BigDecimal("12.49"), book.getFinalPrice());
        assertEquals(new BigDecimal("16.49"), musicCd.getFinalPrice());
        assertEquals(new BigDecimal("0.85"), chocolateBar.getFinalPrice());
    }

    @Test
    public void shouldCalculatePriceForEachProduct2(){
        BoxChocolates boxChocolates = new BoxChocolates();
        boxChocolates.setQuantity(1);
        boxChocolates.setPrice(new BigDecimal("10.00"));
        boxChocolates.setAsImported(true);

        BottlePerfume bottlePerfume = new BottlePerfume();
        bottlePerfume.setQuantity(1);
        bottlePerfume.setPrice(new BigDecimal("47.50"));
        bottlePerfume.setAsImported(true);

        assertEquals(new BigDecimal("10.50"), boxChocolates.getFinalPrice());
        assertEquals(new BigDecimal("54.65"), bottlePerfume.getFinalPrice());
    }

    @Test
    public void shouldCalculatePriceForEachProduct3(){
        BottlePerfume impBottlePerfume = new BottlePerfume();
        impBottlePerfume.setQuantity(1);
        impBottlePerfume.setPrice(new BigDecimal("27.99"));
        impBottlePerfume.setAsImported(true);

        BottlePerfume bottlePerfume = new BottlePerfume();
        bottlePerfume.setQuantity(1);
        bottlePerfume.setPrice(new BigDecimal("18.99"));

        HeadachePills headachePills = new HeadachePills();
        headachePills.setQuantity(1);
        headachePills.setPrice(new BigDecimal("9.75"));

        BoxChocolates boxChocolates = new BoxChocolates();
        boxChocolates.setQuantity(1);
        boxChocolates.setPrice(new BigDecimal("11.25"));
        boxChocolates.setAsImported(true);

        assertEquals(new BigDecimal("32.19"), impBottlePerfume.getFinalPrice());
        assertEquals(new BigDecimal("20.89"), bottlePerfume.getFinalPrice());
        assertEquals(new BigDecimal("9.75"), headachePills.getFinalPrice());
        assertEquals(new BigDecimal("11.85"), boxChocolates.getFinalPrice());
    }

    @Test
    public void shouldCalculateValuesForInput1() {
        Book book = new Book();
        book.setQuantity(1);
        book.setPrice(new BigDecimal("12.49"));

        MusicCd musicCd = new MusicCd();
        musicCd.setQuantity(1);
        musicCd.setPrice(new BigDecimal("14.99"));

        ChocolateBar chocolateBar = new ChocolateBar();
        chocolateBar.setQuantity(1);
        chocolateBar.setPrice(new BigDecimal("0.85"));

        Cart cart = new Cart();
        cart.add(book);
        cart.add(musicCd);
        cart.add(chocolateBar);

        assertEquals(new BigDecimal("1.50"), cart.getTotalTaxes());
        assertEquals(new BigDecimal("29.83"), cart.getTotal());
    }

    @Test
    public void shouldCalculateValuesForInput2() {
        BoxChocolates boxChocolates = new BoxChocolates();
        boxChocolates.setQuantity(1);
        boxChocolates.setPrice(new BigDecimal("10.00"));
        boxChocolates.setAsImported(true);

        BottlePerfume bottlePerfume = new BottlePerfume();
        bottlePerfume.setQuantity(1);
        bottlePerfume.setPrice(new BigDecimal("47.50"));
        bottlePerfume.setAsImported(true);

        Cart cart = new Cart();
        cart.add(boxChocolates);
        cart.add(bottlePerfume);

        assertEquals(new BigDecimal("7.65"), cart.getTotalTaxes());
        assertEquals(new BigDecimal("65.15"), cart.getTotal());
    }

    @Test
    public void shouldCalculateValuesForInput3() {
        BottlePerfume impBottlePerfume = new BottlePerfume();
        impBottlePerfume.setQuantity(1);
        impBottlePerfume.setPrice(new BigDecimal("27.99"));
        impBottlePerfume.setAsImported(true);

        BottlePerfume bottlePerfume = new BottlePerfume();
        bottlePerfume.setQuantity(1);
        bottlePerfume.setPrice(new BigDecimal("18.99"));

        HeadachePills headachePills = new HeadachePills();
        headachePills.setQuantity(1);
        headachePills.setPrice(new BigDecimal("9.75"));

        BoxChocolates boxChocolates = new BoxChocolates();
        boxChocolates.setQuantity(1);
        boxChocolates.setPrice(new BigDecimal("11.25"));
        boxChocolates.setAsImported(true);

        Cart cart = new Cart();
        cart.add(impBottlePerfume);
        cart.add(bottlePerfume);
        cart.add(headachePills);
        cart.add(boxChocolates);

        assertEquals(new BigDecimal("6.70"), cart.getTotalTaxes());
        assertEquals(new BigDecimal("74.68"), cart.getTotal());
    }

    @Test
    public void shouldCalculateValuesForProductsWithMoreQuantities() {
        Book book = new Book();
        book.setQuantity(2);
        book.setPrice(new BigDecimal("12.49"));
        //24.98

        MusicCd musicCd = new MusicCd();
        musicCd.setQuantity(3);
        musicCd.setPrice(new BigDecimal("14.99"));
        musicCd.setAsImported(true);
        //44.97 + 4,50 + 2,25 = 6,75 | 51,72

        ChocolateBar chocolateBar = new ChocolateBar();
        chocolateBar.setQuantity(2);
        chocolateBar.setPrice(new BigDecimal("0.85"));
        chocolateBar.setAsImported(true);
        //1,7 + 0,10 = 0,10 | 1,8

        Cart cart = new Cart();
        cart.add(book);
        cart.add(musicCd);
        cart.add(chocolateBar);

        assertEquals(new BigDecimal("6.85"), cart.getTotalTaxes());
        assertEquals(new BigDecimal("78.50"), cart.getTotal());
    }
}
