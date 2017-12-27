import java.io.*;

public class ComClientHandler {
    static BufferedReader serverIn;
    static BufferedReader clientIn;
    static PrintWriter clientOut;

    static {
        try {
            serverIn = new BufferedReader(new InputStreamReader(ClientServices.connection.getInputStream()));
            clientIn = new BufferedReader(new InputStreamReader(System.in));
            clientOut = new PrintWriter(ClientServices.connection.getOutputStream(), true);
        }catch(IOException ioE){
            ioE.printStackTrace();
        }
    }
}
