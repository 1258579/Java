

abstract class Person{
    public void eat(){
        System.out.println("吃");
    }
    protected void sleep() {
        System.out.println("睡");
    }
    private void think() {
        System.out.println("思考");
    }
    public static void breathe() {
        System.out.println("呼吸");
    }
    public final void run() {
        System.out.println("跑");
    }
    public abstract void study();//没有方法体，子类必须重写实现这个方法
    public native void memory();//调用C/C++，无方法体）

    public synchronized void save() {//SYNCHRONIZED 一次只能被一个线程执行，保存数据时保证不会出错
        System.out.println("保存数据");
    }
    public void readFile() throws Exception {//throws抛出异常
        System.out.println("读文件");
    }

}

final class Student extends Person {
    @Override
    public void study() {//继承的时候必须把父类里的抽象方法重写
        System.out.println("学生学习");
    }
}

public class Test {
    public static void main(String[] args)
            throws Exception {
        Student s = new Student();
        s.eat();
        s.sleep();
        s.run();
        s.study();
        s.save();
        s.readFile();
        Person.breathe(); // 静态方法
    }
}