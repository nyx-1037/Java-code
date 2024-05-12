package com.nyx.Test1;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",9898);

        //客户端而言，不停地接收和发送数据
        //启动的第一个线程负责接收数据
        ReceThread rt=new ReceThread(s);
        rt.start();//启动线程
        System.out.println("客户端启动成功并连接到服务器");

        //启动的第二个线程负责发送数据
        SendThread st=new SendThread(s);
        st.start();
    }
}
