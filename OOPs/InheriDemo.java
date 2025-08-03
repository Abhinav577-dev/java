import java.util.*;


class InheriDemo {
    public static void main (String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }
}
class Animal {
    String color;

    void eat() {
        System.out.println("Eats the food");

    }

    void breathe() {
        System.out.println("Breathes through gills");
    }
}

class Fish extends Animal {
    int fins;

    void swims(){
        System.out.println("Swims");
    }
}