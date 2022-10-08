import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
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
