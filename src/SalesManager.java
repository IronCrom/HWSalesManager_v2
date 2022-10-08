import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimmedMean() {
        int trimmedSum = 0;
        Arrays.sort(sales);
        for (int i = 1; i < (sales.length - 1); ++i){
            trimmedSum += sales[i];
        }
        return trimmedSum / (sales.length - 2 );
    }
}
