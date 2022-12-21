public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i + ".");
            i++;
        }
        System.out.println();
        i = 1;
        while (i <= 10) {
            System.out.print("Task" + i + ". ");
            i++;
        }
    }
}