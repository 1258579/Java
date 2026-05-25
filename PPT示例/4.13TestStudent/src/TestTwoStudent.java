//import school1.Student;
//import school2.Student;
//因为两个包里的Student重复 所以不能import，直接用长名调用就可以了


public class TestTwoStudent {
    public static void main(String[] args) {
        school1.Student stu1 = new school1.Student();
        school2.Student stu2 = new school2.Student();

        stu1.showinfo();
        stu2.showinfo();

    }
}
