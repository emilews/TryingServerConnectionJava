import java.io.IOException;

public class MainClient {
    static String host = "127.0.0.1";
    static int port = 12345;
    static String clientInput = "";

    public static void main(String[] args) throws IOException {
        try {
            if (ClientServices.connectToServer(host, port)) {
                while ((clientInput = ComClientHandler.clientIn.readLine()) != null) {
                    ComClientHandler.clientOut.println(clientInput);
                    System.out.println("Server: " + ComClientHandler.serverIn.readLine());
                    if (ComClientHandler.serverIn.readLine().equals("Bye!")) System.exit(1);
                }
            }
        } catch (Exception e) {
            System.out.println("Error 1");
        }
    }
}

