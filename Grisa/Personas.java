          

public class Personas {
private String nombre;
private String apellido;
private int edad;

public Personas(){}

public Personas(String nombre) {
    this.nombre = nombre;


}
public Personas(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;

}


public String getNombre(){
    return this.nombre;
}

public String getApellido(){
    return this.apellido;
}

public int getEdad(){
    return this.edad;
}

public static void main(String[] args) {
    Personas p1 = new Personas("Alice", " ", 34);
    Personas p2 = new Personas("Bob", " " , 67);
    Personas p3 = new Personas("Juan");
    Personas p4 = new Personas();
    Personas p5 = new Personas("Juanjo" , "Perez", 34 );


    System.out.println(p1.getNombre() + " " + p1.getEdad() + " años.");
    System.out.println(p2.getNombre() + " " + p2.getEdad() + " años.");
    System.out.println(p3.getNombre() + " " + p3.getEdad() + " años.");
    System.out.println(p4.getNombre() + " " + p4.getEdad() + " años.");
    System.out.println(p5.getNombre() + " " + p5.getApellido() + " " + p5.getEdad() + " años.");
}
}
