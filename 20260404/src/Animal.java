public class Animal {
    public void eat(){
        System.out.println("动物吃东西");
    }
    //主函数
    public static void main(String[] args){

        Cat cat1 = new Cat();

        cat1.eat();
        cat1.catchMouse();

    }
}

class Cat extends Animal {
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

