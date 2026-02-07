package out.vivek;

import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            ServerSocket ss = new ServerSocket(2345);
            System.out.println("Server started... Waiting for client");

            Socket skt = ss.accept();
            System.out.println("Client connected");

            BufferedReader skt_in = new BufferedReader(
                    new InputStreamReader(skt.getInputStream()));
            PrintWriter skt_out = new PrintWriter(
                    skt.getOutputStream(), true);

            // Initial handshake
            skt_out.println("What is your name?");
            String clientName = skt_in.readLine();
            System.out.println("Client name: " + clientName);

            System.out.print("Enter your name: ");
            String serverName = br.readLine();
            skt_out.println(serverName);

            // Chat loop
            while (true) {
                String recv = skt_in.readLine();
                if (recv == null || recv.equalsIgnoreCase("exit"))
                    break;

                System.out.println(clientName + ": " + recv);

                String send = br.readLine();
                skt_out.println(send);
            }

            skt.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
