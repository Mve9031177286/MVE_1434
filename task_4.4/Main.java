/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 8);
        Dog plutoDog = new Dog("Pluto", 4, 34);
        Cat tomCat = new Cat("Tom", 35, 2);
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
}
class Dog {
    String name;
    int paws;
    int tail;

    public Dog(String name, int paws, int tail) {
        this.name = name;
        this.paws = paws;
        this.tail = tail;
    }
}
}
class Cat {
    String name;
    int height;
    int teeth;

    public Cat(String name, int height, int teeth) {
        this.name = name;
        this.height = height;
        this.teeth = teeth;
    }
 }
