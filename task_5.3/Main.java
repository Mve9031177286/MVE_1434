/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        nums.add(0);
        nums.add(4);
        nums.add(7);
        nums.add(12);
        nums.add(13);

        System.out.println(nums);

        int i = 0;
        while (i < nums.size()) {
            if (nums.get(i) > 0 && nums.get(i) < 10) {
                numbers.add(nums.get(i));
                i++;
            }  else  {
                i++;
               }
        }
        System.out.println(numbers);

    }
}
