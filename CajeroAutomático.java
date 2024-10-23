import java.util.Scanner;

public class CajeroAutomático {
    public static void main(String[] args) {
        //pin correcto
        final int PIN_CORRECTO = 1234;
        //nº intentos
        int intentosRestantes = 3;
        //Variable para almacenar el PIN introducido
        int pinIntroducido;

        Scanner sc = new Scanner(System.in);

        //Bucle while con dos condiciones: PIN incorrecto o correcto
        while (intentosRestantes > 0) {
            System.out.print("Introduce tu PIN: ");
            pinIntroducido = sc.nextInt();

            //Comprobacion de PIN
            if (pinIntroducido == PIN_CORRECTO) {
                System.out.println("Acceso concedido.");
                break;
            } else {
                //Restar un intento si el PIN es incorrecto
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("PIN incorrecto. Te quedan " + intentosRestantes + " intentos.");
                } else {
                    System.out.println("Has agotado todos los intentos. Acceso denegado.");
                }
            }
        }

        //Cerrar el escaner
        sc.close();
    }
}
