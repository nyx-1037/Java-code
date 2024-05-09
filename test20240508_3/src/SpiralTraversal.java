import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入正整数n(1<n<10): ");
        int n = scanner.nextInt();

        // 初始化一个n x n的二维数组来存储森林
        int[][] forest = new int[n][n];

        // 填充森林的排查顺序
        int count = 1;
        for (int layer = 0; layer < (n + 1) / 2; layer++) {
            // 上层
            for (int i = layer; i < n - layer; i++) {
                forest[layer][i] = count++;
            }
            // 右层
            for (int i = layer + 1; i < n - layer; i++) {
                forest[i][n - layer - 1] = count++;
            }
            // 下层
            for (int i = layer + 1; i < n - layer; i++) {
                forest[n - layer - 1][n - i - 1] = count++;
            }
            // 左层
            for (int i = layer + 1; i < n - layer - 1; i++) {
                forest[n - i - 1][layer] = count++;
            }
        }

        // 打印排查顺序
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(forest[i][j] + (j < n - 1 ? " " : ""));
            }
            System.out.println();
        }
    }
}
