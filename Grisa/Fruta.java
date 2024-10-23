public class Fruta {
    //Atributos
    private String nombre;
    private String color;
    private double peso;
    
    //Constructor
    public Fruta(String nombre, String color, double peso){
        this.nombre=nombre;
        this.color=color;
        this.peso=peso;
    }
    //Metodos
    public void mostrarInformacion(){
        System.out.println("La fruta "+nombre+" es de color "+color+" y pesa "+ peso+ "gramos.");
    }

    public static void main(String[] args) {
    Fruta;
    }
}
