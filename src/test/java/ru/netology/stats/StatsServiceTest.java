package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void totalSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalSalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageMonthlySales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void peakSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.peakSalesMonth(sales);
        assertEquals(expected, actual);
    }


    @Test
    void lowestSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.lowestSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void underAverageMonthQuantity() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.underAverageMonthQuantity(sales);
        assertEquals(expected, actual);
    }

    @Test
    void overAverageMonthQuantity() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.overAverageMonthQuantity(sales);
        assertEquals(expected, actual);
    }
}