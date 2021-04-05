import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 8191;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Client connect Server " + socket.getRemoteSocketAddress());

            DataInputStream inputStream = new DataInputStream((socket.getInputStream()));
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            Thread thread4 = new Thread(() -> {
                try{
                    while (true) {
                        outputStream.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread4.setDaemon(true);
            thread4.start();

//            Thread thread3 = new Thread(() -> {
//                try{
                    while (true) {
                        String message = inputStream.readUTF();

                        if (message.equals("/end")){
                            System.out.println("Cliend disconnect");
                            outputStream.writeUTF("/end");
                            break;
                        } else {
                            System.out.println("Server: " + message);
                        }

                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            thread3.start();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

        }
    }
}

