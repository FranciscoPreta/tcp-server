package org.code4all.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket servSock = new ServerSocket(12345);
        Socket clientSocket = servSock.accept();

        while(true) {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String line = in.readLine();
            System.out.println(line);

            if (line.equals("quit")){
                break;
            }

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println(line);
        }
    }
}
