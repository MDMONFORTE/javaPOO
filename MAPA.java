import java.util.HashMap;
import java.util.Map;

public class MAPA {
public static void main(String[] args) {
    
    Map<String,Integer> mapa = new HashMap<>();
    mapa.put("Carlos", 33);
    mapa.put("María", 28);
    mapa.put("Juan", 34);
    System.out.println(mapa);
    Integer edad = mapa.get(("María"));
    System.out.println("edad: " + edad);
    System.out.println(mapa.containsKey("Pedro"));
    System.out.println(mapa.containsValue(28));
    mapa.remove("Juan");
    System.out.println(mapa);
    System.out.println(mapa.size());
}

}
