import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("请输入第一个数组的长度：");
       int n = sc.nextInt();
       System.out.print("请输入第二个数组的长度：");
       int m= sc.nextInt();
       int[] arr = new int[n];
       int[] arr2 = new int[m];
       int[] arr3 = new int[n+m];
       for (int i = 0; i < arr.length; i++) {
           System.out.print("请输入第一个数组的第"+(i+1)+"个元素：");
           arr[i] = sc.nextInt();
       }
       for (int i = 0; i < arr2.length; i++) {
           System.out.print("请输入第二个数组的第"+(i+1)+"个元素：");
           arr2[i] = sc.nextInt();
       }

       //将2号数组元素移动到总数组
       for (int i = 0; i < arr.length; i++) {
           arr3[i] = arr[i];
       }
       //将2号数组元素移动到总数组
        int k=0;
       for (int i = n; i < arr.length+arr2.length; i++) {
           arr3[i] = arr2[k++];
       }

       //冒泡排序升序
       for (int i = 0; i < arr3.length-1; i++) {
           for (int j = 0; j < arr3.length-1; j++) {
               if(arr3[j]>arr3[j+1]){
                   int temp;
                   temp=arr3[j];
                   arr3[j]=arr3[j+1];
                   arr3[j+1]=temp;
               }
           }
       }

       System.out.println("数组合并后输出为：");
       for (int i = 0; i < arr3.length; i++) {
           System.out.print(arr3[i]+" ");
       }

    }
}