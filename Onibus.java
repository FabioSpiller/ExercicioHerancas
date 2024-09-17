public class Onibus extends Veiculo {
    private int numeroDePassageiros;
    private int capacidadeMaximaDeCarga;
    private boolean temBanheiro;

    public Onibus(String id, String placa, String modelo, int numeroDePassageiros, int capacidadeMaximaDeCarga, boolean temBanheiro) {
        super(id, placa, modelo);
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeMaximaDeCarga = capacidadeMaximaDeCarga;
        this.temBanheiro = temBanheiro;
    }
    @Override
    public String toString() {
        return "Ônibus [ID=" + getId() + ", Placa=" + getPlaca() + ", Modelo=" + getModelo() +
                ", Número de Passageiros=" + numeroDePassageiros +
                ", Capacidade Máxima de Carga=" + capacidadeMaximaDeCarga +
                " kg, Tem Banheiro=" + (temBanheiro ? "Sim" : "Não") + "]"; }
}
