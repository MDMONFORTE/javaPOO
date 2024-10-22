import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int numero = scanner.nextInt();
        System.out.println(numero);

        scanner.nextLine();

        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        System.out.println(frase);

        scanner.close();
    }
}