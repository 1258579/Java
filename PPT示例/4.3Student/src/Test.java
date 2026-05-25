public class Test {
    public static void main(String[] args) {// 静态变量直接用类名访问
        System.out.println(Student.school);
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        System.out.println(s1.school+ " " +s2.school);
        s1.school = "第二中学";
        s1.show();
        s2.show();
    }
}
class Student {
    // 1. 实例变量（每个学生有自己的姓名、年龄）
    private String name;
    private int age;
    // 2. 静态变量（所有学生共享同一个学校）
    public static String school = "第一中学";//一个人改了所有人都要改
    // 构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println(name + " " + age + " " + school);
    }
}