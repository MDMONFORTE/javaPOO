import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int numero = scanner.nextInt(); //Aquí se introduce el número y se presiona Enter
        System.out.println(numero);
        //Después de introducir el numero, queda un salto de linea "\n" pendiente en el buffer
        //El siguiente 'nextLine()' limpiara ese salto de linea

        scanner.nextLine(); //Consumir el "\n" que dejo el 'nextInt()' en el buffer

        System.out.println("Introduce una frase");
        String frase = scanner.nextLine(); //Ahora podemos leer correctamente la frase completa
        System.out.println(frase);

        scanner.close();
    }
}