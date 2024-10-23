import java.util.Scanner;

public class Bisiestos {
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el año al usuario
        System.out.print("Ingresa un año: ");
        int año = scanner.nextInt();

        // Comprobar si el año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
