import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели (1-7) или название дня недели: ");
        String day = sc.nextLine();
        day = day.substring(0,1).toUpperCase() + day.substring(1);
        switch(day.trim()) {
            case "1" :
                System.out.println("Понедельник.");
                break;
            case "2":
                System.out.println("Вторник.");
                break;
            case "3":
                System.out.println("Среда.");
                break;
            case "4":
                System.out.println("Четверг.");
                break;
            case "5":
                System.out.println("Пятница.");
                break;
            case "6":
                System.out.println("Суббота.");
                break;
            case "7":
                System.out.println("Воскресенье.");
                break;
            case "Понедельник":
            case "Monday" :
                System.out.println("День недели: 1.");
                break;
            case "Вторник":
            case "Tuesday" :
                System.out.println("День недели: 2.");
                break;
            case "Среда":
            case "Wednesday" :
                System.out.println("День недели: 3.");
                break;
            case "Четверг":
            case "Thursday" :
                System.out.println("День недели: 4.");
                break;
            case "Пятница":
            case "Friday" :
                System.out.println("День недели: 5.");
                break;
            case "Суббота":
            case "Saturday" :
                System.out.println("День недели: 6.");
                break;
            case "Воскресенье":
            case "Sunday" :
                System.out.println("День недели: 7.");
                break;
            default:
                System.out.println("Введённое значение не относится к определениям дней недели.");
                break;
        }
    }
}