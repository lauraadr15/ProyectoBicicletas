import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de distintos tipos
        BicicletaElectrica biciE1 = new BicicletaElectrica(
            "Giant", "E-Bike 500", 18.5, "Aluminio",
            27.5, "E123", 1, "2023-01-15",
            500, 250, 25.0
        );

        BicicletaMecanica biciM1 = new BicicletaMecanica(
            "Trek", "X-Caliber", 14.2, "Acero",
            29.0, "M456", 2, "2023-02-10",
            21, "Disco hidráulico", true
        );

        BicicletaElectrica biciE2 = new BicicletaElectrica(
            "Specialized", "Turbo Vado", 20.0, "Carbono",
            29.0, "E124", 3, "2023-03-20",
            600, 350, 28.0
        );

        // Lista polimórfica
        ArrayList<Bicicleta> listaBicis = new ArrayList<>();
        listaBicis.add(biciE1);
        listaBicis.add(biciM1);
        listaBicis.add(biciE2);

        // Recorrer lista con polimorfismo
        System.out.println("📋 Estado de todas las bicicletas:");
        for (Bicicleta b : listaBicis) {
            b.mostrarEstado();  // mismo método, comportamiento según objeto
        }
    }
}
