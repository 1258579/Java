class Animal {
    public void sound (){
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("喵喵喵");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.sound();
        animal2.sound();
    }
}