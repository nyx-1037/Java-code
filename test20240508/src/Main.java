import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入正整数n(1<n<10):");
        int n = sc.nextInt();
        int[][] arrInput=new int[n][n];
        int[][] arrOutput=new int[n][n];

        //输入矩阵
        System.out.print("请输入矩阵数值：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrInput[i][j]=sc.nextInt();
            }
        }

        //旋转90度矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrOutput[j][n-1-i]=arrInput[i][j];
            }
        }

        //输出矩阵
        System.out.println("输出矩阵为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrOutput[i][j]+" ");
            }
            System.out.println();
        }
    }
}