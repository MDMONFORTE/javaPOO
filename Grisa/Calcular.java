class Cuadrado {
    //Atributos
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Calcular {

    public static void main(String[] args){
        Cuadrado[] cuadrados = new Cuadrado[3];
        Rectangulo[] rectangulos = new Rectangulo[2];
        Circulo[] circulos = new Circulo [4];

        cuadrados[0] = new Cuadrado(5);
        cuadrados[1] = new Cuadrado(3);
        cuadrados[2] = new Cuadrado(7);

        rectangulos[0] = new Rectangulo(4,6);
        rectangulos[1] = new Rectangulo(2,8);

        circulos[0] = new Circulo(2);
        circulos[1] = new Circulo(5);
        circulos[2] = new Circulo(3);
        circulos[3] = new Circulo(1);

        System.out.println("Cuadrados: ");
        for (Cuadrado cuadrado : cuadrados) {
            System.out.println("Area: " + cuadrado.calcularArea() + ", Perimetro: "+ cuadrado.calcularPerimetro());
        }

        System.out.println("\nRectángulos: ");
        for (Rectangulo rectangulo : rectangulos) {
            System.out.println("Area: " + rectangulo.calcularArea() + ", Perimetro: "+ rectangulo.calcularPerimetro());
        }

        System.out.println("\nCírculos: ");
        for (Circulo circulo : circulos) {
            System.out.println("Area: " + circulo.calcularArea() + ", Perimetro: "+ circulo.calcularPerimetro());
        }
    }
}
