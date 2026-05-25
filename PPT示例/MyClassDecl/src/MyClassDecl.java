public class MyClassDecl {
    public static void main(String[] args) {
        //Shape s = new Shape();//报错，抽象类不可以示例
        Triangle t=new Triangle();
        t.setColor("blue");
        t.getColor();
        t.move();
    }
}
abstract class Shape {
    String Color;
    void draw() {System.out.println("draw shape");}
    void erase() {System.out.println("erase shape");}
    void move() {System.out.println("move shape");}
    void getColor() {System.out.println("Color = "+Color);}
    void setColor(String color) {
        Color =color;
        System.out.println("New Color = "+ Color);
    }
}
class Circle extends Shape {
    @Override
    void draw() {System.out.println("draw circle");}
    @Override
    void erase() {System.out.println("erase circle");}
    @Override
    void move() {System.out.println("move circle");}
}
class Square extends Shape {
    @Override
    void draw() {System.out.println("draw square");}
    @Override
    void erase() {System.out.println("erase square");}
    @Override
    void move() {System.out.println("move square");}
}
final class Triangle extends Shape {
    @Override
    void draw() {System.out.println("draw triangle");}

    @Override
    void erase() {System.out.println("erase triangle");}
    @Override
    void move() {System.out.println("move triangle");}
}