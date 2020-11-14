/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
       int [] nums = {7,8,5,2};
       for (int i=0; i< nums.length; i++) {
           if (nums[i]==5){
               System.out.print("да");}
           else{
               System.out.print("нет");
           }
       }//напишите тут ваш код

    }
}
