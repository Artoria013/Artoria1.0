package test_0103;

import org.json.simple.JSONObject;

import java.net.*;
import java.io.*;

public class Client {
    private static Socket socket;
    private static boolean is_connected = false;

    public static void main(String [] args)
    {
        connect();
        if(is_connected){
            try {
                System.out.println("客户端已连接。");
                new Thread(new heart(socket)).start();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void connect()
    {
        try{
            socket = new Socket("127.0.0.1",2234);
            is_connected = true; // 连接成功
        }catch(Exception e){
            e.printStackTrace();
            is_connected = false;
        }
    }
}

class heart implements Runnable{

    private Socket socket;

    heart(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run() {
            try {
                System.out.println("心跳检测开始运行。");
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                while (true) {
                    Thread.sleep(5000); //每隔5秒发一次消息
                    JSONObject object = new JSONObject();
                    object.put("type","heart");
                    object.put("msg","心跳");
                    oos.writeObject(object);
                    oos.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}

