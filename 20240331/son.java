import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;


public class son extends testClass{
    public static void main(String[] args) {
        System.out.print("请输入斐波那契数列2的长度：");
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        System.out.println(testClass.fib(b));
    }
}
