import java.util.ArrayList;

public class Asistentes {
    public static void main(String[] args) {

        ArrayList<String> asistentes = new ArrayList<>();

        asistentes.add("Erandi");
        asistentes.add("Adair");
        asistentes.add("Roldan");

        asistentes.remove("Roldan");

        System.out.println(asistentes);
    }
}