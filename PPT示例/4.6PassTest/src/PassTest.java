public class PassTest {
    public void changeStr(String value){
        value = new String("different");
    }
    public static void main(String[] args) {
        String str;
        PassTest pt = new PassTest();

        str = new String("Hello");
        pt.changeStr(str);//无法修改
        System.out.println("Str value is: "+ str);
    }
}
