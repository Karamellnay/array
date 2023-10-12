package org.example.array.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayServiceTest {

    @Test
    public void sumSale() {
        ArrayService service = new ArrayService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSale() {
        ArrayService service = new ArrayService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSale() {
        ArrayService service = new ArrayService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMax(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSale() {
        ArrayService service = new ArrayService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMin(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beLowAverage() {
        ArrayService service = new ArrayService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthsBeLowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverage() {
        ArrayService service = new ArrayService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthsAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
