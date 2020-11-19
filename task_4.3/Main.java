/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat Felix = new Cat();
         Felix.age =3;
         Felix.weight = 4;
         Felix.strength = 5;

        Cat Pups = new Cat();
         Pups.age = 3;
         Pups.weight = 4;
         Pups.strength = 5;

        System.out.println(Felix.fight(Pups));
        System.out.println(Pups.fight(Felix));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int x;//возраст
        int y;//вес
        int z;//рост

        if (age <= anotherCat.age) {
            x = 0;
        } else x = 1;

        if (weight <= anotherCat.weight) {
            y = 0;
        } else
            y = 1;


        if (strength <= anotherCat.strength) {
            z = 0;
        } else
            z = 1;

        int sum = x + y + z;
        if (sum <1) {
            return false;
        } else return true;
    }

}
