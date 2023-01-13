import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise_13 {
    public static void main(String[] args){
        // Как уже говорил, не догнал как заполнить массив с помощью foreach(((
        // Поэтому изобретаю телегу, а не велосидеп
        int columns = 20;
        int[] array = new int[columns];
        array[0] = 1;
        array[1] = 1;
        IntStream.range(2, columns)
                        // Записываем сумму предыдущих двух элементов массива
                        .forEach(column -> {
                            array[column] = array[column-1]+array[column-2];
                        });

        for(int i:array){
            System.out.print(i + " ");
        }

        System.out.println("\n"+Arrays.toString(array));
    }
}
