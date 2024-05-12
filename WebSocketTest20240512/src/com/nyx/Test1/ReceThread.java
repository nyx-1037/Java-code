package com.nyx.Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceThread extends Thread {

    private Socket s;
    public ReceThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //不停的接收
        while(true){
            try {
                InputStream is = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String content = br.readLine();

                System.out.println("接收到的数据是："+content);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
