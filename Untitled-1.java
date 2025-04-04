
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatP2P

public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    

    System.out.print("Digite a porta para escutar mensagens: ");
    int portaReceber = scanner.nextInt();
    
    System.out.print("Digite o endereço do outro cliente: ");
    String enderecoOutroCliente = scanner.next();

    System.out.print("Digite a porta para enviar mensagens: ");
    int portaEnviar = scanner.nextInt();

}