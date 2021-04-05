import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket server;
    private static Socket socket;
    private static final int PORT = 8191;

    public static void main(String[] args) {
        Socket socket = null;

        Scanner scanner = new Scanner(System.in);

        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");

            socket = server.accept();
            System.out.println("Client connect: " + socket.getRemoteSocketAddress());

            DataInputStream inputStream = new DataInputStream((socket.getInputStream()));
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            Thread thread1 = new Thread(() -> {
                try{
                    while (true) {
                       outputStream.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread1.setDaemon(true);
            thread1.start();

//            Thread thread2 = new Thread(() -> {
//                try{
                    while (true) {
                        String str = inputStream.readUTF();

                        if (str.equals("/end")){
                            System.out.println("Cliend disconnect");
                            outputStream.writeUTF("/end");
                            break;
                        } else {
                            System.out.println("Client: " + str);
                        }

                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            thread2.start();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
