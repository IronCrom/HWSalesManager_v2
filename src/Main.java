public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{0, 2, 3, 11, 5, 8});
        System.out.println("Максимальное количество продаж равно " + salesManager.max());
        System.out.println("Обрезанное среднее продаж равно " + salesManager.trimmedMean());
    }

}
