package com.salestaxes.kata;

import com.salestaxes.kata.products.*;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        example1();
        example2();
        example3();
    }

    public static void example1(){
        System.out.println("\nOutput 1:");

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

        System.out.println(cart.toString());
    }

    public static void example2(){
        System.out.println("\nOutput 2:");

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

        System.out.println(cart.toString());
    }

    public static void example3(){
        System.out.println("\nOutput 3:");

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

        System.out.println(cart.toString());
    }
}
