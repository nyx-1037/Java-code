//数字环
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int n=sc.nextInt();//输入数组大小
        int[] arr=new int[n];

        //输入数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第"+(i+1)+"个元素:");
            arr[i]=sc.nextInt();
        }
        //输入移动的位数
        System.out.print("请输入需要移动的位数：");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        int j=m;
        //将需要移动的元素放到另一个数组中
        for(int i=n-1;i>=n-m;i--){
            arr2[--j]=arr[i];
        }
        //给元素组元素移动位置
        for(int i=n-m-1;i>=0;i--){
            arr[i+m]=arr[i];
        }
        //将移动的数组的元素覆盖到原数组中
        for(int i=m-1;i>=0;i--){
            arr[i]=arr2[i];
        }
        //输出移动之后的数组元素
        System.out.print("输出数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}