import java.util.stream.IntStream;
public class Exercise_12 {
    public static void main(String[] args){
        // Видимо я глуп, чтобы заполнить массив чётными числа из диапазона [10; 20] с помощью foreach
      //int[] array = {10, 12, 14, 16, 18, 20};

        // Но могу заполнить иначе)))))
        // Тут вроде не супер логика, но я прохожу от 5 до 10 и умножаю каждое число на 2
        // из-за этого я получаю масив чётных чисел из диапазаона [10; 20]
        int[] array = IntStream.rangeClosed(5, 10).map(x -> x*2).toArray();

        for(int i:array){
            System.out.print(i + " ");
        }

        //System.out.println();
        for(int i:array){
            System.out.print("\n" + i);
            //System.out.println(i);
        }
    }
}
