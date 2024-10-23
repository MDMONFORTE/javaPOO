public class SumaPrimeros500Numeros {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 500; i++){
            suma += i; //Suma acumulativa
        }

        System.out.println("Resultado: " + suma);
    }
}
