import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tres número enteros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(" El número " + numero1 + " es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El número " + numero2 + " es el mayor");
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("El número " + numero3 + " es el mayor");
        } else if (numero3 == numero1 && numero3 == numero2){
            System.out.println("Los números son iguales");
        }
        scanner.close();
    }
}