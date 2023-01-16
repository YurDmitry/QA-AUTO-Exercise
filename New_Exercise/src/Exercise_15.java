import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise_15 {
    public static void main(String[] args){
        int columns = 11;
        int g1 = -1, g2 = 1;
        int kol_1 = 0, kol_0 = 0, kol__1 = 0;
        int[] array = new int[columns];

        IntStream.range(0, columns)
                .forEach(column -> array[column] = (int)(Math.random()*(g2 + 2)) + g1);

        for(int i:array) {
            System.out.print(i + " ");
            if (i == -1) kol__1++;
                else if (i == 0) kol_0++;
                    else if (i == 1) kol_1++;
        }

        System.out.println("\n" + Arrays.toString(array));

        if(kol__1 > kol_0 && kol__1 > kol_1) System.out.printf("Чаще встречается %d. Всего %d раз.\n", -1, kol__1);
            else if (kol_0 > kol__1 && kol_0 > kol_1) System.out.printf("Чаще встречается %d. Всего %d раз.\n", 0, kol_0);
                else if (kol_1 > kol_0 && kol_1 > kol__1) System.out.printf("Чаще встречается %d. Всего %d раз.\n", 1, kol_1);
    }
}
