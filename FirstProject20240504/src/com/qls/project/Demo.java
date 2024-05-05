package com.qls.project;

import java.awt.*;
import java.util.Scanner;

public class Demo{
    public static Scanner scan = new Scanner(System.in);
    public static int[][] map = new int[19][19]; // 棋盘
    public static int flag; // 当前回合数


    //主函数
    public static void main(String[] args) {
        menuView(); // 主菜单界面
    }

    // 初始化游戏数据
    public static void init(){
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = 0; // 初始化棋盘为0，表示空地
            }
        }
        flag = 0; // 初始化当前回合为黑棋
    }

    // 判断是否获胜
    public static int isWin(int x, int y){
        // 判断获胜的逻辑
        int value=map[x][y];
        int spsum = 0;
        for (int i = y; i >= 0; i--) {//判断向左
            if (map[x][i] == value) {
                spsum++;
            } else break;
        }
        for (int i = y + 1; i < map.length - 1; i++) {//判断向右
            if (map[x][i] == value) {
                spsum++;
            } else break;
        }
        if (spsum >= 5)
            return 1;
        //判断垂直输赢
        int czsum = 0;
        for (int i = x; i >= 0; i--) {//判断向上
            if (map[i][y] == value) {
                czsum++;
            } else break;
        }
        for (int i = x + 1; i < map.length - 1; i++) {//判断向下
            if (map[i][y] == value) {
                czsum++;
            } else break;
        }
        if (czsum >= 5)
            return 1;
        //判断左斜
        int zxsum=0;
        for (int i = x,j=y; i >=0 && j>=0; i--,j--) {//判断左上
            if(map[i][j]==value){
                zxsum++;
            }else break;
        }
        for (int i = x+1,j=y+1; i <map.length-1 && j<map[0].length-1; i++,j++) {//判断右下
            if(map[i][j]==value){
                zxsum++;
            }else break;
        }
        if(zxsum>=5){
            return 1;
        }
        //判断右斜
        int yxsum=0;
        for(int i=x,j=y;i>=0 && j<map[0].length-1;i--,j++){//判断右上
            if(map[i][j]==value){
                yxsum++;
            }else break;
        }
        for(int i=x+1,j=y-1; i<map.length-1 && j>=0;i++,j--){//判断左下
            if(map[i][j]==value){
                yxsum++;
            }else break;
        }
        if(yxsum>=5){
            return 1;
        }
        else return 0;
    }// 默认返回0，表示没有获胜


// 玩家落子
public static int playerMove(int x, int y){
    if (map[x][y] == 0) { // 如果落子位置为空地
        map[x][y] = (flag % 2) + 1; // 将对应位置改为当前玩家的棋子
        flag++; // 切换回合
        return 1; // 落子成功
    } else {
        return 0; // 落子失败，棋盘已有子
    }
}

// 主菜单界面
public static void menuView(){
    System.out.println("**********************************");
    System.out.println("******** 欢迎来到五子棋游戏！********");
    System.out.println("************1. 开始游戏 ***********");
    System.out.println("************0. 退出游戏 ************");
    System.out.println("**********************************");
    System.out.print("请选择操作>：");
    int choice = scan.nextInt();
    switch(choice) {
        case 1:
            gameView(); // 开始游戏
            break;
        case 0:
            System.exit(0); // 退出游戏
            break;
        default:
            System.out.println("无效的选择，请重新输入！");
            menuView(); // 重新显示菜单
    }
}

// 打印游戏棋盘
public static void gameView_ShowMap(){
    //打印标注行
    //System.out.println("\u001B[44m");
    for (int k = 0; k <= 19; k++) {
        if(k == 0){
            System.out.print("  ");
        }else{
            System.out.printf("%3d",(k-1));
        }
    }
    System.out.println();
    for (int i = 0; i < 19; i++) {
        System.out.printf("%3d",i);//打印标注列
        for (int j = 0; j < 19; j++) {
            if (map[i][j] == 0) {
                System.out.print("\u001B[33m X \u001B[0m"); // 空地
            } else if (map[i][j] == 1) {
                System.out.print(" ● "); // 白子
            } else if (map[i][j] == 2) {
                System.out.print(" ○ "); // 黑子
            }
        }
        System.out.println();
    }
    //System.out.println("\u001B[40m");
}

// 游戏胜利界面
public static void winView(){
    if ((flag % 2) + 1 == 1) {
        System.out.println("***********************************");
        System.out.println("********---》黑棋玩家获胜！***********");
        System.out.println("***********************************");
    } else {
        System.out.println("***********************************");
        System.out.println("********---》白棋玩家获胜！***********");
        System.out.println("***********************************");
    }
    System.out.println("按任意键2次回到主菜单...");
    scan.nextLine(); // 清空输入缓冲区
    scan.nextLine(); // 等待用户输入任意键
    menuView(); // 回到主菜单
}

// 游戏界面整合
public static void gameView(){
    init(); // 初始化游戏数据
    while(true){
        gameView_ShowMap(); // 打印游戏界面
        System.out.println("***********************************");
        if ((flag % 2) + 1 == 1) {
            System.out.println("白棋玩家行动：");
        } else {
            System.out.println("黑棋玩家行动：");
        }
        System.out.print("请玩家输入坐标（例如：x y）：");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("***********************************");
        int result = playerMove(x, y); // 落子
        if (result == 0) {
            System.out.println("落子失败，请重新输入！");
            continue; // 落子失败，重新开始循环
        }

        int winResult = isWin(x, y); // 判断游戏是否胜利
        if (winResult != 0) {
            gameView_ShowMap();
            winView(); // 胜利界面
            break; // 结束当前界面
        }


    }
}
}

