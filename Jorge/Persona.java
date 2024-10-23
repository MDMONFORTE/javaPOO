public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){}

    public Persona(String nombre){                                                                              //Una clase puede tener diferentes constructores
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String apellido, int edad){
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad){
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
        Persona p1 = new Persona("Alice","Calleja", 32);
        Persona p2 = new Persona("Jorge","Sanz", 19);
        Persona p3 = new Persona("Carlos","Baute");
        Persona p4 = new Persona("Marc");
        Persona p5 = new Persona();

        System.out.println(p1.getNombre() + " " + p1.getApellido() + ", edad " + p1.getEdad() + " años.");
        System.out.println(p2.getNombre() + " " + p2.getApellido() + ", edad " + p2.getEdad() + " años.");
        System.out.println(p3.getNombre() + " " + p3.getApellido() + ", edad " + p3.getEdad() + " años.");
        System.out.println(p4.getNombre() + " " + p4.getApellido() + ", edad " + p4.getEdad() + " años.");
        System.out.println(p5.getNombre() + " " + p5.getApellido() + ", edad " + p5.getEdad() + " años.");
    }
}
