public class BMI {
    public double calculate(int mass, double height) {
        int m2 = 2;
        double bmi = mass / Math.pow(height, m2);
        return bmi;
    }
}
