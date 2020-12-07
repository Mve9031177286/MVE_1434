/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    
    public static void main(String[] args) {
        int nums[] = {4,2,6,2,65};
        outnums();
         
    }
    
    public static void outnums {
    if (nums[i] == nums.lenght)
        return;
    System.out.println(nums[i]);
        nums[i] == nums [i+1];
    outnums();
    }
    
}
