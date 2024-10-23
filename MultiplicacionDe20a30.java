public class MultiplicacionDe20a30 {
    public static void main(String[] args) {
        long producto = 1;  //Long para evitar desbordamiento

        for (int i = 20; i <= 30; i++){
            producto *= i;  //Mult acumulativa
        }

        System.out.println("Resultado: " + producto);
    }
}
