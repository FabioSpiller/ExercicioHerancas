public class Microonibus extends Veiculo {
    private int numeroDeAssentos;

    public Microonibus(String id, String placa, String modelo, int numeroDeAssentos) {
        super(id, placa, modelo);
        this.numeroDeAssentos = numeroDeAssentos;
    }

    public int getNumeroDeAssentos() {
        return numeroDeAssentos;
    }

    public void setNumeroDeAssentos(int numeroDeAssentos) {
        this.numeroDeAssentos = numeroDeAssentos;
    }

    @Override
    public String toString() {
        return "Microônibus [ID=" + getId() + ", Placa=" + getPlaca() + ", Modelo=" + getModelo() +
                ", Número de Assentos=" + numeroDeAssentos + "]";
    }
}
