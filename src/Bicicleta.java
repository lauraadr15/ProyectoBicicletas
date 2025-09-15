public abstract class Bicicleta {
    // Atributos comunes
    private String marca;
    private String modelo;
    private double pesoKg;
    private String tipoCuadro;
    private double tamañoRuedaPulgadas;
    private double kilometrajeTotalKm;
    private String fechaUltimoMantenimiento;
    private boolean necesitaServicio;
    private String estadoActual;
    private String numeroSerie;
    private int idInternoSistema;
    private String fechaRegistro;

    // Constructor
    public Bicicleta(String marca, String modelo, double pesoKg, String tipoCuadro,
                     double tamañoRuedaPulgadas, String numeroSerie, int idInternoSistema,
                     String fechaRegistro) {
        this.marca = marca;
        this.modelo = modelo;
        this.pesoKg = pesoKg;
        this.tipoCuadro = tipoCuadro;
        this.tamañoRuedaPulgadas = tamañoRuedaPulgadas;
        this.numeroSerie = numeroSerie;
        this.idInternoSistema = idInternoSistema;
        this.fechaRegistro = fechaRegistro;
        this.estadoActual = "DISPONIBLE";
        this.necesitaServicio = false;
        this.kilometrajeTotalKm = 0.0;
    }

    // Métodos comunes
    public void mostrarEstado() {
        System.out.println("La bicicleta con número de serie " + numeroSerie +
                           " está actualmente: " + estadoActual);
    }

    public void registrarMantenimiento(String fecha) {
        this.fechaUltimoMantenimiento = fecha;
        this.estadoActual = "DISPONIBLE";
        this.necesitaServicio = false;
        System.out.println("Mantenimiento registrado en fecha: " + fecha);
    }

    // Getters y Setters
    public String getEstadoActual() { return estadoActual; }
    public void setEstadoActual(String estadoActual) { this.estadoActual = estadoActual; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPesoKg() { return pesoKg; }
    public String getNumeroSerie() { return numeroSerie; }
}
