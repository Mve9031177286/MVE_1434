/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        int a = 1;
        for (int i = 0; i < numbers.length; i++) {
            a = a * numbers[i];

        }
        System.out.print(a);


    }
}
