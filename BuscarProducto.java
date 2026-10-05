import java.util.ArrayList;

public class BuscarProducto {
    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        productos.add("pulsera");
        productos.add("peine");
        productos.add("crema");

        if(productos.contains("peine")){
            System.out.println("Producto encontrado");
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}