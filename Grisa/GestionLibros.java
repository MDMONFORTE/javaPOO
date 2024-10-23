import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionLibros {
    public static void main(String[] args) {
        Map<String, String> libros = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("1. Añadir libro");
            System.out.println("2. Consultar libro");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Introduce el título del libro: ");
                String titulo = scanner.nextLine();
                System.out.print("Introduce el autor: ");
                String autor = scanner.nextLine();
                libros.put(titulo, autor);
            } else if (opcion == 2) {
                System.out.print("Introduce el título del libro: ");
                String titulo = scanner.nextLine();
                if (libros.containsKey(titulo)) {
                    System.out.println("Autor: " + libros.get(titulo));
                } else {
                    System.out.println("Libro no encontrado");
                }
            } else {
                break;
            }
        }

        scanner.close();
    }
}
