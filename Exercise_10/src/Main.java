public class Main {
    public static void main(String[] args) {
        int n = (int)(Math.random()*6);
        long S = 1;
        System.out.println("Число: " + n);
        if (n > 1)
            for (int i = 2; i <= n; i++)
                S *= i;
        System.out.println("Факториал числа равен: " + S);
    }
}