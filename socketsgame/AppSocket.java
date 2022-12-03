
// import java.net.*;
// import java.util.Scanner;
// import java.io.*;

// public class AppSocket {

// private static Socket sendSocket;
// private static Socket receiveSocket;
// static ServerSocket serverSocket;
// private static String messageTextColor = "\u001B[34m";
// private static String normalTextColor = " \u001b[30m";

// static void sendMessage(int[] data, Boolean encrypt) {

// try {
// sendSocket = new Socket("localhost", user == 0 ? port : port + 1);
// System.out.println("sending data ...");
// DataOutputStream sendBuffer = new
// DataOutputStream(sendSocket.getOutputStream());

// sendBuffer.writeUTF(data);
// System.out.println("data sent !");

// return;
// } catch (Exception e) {
// System.out.println(e);
// return;
// }
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Hello to Tic Tac Toe app ....");
// System.out.println("choose order");
// user = Integer.parseInt(scanner.nextLine());

// try {
// if (user == 0) {
// serverSocket = new ServerSocket(user == 0 ? (port + 1) : port);

// while (true) {
// System.out.println("Listening ...");
// receiveSocket = serverSocket.accept();
// DataInputStream incoming = new
// DataInputStream(receiveSocket.getInputStream());

// String data = (String) incoming.readUTF();
// printMessage(data);
// receiveSocket.close();

// System.out.println("Enter message :");
// String messageToSend = scanner.nextLine();
// if (!messageToSend.isEmpty()) {
// sendMessage(messageToSend, true);

// }
// }

// } else {
// serverSocket = new ServerSocket(user == 0 ? 6789 : 6788);

// while (true) {

// System.out.println("Enter message :");
// String messageToSend = scanner.nextLine();
// if (!messageToSend.isEmpty()) {
// sendMessage(messageToSend, true);

// }
// System.out.println("Listening ...");
// receiveSocket = serverSocket.accept();
// DataInputStream incoming = new
// DataInputStream(receiveSocket.getInputStream());
// String data = (String) incoming.readUTF();
// printMessage(data);
// receiveSocket.close();

// }

// }

// } catch (Exception e) {
// System.out.println("problem is :" + e);
// }
// scanner.close();
// }
// }