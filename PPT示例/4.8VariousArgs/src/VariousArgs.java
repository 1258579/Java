public class VariousArgs {
    public double ratingAverage(double r,int ...points){//points是个数组 接受可变参数个int  类型...参数名
        int sum = 0;
        for(int p:points){//遍历points里面的每个p
            sum+=p;
        }
        return ((sum*r)/points.length);
    }
    public static void main(String[] args) {
        VariousArgs a = new VariousArgs();
        System.out.println(a.ratingAverage(0.5,new int[]{95,90,85}));//直接传递数组进去
        System.out.println(a.ratingAverage(0.5,94,92,90,88,86));//直接自动打包
    }
}
