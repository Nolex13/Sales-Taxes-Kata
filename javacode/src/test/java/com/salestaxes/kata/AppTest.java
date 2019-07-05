package com.salestaxes.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.salestaxes.kata.products.Book;
import com.salestaxes.kata.products.MusicCd;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldCalculateBookTaxes() {
        Book book = new Book();
        book.setQuantity(1);
        book.setPrice(12.49f);

        assertEquals(0.0f, book.getTax(), 2);
    }

    @Test
    public void shouldCalculateMusicCdTaxes() {
        MusicCd musicCd = new MusicCd();
        musicCd.setQuantity(1);
        musicCd.setPrice(14.99f);

        assertEquals(1.5f, musicCd.getTax(), 2);
    }
}
