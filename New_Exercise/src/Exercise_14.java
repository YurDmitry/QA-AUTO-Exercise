import java.util.stream.IntStream;
import java.util.Arrays;

public class Exercise_14 {
    public static void main(String[] args){
        int rows = 8, columns = 5;
        int[][] array = new int[rows][columns];
        int g1 = 10, g2 = 99;
        // Кстати, раз ты уже дошла до этой задачи, то я использую foreach в стриме))0)
        IntStream.range(0, rows)
                // Проходим по всем строкам
                .forEach(row -> IntStream.range(0, columns)
                        // Проходим по всем колонкам
                        // Заносим рандомное число из диапазона [10; 99] в элемент массива
                        .forEach(column -> array[row][column] = (int)(Math.random()*(g2 - 9)) + g1));

        for(int[] i: array){
            for(int j: i)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.print(Arrays.deepToString(array));
    }
}
