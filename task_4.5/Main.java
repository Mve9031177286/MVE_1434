/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run()
{ System.out.println("Игого, я поскакал(а)"); }
*/
/*
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод
public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main {
    public static void main(String[] args) {
        Horse igogo = new Horse();
        Pegasus rite = new Pegasus();
        igogo.run();
        rite.fly();
    }
}

    public abstract class Animal{
        private String color;
        private String breed;

        public Animal( String color; String breed ) {
            this.color = color;
            this.breed = breed;
        }
        String getColor() { return this.color;}
        String getBreed() { return this.breed;}
    }

    public class Horse extends Animal {
        public Horse(String color,String breed) {
            super(color, breed);
        }
            public void run(){ System.out.println("Игого, я поскакал(а)");
            }

    }

    public class Pegasus extends Horse {
        public Pegasus(String color,String breed) {
            super(color, breed);
        }
      
            public void fly(){ out.println("Игого, я полетел(а)");
            }
    }
