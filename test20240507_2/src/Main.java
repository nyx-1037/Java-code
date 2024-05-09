import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入矩阵边长：");
        int n = sc.nextInt();
        if (n > 1 && n < 10) {
            spinMatrix(n);
        } else {
            System.out.println("输入的数据无效，请重试");
        }
    }

    public static void spinMatrix(int n){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][n];
        //输入矩阵
        System.out.println("请输入整数矩阵元素:");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //扭转矩阵,创建新矩阵之后逆转放入
        int[][] arr2= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr2[j][i] = arr[i][j];
            }
        }
        //输出矩阵
        System.out.println("输出矩阵为：");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}