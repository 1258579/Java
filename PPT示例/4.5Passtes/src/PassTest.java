public class PassTest {
    public void changeInt(int value){
        value+=44;
    }
    public static void main(String[] args) {
        int val;
        PassTest pt = new PassTest();
        val=11;
        pt.changeInt(val);
        System.out.println("Int value is:"+val);//输出结果依然是11，传入方法不影响
    }
}
