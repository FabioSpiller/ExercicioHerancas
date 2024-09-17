public class Motorista {
    private String nome;
    private int cpf;
    private String dataNascimento;


    public Motorista(String nome, int cpf, String dataNascimento, Veiculo veiculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return "Motorista [Nome=" + nome + ", CPF=" + cpf + ", Data de Nascimento=" + dataNascimento + "]";
    }
}


