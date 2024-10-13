import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args){
        Map<String, Integer> contactos= new HashMap<>();
        Scanner scanner = new Scanner (System.in);
        int telefonillo;
        int numeroSwitch;
        String añadir;   
        while (true) {
        System.out.println("OPCIONES - AGENDA");
        System.out.println("1. Mostrar contactos");
        System.out.println("2. Añadir contacto");
        System.out.println("3. Editar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Borrar todos los contactos");
        System.out.println("6. Salir");
        numeroSwitch = scanner.nextInt();
        scanner.nextLine();

        switch (numeroSwitch) {
            case 1:
                for (Map.Entry<String, Integer> datos : contactos.entrySet())
                    System.out.println(datos.getKey() + ": " + datos.getValue());
                break;
            case 2:
                System.out.print("Escriba el nombre a añadir: ");
                añadir = scanner.nextLine();
                System.out.print("Escriba el número de teléfono:");
                telefonillo = scanner.nextInt();
                contactos.put(añadir, telefonillo);  
                System.out.println(contactos);             
                break;        
            case 3:
                System.out.print("Escriba el nombre a editar: ");
                String editar = scanner.nextLine();
                System.out.print("Escriba el nuevo número de teléfono:");
                telefonillo = scanner.nextInt();
                contactos.put(editar, telefonillo);                  
                break;
            case 4:
                System.out.print("Escriba el nombre a eliminar: ");
                String eliminar = scanner.nextLine();    
                contactos.remove(eliminar);           
                break;
            case 5:  
                contactos.clear();             
                break;
            case 6:
                scanner.close();  
                System.exit(1);             
        }
        }
    }
}
