package com.soft1841.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器端口启动！");
        while (true) {
            Socket socket = serverSocket.accept();
            ServerThread1 server = new ServerThread1(socket);
            new Thread( server).start();

        }
    }
}
