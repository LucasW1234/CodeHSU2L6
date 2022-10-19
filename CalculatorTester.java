public class CalculatorTester {
    public static void main(String[] args) {
        Calculator newAverage = new Calculator();
        
        double firstAverage = newAverage.calcAverage(20,15.4);
        double secondAverage = newAverage.calcAverage(5,8,6.4);
        System.out.println(firstAverage);        
        System.out.println(secondAverage);
    }
}