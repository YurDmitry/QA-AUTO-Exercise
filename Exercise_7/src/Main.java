import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String number = sc.nextLine();
        try{
            int num = Integer.parseInt(number);
            if (num >= 0 && num < 10)
                System.out.println("Число: " + num + ".\nПоложительное число меньше 10 или ноль.");
            else System.out.println("Число: "+ num + ".\nПоложительное число больше(или равно) 10 или отрицательное." );
        }
        catch(NumberFormatException  e){
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        }
    }
}