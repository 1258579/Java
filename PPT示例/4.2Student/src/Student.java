public class Student {
    String name;
    int age;

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");//用static修饰，只在类加载时执行一次。
    }
    //构造方法
    //无参构造方法
    public Student(){}
    //有参构造方法
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //成员方法
    public void Study(){
        System.out.println(name+"学习中");
    }
    public static void main(String[] args) {
        System.out.println("---创建第一个对象---");
        Student s1=new Student();
        System.out.println(s1.age);//0
        System.out.println(s1.name);//null
        System.out.println("----创建第二个对象---");
        Student s2=new Student("张三",20);
        s2.Study();
    }
}
