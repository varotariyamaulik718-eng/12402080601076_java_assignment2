import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Practical7 {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started. Waiting for a client to connect...");

        Socket socket = server.accept();
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String msg;

        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
            out.println(msg); 
        }

        System.out.println("Client disconnected. Shutting down server.");
        socket.close();
        server.close();
    }
}
