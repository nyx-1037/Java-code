import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数据数量(1<N<100)：");
        int N = scanner.nextInt(); // 读取数据数量N
        int[] arr = new int[N];
        int[] uniqueArray = new int[N];
        int uniqueCount = 0;
        // 读取原始数组
        for (int i = 0; i < N; i++) {
            System.out.print("请输入当前第"+(i+1)+"个数据：");
            arr[i] = scanner.nextInt();
        }
        // 去重
        for (int i = 0; i < N; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount++] = arr[i];
            }
        }
        // 打印去重后的结果
        System.out.print("最终数据输出为：");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        scanner.close();
    }
}
