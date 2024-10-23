public class TipoBoolean {
    public static void main(String[] args) {
        boolean esMayorDeEdad = true;
        boolean estaLloviendo = false;

        System.out.println(!estaLloviendo); //Imprime el contrario
        System.out.println(esMayorDeEdad && estaLloviendo); //Hace el operador AND
        System.out.println(esMayorDeEdad || estaLloviendo); //Hace el operador OR
    }
}
