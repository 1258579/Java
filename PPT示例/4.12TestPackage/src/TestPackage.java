import com.example.Student;
        //导入包成员

public class TestPackage {
    public static void main(String[] args) {
        //使用短名
        Student stu = new Student();
        stu.study();
        //使用长名
        com.example.Student stu2 = new com.example.Student();
        stu2.study();
        //使用长名可以不用import
    }
}
