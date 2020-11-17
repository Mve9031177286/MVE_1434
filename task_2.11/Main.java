/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
      int nums [] = { 2,5,4,5,6};
      int sum = 0;
      int count = 0;
      while (sum<=10) {
          sum = sum + nums[count];
          count++;


      }
        System.out.println(count);

    }
}
