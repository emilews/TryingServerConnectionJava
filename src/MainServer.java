import java.io.*;

public class MainServer {
    static int port = 12345;
    static String smt;

    public static void main(String[] args) throws IOException {

        ServerServices.startServer(12345);
        ServerServices.acceptConnectionsFromClient();
        smt = ComServerHandler.in.readLine();
        if (smt.equalsIgnoreCase("login")) {
            LoginHandler.getData();
        } else {
            ComServerHandler.out.println("No such command.");
        }

    }
}