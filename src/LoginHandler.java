import java.io.IOException;

public class LoginHandler {
    static boolean loggedIn;
    static String inputLine;

    public static void getData() throws IOException {
        String tmpUser;
        ComServerHandler.out.println("Username: ");
        tmpUser = ComServerHandler.in.readLine().toLowerCase();
        System.out.println(tmpUser);
        if (dbLogin.user.equals(tmpUser)) {
            ComServerHandler.out.println("Password: ");
            String tmpPass = ComServerHandler.in.readLine();
            if (tmpPass.equals(dbLogin.pass)) {
                ComServerHandler.out.printf("\nWelcome $s", tmpUser);
            } else {
                ComServerHandler.out.println("Incorrect password, try again.");
            }
        } else {
            ComServerHandler.out.println("No such user in database.");
        }
    }
}
