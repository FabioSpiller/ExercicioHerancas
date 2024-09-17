public class Microonibus extends Veiculo {
    private int numeroDeAssentos;

    public Microonibus(String id, String placa, String modelo, int numeroDeAssentos) {
        super(id, placa, modelo); // Recebe do pai
        this.numeroDeAssentos = numeroDeAssentos;
    }


    // get e set do micro

    public int getNumeroDeAssentos() {
        return numeroDeAssentos;
    }

    public void setNumeroDeAssentos(int numeroDeAssentos) {
        this.numeroDeAssentos = numeroDeAssentos;
    }

    // prepara print
    @Override
    public String toString() {
        return "Microônibus [ID=" + getId() + ", Placa=" + getPlaca() + ", Modelo=" + getModelo() +
                ", Número de Assentos=" + numeroDeAssentos + "]";
    }
}
