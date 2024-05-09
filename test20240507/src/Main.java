import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入玩家数量n和被枪毙的数m（1<m<n<100），用空格隔开：");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //判断数值合法性
        if(m>1 && n>m && n<100){
            game(n,m);
        }else{
            System.out.println("输入无效");
        }
    }
    public static void game(int n,int m){
        // 创建一个长度为n的布尔数组，代表玩家是否存活
        boolean[] players = new boolean[n];
        for (int i = 0; i < n; i++) {
            players[i] = true;
        }
        // 当前报数
        int count = 0;
        // 存活的玩家数量
        int alive = n;
        // 循环，直到只剩下一个玩家
        for (int i = 0; alive > 1; i++) {
            // 如果当前玩家存活
            if (players[i]) {
                count++;
                // 如果报数为m，则枪毙当前玩家
                if (count == m) {
                    players[i] = false;
                    count = 0;
                    alive--;
                }
            }
            // 如果到达数组末尾，则回到数组开头
            if (i == n - 1) {
                i = -1;
            }
        }
        // 找到最后一个存活的玩家
        for (int i = 0; i < n; i++) {
            if (players[i]) {
                System.out.println("最后的胜利者是：" + (i + 1));
                break;
            }
        }
    }
}
