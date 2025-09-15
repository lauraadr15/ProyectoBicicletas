public class BicicletaElectrica extends Bicicleta {
    private double capacidadBateria;
    private int nivelCargaActualPorcentaje;
    private int potenciaMotorWatts;
    private boolean asistenciaPedaleo;
    private double velocidadMaximaKmH;
    private boolean gpsIntegrado;
    private boolean bluetoothDisponible;

    public BicicletaElectrica(String marca, String modelo, double pesoKg, String tipoCuadro,
                              double tamañoRuedaPulgadas, String numeroSerie, int idInternoSistema,
                              String fechaRegistro, double capacidadBateria,
                              int potenciaMotorWatts, double velocidadMaximaKmH) {
        super(marca, modelo, pesoKg, tipoCuadro, tamañoRuedaPulgadas,
              numeroSerie, idInternoSistema, fechaRegistro);
        this.capacidadBateria = capacidadBateria;
        this.potenciaMotorWatts = potenciaMotorWatts;
        this.velocidadMaximaKmH = velocidadMaximaKmH;
        this.nivelCargaActualPorcentaje = 100; // batería llena por defecto
    }

    public double calcularAutonomiaRestanteKm() {
        return (capacidadBateria * nivelCargaActualPorcentaje / 100.0) / 10.0;
    }
}
