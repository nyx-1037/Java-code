package com.nyx.Test1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)  throws Exception {
        ServerSocket ss = new ServerSocket(9898);

        Socket s=ss.accept();

        //服务器而言，不停地接收和发送数据
        //启动的第一个线程负责接收数据
        ReceThread rt=new ReceThread(s);
        rt.start();//启动线程
        System.out.println("服务器启动成功！");

        //启动的第二个线程负责发送数据
        SendThread st=new SendThread(s);
        st.start();

    }
}
