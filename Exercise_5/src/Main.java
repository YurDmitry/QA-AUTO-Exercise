import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        System.out.println("Введите целое число: ");
        String number = scanner.nextLine();
        try{
            number1 = Integer.parseInt(number);
            if (number1%2 == 0)
            System.out.println("Число " + number1 + " является чётным.");
            else System.out.println("Число "+ number1 + " является нечётным." );
        }
        catch(NumberFormatException  e){
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        }
    }
}