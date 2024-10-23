import java.util.HashMap;
import java.util.Map;


public class Hola {
    public static void main(String[] args) {
        Map<String, Integer>mapa= new HashMap<>();
        mapa.put("Juan",25);
        mapa.put("Ana",30);
        mapa.put("Pedro",35);
        System.out.println(mapa);
        Integer edad = mapa.get("Ana");
        System.out.println("edad: "+edad);
        System.out.println(mapa.containsKey("Pedro1"));
        System.out.println(mapa.containsValue(115));
        mapa.remove("Ana");
        System.out.println(mapa);
        System.out.println(mapa.size());
        System.out.println("PROBANDO");
    }
}
