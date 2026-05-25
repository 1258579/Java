public class UnmaskField {
    private int x = 1;
    private int y = 1;//成员变量 所有非静态方法都可以直接使用

    //出现同名变量的时候就近原则 this强制指定当前对象的成员变量

    public void changeFields(int a, int b) {
        x = a;
        int y = b;
        this.y = 8;
//局部变量y使同名的类成员变量被隐藏
//this.y指成员变量
        System.out.println("x=" + x + "; y=" + y); //局部变量y的值
    }

    public void PrintFields() {
        System.out.println("x=" + x + "; y=" + y);
    }

    public static void main(String args[]) {
        UnmaskField uf = new UnmaskField();
        uf.PrintFields();
        uf.changeFields(10, 9);//这里print的是局部的x=10 y=9 但成员x被修改成了10 y也被修改成了8
        uf.PrintFields();
    }
}

//有参构造和无参构造
class Person{
    private String name;
    public Person(){
        this("无名氏");//相当于把无名氏传入有参构造的string name 调用本类另一个构造方法
    }
    public Person(String name){
        this.name = name;
    }
}

class Circle{
    private double radius;
    public Circle(double r){ radius=r; }//和类名相同->构造方法,不用返回值
}