import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入初始高度M（0<M<2000）：");
        double M=scanner.nextDouble();
        System.out.print("请输入回弹次数N(0<N<50)：");
        int N=scanner.nextInt();
        double length=0;
        for (int i = 1; i <= N; i++) {
            length+=M;
            M/=2;
            length+=M;
        }
        System.out.printf("第%d次回弹之后的高度为：%.2f\n",N,M);
        System.out.printf("所经过的距离为：%.2f",length);
    }
}
