package ru.netology.stats;

public class StatsService {
    public long totalSalesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum+=sale;
        }
        return sum;
    }

    public long averageMonthlySales(long[] sales) {
        long sum = totalSalesSum(sales);
        return sum / sales.length;
    }

    public long peakSalesMonth(long[] sales) {
        int peakSales = 0;
        for (int i = 1; i < sales.length; i++){
            if (sales[i] >= sales[peakSales]) {
                peakSales = i;
            }
        }
         return peakSales + 1;
        }

    public long lowestSalesMonth(long[] sales) {
        int lowestSales = 0;
        for (int i = 1; i < sales.length; i++){
            if (sales[i] < sales[lowestSales]) {
                lowestSales = i;
            }
        }
        return lowestSales + 1;
    }

    public long underAverageMonthQuantity(long[] sales) {
        long averageMonth = averageMonthlySales(sales);
        int quantity = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonth) {
                quantity++;
            }
        }
        return quantity;
    }

    public long overAverageMonthQuantity(long[] sales) {
        long averageMonth = averageMonthlySales(sales);
        int quantity = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonth) {
                quantity++;
            }
        }
        return quantity;
    }
    }


