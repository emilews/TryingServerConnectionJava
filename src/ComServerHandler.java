import java.io.*;

public class ComServerHandler {
    static BufferedReader in;
    static PrintWriter out;

    static {
        try {
            in = new BufferedReader(new InputStreamReader(ServerServices.client.getInputStream()));
            out = new PrintWriter(ServerServices.client.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
