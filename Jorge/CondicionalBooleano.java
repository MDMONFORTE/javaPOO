public class CondicionalBooleano {
    public static void main(String[] args) {
        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;

        if (esMayorDeEdad) {
            if (tieneLicencia) {
                System.out.println("Puedes conducir");
            } else {
                System.out.println("Necesitas una licencia para coducir");
            }
        } else{
            System.out.println("Debes ser mayor de edad");
        }
    }
}
