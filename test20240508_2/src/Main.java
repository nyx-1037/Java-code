import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入正整数n(1<n<10): ");
        int n = scanner.nextInt();

        // 创建一个二维数组来存储杨辉三角的值
        int[][] triangle = new int[n][];

        // 填充杨辉三角
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1]; // 每一行的长度比行号大1
            triangle[i][0] = 1; // 每一行的第一个数是1
            triangle[i][i] = 1; // 每一行的最后一个数是1

            // 计算中间的数，它是它上方和上方左侧数的和
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // 打印杨辉三角
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println(); // 每打印完一行后换行
        }
    }
}
