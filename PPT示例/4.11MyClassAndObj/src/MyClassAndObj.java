class EmpInfo {
    String name;
    String designation;
    String department;
    public EmpInfo(String name, String designation, String department) {
        //非缺省构造方法
        this.name = name;
        this.designation = designation;
        this.department = department;
    }
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
    }

}
public class MyClassAndObj {
    public static void main(String[] args) {
        EmpInfo emp1 = new EmpInfo("Robert Java","Manager","coffee Shop");
        emp1.print();
        EmpInfo emp2 = new EmpInfo("Tom Java","Worker","Coffee Shop");
        emp2.print();
    }
}
