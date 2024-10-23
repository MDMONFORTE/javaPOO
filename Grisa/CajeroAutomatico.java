import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial
        int opcion;

        while (true) {
            System.out.println("Cajero Automático:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Has depositado: $" + deposito);
                        System.out.println("Tu nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Cantidad no válida.");
                    }
                    break;
                case 3:
                    System.out.print("Introduce la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Has retirado: $" + retiro);
                        System.out.println("Tu saldo restante es: $" + saldo);
                    } else {
                        System.out.println("Cantidad no válida o insuficiente saldo.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático.");
                    return; // Finaliza el programa
                default:
                    System.out.println("Opción no válida.");
            }
        }
    
    scanner.close();
    }
}
