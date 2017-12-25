import java.io.*;
import java.net.*;

public class MainServer {
    static int port = 12345;

    public static void main(String[] args) throws IOException {
        //We create the server by looking for connection on port 12345
        ServerSocket server = new ServerSocket(port);

        //A socket needs to be created, when there's a connection, this accepts it
        Socket clientSide = server.accept();


        PrintWriter out = new PrintWriter(clientSide.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSide.getInputStream()));

        String inputLine, outputLine;

        KnockKnockProtocol kkp = new KnockKnockProtocol();
        outputLine = kkp.processInput(null);
        out.println(outputLine);

        while ((inputLine = in.readLine()) != null) {
            outputLine = kkp.processInput(inputLine);
            out.println(outputLine);
            if (outputLine.equals("Bye."))
                break;
        }
    }
}
