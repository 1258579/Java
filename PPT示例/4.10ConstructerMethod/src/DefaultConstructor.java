class Bird{
    int i;
    //下面这句有就是普通构造方法 没有就是缺省构造方法
//    Bird(int j){i=j;}
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Bird nc = new Bird();
        System.out.println(nc.i);
    }
}
