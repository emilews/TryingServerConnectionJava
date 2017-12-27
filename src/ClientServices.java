import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientServices {
    static Socket connection;
    public static boolean connectToServer(String ip, int port) throws IOException{
        try{
            connection = new Socket(ip, port);
            return true;
        }catch(UnknownHostException uhE){
            System.out.println(uhE);
            return false;
        }
    }
}
