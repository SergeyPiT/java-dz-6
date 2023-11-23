package ru.netology.stats;
public class StatsService {

    public long allSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long averSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averSales = averSales + sales[i];
        }
        long average = averSales / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public  int amountMonthsMinAverageSales(long[] sales) {
        int calcMonths = 0;
        long averSales = averageSales(sales);
        for (long l : sales) {
            if (l < averSales) {
                calcMonths++;
            }
        }
        return calcMonths;
    }

    public  int amountMonthsMaxAverageSales(long[] sales) {
        int calcMonths = 0;
        long averSales = averageSales(sales);
        for (long l : sales) {
            if (l > averSales) {
                calcMonths++;
            }
        }
        return calcMonths;
    }
}
