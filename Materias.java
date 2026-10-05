import java.util.ArrayList;

public class Materias {
    public static void main(String[] args) {
        ArrayList<String> materias = new ArrayList<>();

        materias.add("Fisica");
        materias.add("quimica");
        materias.add("Programación");

        System.out.println("Materias inscritas:");
        for(String materia : materias){
            System.out.println(materia);
        }
    }
}