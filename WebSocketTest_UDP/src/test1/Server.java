package test1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket(7890);

        byte[] buf=new byte[1024];
        //准备接收数据
        DatagramPacket dp=new DatagramPacket(buf, 1024);//用来接收数据的

        ds.receive(dp);//接收数据

        //数据在字节数组里
        String s=new String(dp.getData(),0,dp.getLength());

        System.out.println("接收到的数据是："+s);

        //发送一条数据给客户端
        byte[] bs ="HELLO WORLD!".getBytes();
        DatagramPacket dp2=new DatagramPacket(bs,bs.length, InetAddress.getByName("localhost"), 9898);

        ds.send(dp2);

    }
}
