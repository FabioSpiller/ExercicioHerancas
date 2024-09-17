public class Van extends Veiculo {
    private int numeroDePassageiros;

    public Van(String id, String placa, String modelo, int numeroDePassageiros) {
        super(id, placa, modelo);
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    @Override
    public String toString() {
        return "Van [ID=" + getId() + ", Placa=" + getPlaca() + ", Modelo=" + getModelo() +
                ", Número de Passageiros=" + numeroDePassageiros + "]";
    }
}
