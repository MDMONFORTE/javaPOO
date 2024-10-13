import java.util.HashMap;

public class AgendaMikel {

    public void addContact(String username, String number, HashMap<String, String> contactos) {
        if (contactos.containsKey(username)) {
            System.out.println("El contacto ya existe");
        } else {
            contactos.put(username, number);
        }
    }

    public void removeContact(String username, HashMap<String, String> contactos) {
        if (contactos.containsKey(username)) {
            contactos.remove(username);
        } else {
            System.out.println("No existe");
        }
    }

    public void showContacts(HashMap<String, String> contactos) {
        for (String key : contactos.keySet()) {
            System.out.println("Key: " + key + ", Value: " + contactos.get(key));
        }
    }

    public void eraseContacts(HashMap<String, String> contactos) {
        contactos.clear();
    }

    public static void main(String[] args) {
        // Crear una instancia de Agenda
        Agenda miAgenda = new Agenda();

        // Crear un HashMap de contactos
        HashMap<String, String> contactos = new HashMap<>();

        // Añadir contactos al HashMap
        miAgenda.addContact("Carlos", "3737383", contactos);
        miAgenda.addContact("Nacho", "284746463", contactos);
        miAgenda.addContact("Iván", "5848484", contactos);
        miAgenda.addContact("Jorge", "748492984", contactos);

        // Mostrar los contactos
        miAgenda.showContacts(contactos);
    }
}
