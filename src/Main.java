public class Main {
    public static void main(String[] args) {
        BMI service = new BMI();
        int mass = 82;
        double height = 1.71;
        double bmi = service.calculate(mass,height);
        System.out.printf("%.2f",bmi);
    }
}
