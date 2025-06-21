public class FinancialForecast {

    
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;  
        } else {
            return calculateFutureValue(presentValue * (1 + rate), rate, years - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.05; 
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
