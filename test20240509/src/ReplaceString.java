import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        System.out.print("请输入字符串S (长度<100):");
        String s = scanner.nextLine();

        System.out.print("请输入子串A (长度<10):");
        String a = scanner.nextLine();

        System.out.print("请输入子串B (长度<10):");
        String b = scanner.nextLine();

        // 检查输入的合法性
        if (s.length() >= 100 || a.length() >= 10 || b.length() >= 10) {
            System.out.println("输入无效，请确保S长度<100，A和B长度<10。");
            return;
        }

        // 执行替换操作
        String result = s.replace(a, b);

        // 输出结果
        System.out.println("替换后的字符串:");
        System.out.println(result);
    }
}
