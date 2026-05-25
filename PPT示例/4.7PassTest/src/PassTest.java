public class PassTest {
    float ptValue;
    public void changeObjValue(PassTest ref) {// 引用类型参数
        ref.ptValue = 99.0f;  //改变参数所指对象的成员变量值
    }

    //类似c里的指针 可以直接修改结构体里的变量值
    
    public static void main(String args[]) {
        PassTest pt = new PassTest();
        pt.ptValue = 101.0f;
        pt.changeObjValue(pt); // 引用类型参数的传递
        System.out.println("Pt value is: " + pt.ptValue);
    }
}
