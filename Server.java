package test_0103;

import java.net.*;
import java.io.*;

public class Server extends Thread
{
    public static void main(String [] args)
    {
        try{
            System.out.println("Socket开始运行。。。");
            ServerSocket serverSocket = new ServerSocket(2234); //端口1234
            while(true)
            {
                Socket socket = serverSocket.accept();//接受客户端请求，socket是与每个客户端的连接

                new Thread(new s_get(socket)).start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class s_get implements Runnable{
    private Socket socket;

    s_get (Socket socket)
    {
        this.socket = socket;
    }

    @Override //实现方法
    public void run() {
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            while(true)
                System.out.println(ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
