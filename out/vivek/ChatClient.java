package out.vivek;

import java.net.*;
import java.io.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            Socket skt = new Socket("localhost", 2345);
            System.out.println("Connected to server");

            BufferedReader skt_in = new BufferedReader(
                    new InputStreamReader(skt.getInputStream()));
            PrintWriter skt_out = new PrintWriter(
                    skt.getOutputStream(), true);

            // Initial handshake
            System.out.println(skt_in.readLine());
            String myName = br.readLine();
            skt_out.println(myName);

            String serverName = skt_in.readLine();
            System.out.println("Server name: " + serverName);

            // Chat loop
            while (true) {
                String send = br.readLine();
                skt_out.println(send);

                if (send.equalsIgnoreCase("exit"))
                    break;

                String recv = skt_in.readLine();
                System.out.println(serverName + ": " + recv);
            }

            skt.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
