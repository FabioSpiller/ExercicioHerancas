public class Onibus extends Veiculo {
    private int numeroDePassageiros;
    private int capacidadeMaximaDeCarga;
    private boolean temBanheiro;

    public Onibus(String id, String placa, String modelo, int numeroDePassageiros, int capacidadeMaximaDeCarga, boolean temBanheiro) {
        super(id, placa, modelo); //recebe do pai
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeMaximaDeCarga = capacidadeMaximaDeCarga;
        this.temBanheiro = temBanheiro;
    }

    // get e sets

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public int getCapacidadeMaximaDeCarga() {
        return capacidadeMaximaDeCarga;
    }

    public void setCapacidadeMaximaDeCarga(int capacidadeMaximaDeCarga) {
        this.capacidadeMaximaDeCarga = capacidadeMaximaDeCarga;
    }

    public boolean isTemBanheiro() {
        return temBanheiro;
    }

    public void setTemBanheiro(boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }

    @Override
    public String toString() {
        return "Ônibus [ID=" + getId() + ", Placa=" + getPlaca() + ", Modelo=" + getModelo() +
                ", Número de Passageiros=" + numeroDePassageiros +
                ", Capacidade Máxima de Carga=" + capacidadeMaximaDeCarga +
                " kg, Tem Banheiro=" + (temBanheiro ? "Sim" : "Não") + "]"; }
}
