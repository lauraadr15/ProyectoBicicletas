import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 🔹 Actividad 2: Crear bicicletas
        BicicletaElectrica biciE1 = new BicicletaElectrica(
            "Giant", "E-Bike 500", 18.5, "Aluminio",
            27.5, "E123", 1, "2023-01-15",
            500, 250, 25.0
        );

        BicicletaElectrica biciE2 = new BicicletaElectrica(
            "Specialized", "Turbo Vado", 20.0, "Carbono",
            29.0, "E124", 2, "2023-03-20",
            600, 350, 28.0
        );

        BicicletaMecanica biciM1 = new BicicletaMecanica(
            "Trek", "X-Caliber", 14.2, "Acero",
            29.0, "M456", 3, "2023-02-10",
            21, "Disco hidráulico", true
        );

        System.out.println("🔹 Actividad 2: Probando métodos individuales");
        biciE1.mostrarEstado();
        System.out.println("Autonomía estimada: " + biciE1.calcularAutonomiaRestanteKm() + " km");
        biciM1.mostrarEstado();
        System.out.println("Descripción técnica: " + biciM1.descripcionTecnica());

        // 🔹 Actividad 3: Lista polimórfica
        ArrayList<Bicicleta> listaBicis = new ArrayList<>();
        listaBicis.add(biciE1);
        listaBicis.add(biciE2);
        listaBicis.add(biciM1);

        System.out.println("\n🔹 Actividad 3: Recorriendo lista de bicicletas (polimorfismo)");
        for (Bicicleta b : listaBicis) {
            b.mostrarEstado();
        }

        // 🔹 Actividad 4: Registro de mantenimiento
        System.out.println("\n🔹 Actividad 4: Simulación de mantenimiento");

        // Cambiar estado a EN_MANTENIMIENTO
        biciE1.setEstadoActual("EN_MANTENIMIENTO");
        biciE1.mostrarEstado();

        // Registrar mantenimiento
        biciE1.registrarMantenimiento("2023-09-14");
        biciE1.mostrarEstado();

        // Ahora la bicicleta mecánica
        biciM1.setEstadoActual("EN_MANTENIMIENTO");
        biciM1.mostrarEstado();

        biciM1.registrarMantenimiento("2023-09-14");
        biciM1.mostrarEstado();
    }
}
