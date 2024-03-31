import java.util.Arrays;
import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入字符串：");
        String a=scanner.next();
        f1(a);
        int b=0;
        int b2=f2(b);
        System.out.print("b2 八进制为：");
        System.out.printf("%o\n",b2);
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        f3(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("请输入斐波那契数列长度：");
        int f= scanner.nextInt();
        int rel=fib(f);
        System.out.println(rel);

    }
    public static void f1(String a1){
        System.out.print("输出字符串为：");
        System.out.println(a1);
    }

    public static int f2(int b1) {
        for(int i=0;i<=100;i++){
            b1+=i;
        }
        return b1;
    }
    private static void f3(int[] arr2){
        System.out.print("数组长度为：");
        System.out.println(arr2.length);
    }

    public static int fib(int f) {
        if (f==1 || f==2)
            return 1;
        return fib(f-1)+fib(f-2);
    }
}
