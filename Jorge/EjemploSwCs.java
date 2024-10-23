import java.util.Scanner;

public class EjemploSwCs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige una opción (1-3): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido la opción 1");
                break;
            case 2:
                System.out.println("Has elegido la opción 2");
                break;
            case 3:
                System.out.println("Has elegido la opción 3");
                break;
            default:
                System.out.println("Del 1 al 3 MONGOLO");
                break;
        }
        scanner.close();
    }
}
