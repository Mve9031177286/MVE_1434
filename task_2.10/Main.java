/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,5,};
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                System.out.println("Да");
                break;
            } else if (i == nums.length-2 ) {
                System.out.println("Нет");
            }
        }

    }
}
