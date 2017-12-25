import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {
    static String host = "192.168.1.87";
    static int port = 12345;
    static String clientInput;

    private static void connectToServer(String host) throws UnknownHostException {

    }

    public static void main(String[] args) {
        try {
            //We create the socket to the other machine/server
            Socket connectionSocket = new Socket(host, port);


            //Looks for the message sent by the server
            BufferedReader serverIn = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));


            //Just a normal InputStream for the client to write
            BufferedReader clientIn = new BufferedReader(new InputStreamReader(System.in));


            //This is the writer to send text to the server
            PrintWriter clientOut = new PrintWriter(connectionSocket.getOutputStream(), true);


            //Loop for readeing server and sending to server
            while ((clientInput = clientIn.readLine()) != null) {
                clientOut.println(clientInput);
                System.out.println("echo: " + serverIn.readLine());
            }

        } catch (Exception e) {
            System.out.println("Error 1");
        }
    }
}

