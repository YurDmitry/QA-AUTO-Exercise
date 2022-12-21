public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double result = (a+b+c)/3;
        System.out.println("Результат равен: " + result);
    }
}