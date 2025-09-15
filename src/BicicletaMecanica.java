public class BicicletaMecanica extends Bicicleta {
    private int numeroVelocidades;
    private String tipoFrenos;
    private boolean tienePortaequipaje;

    public BicicletaMecanica(String marca, String modelo, double pesoKg, String tipoCuadro,
                             double tamañoRuedaPulgadas, String numeroSerie, int idInternoSistema,
                             String fechaRegistro, int numeroVelocidades, String tipoFrenos,
                             boolean tienePortaequipaje) {
        super(marca, modelo, pesoKg, tipoCuadro, tamañoRuedaPulgadas,
              numeroSerie, idInternoSistema, fechaRegistro);
        this.numeroVelocidades = numeroVelocidades;
        this.tipoFrenos = tipoFrenos;
        this.tienePortaequipaje = tienePortaequipaje;
    }

    public String descripcionTecnica() {
        return "Velocidades: " + numeroVelocidades + ", Frenos: " + tipoFrenos +
               ", Portaequipaje: " + (tienePortaequipaje ? "Sí" : "No");
    }
}
