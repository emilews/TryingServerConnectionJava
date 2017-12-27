import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerServices {
    static ServerSocket server;
    static Socket client;

    public static boolean startServer(int port) throws IOException {
        try {
            server = new ServerSocket(port);
            return true;
        } catch (UnknownHostException uhE) {
            System.out.println(uhE);
            return false;
        }
    }

    public static void acceptConnectionsFromClient() throws IOException {
            client =server.accept();
    }
}
