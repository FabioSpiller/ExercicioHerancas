import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar e exibir Van");
            System.out.println("2. Criar e exibir Microônibus");
            System.out.println("3. Criar e exibir Ônibus");
            System.out.println("4. Criar e exibir Motorista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite o ID da Van: ");
                    String vanId = scanner.nextLine();
                    System.out.print("Digite a placa da Van: ");
                    String vanPlaca = scanner.nextLine();
                    System.out.print("Digite o modelo da Van: ");
                    String vanModelo = scanner.nextLine();
                    System.out.print("Digite o número de passageiros da Van: ");
                    int numeroPassageirosVan = scanner.nextInt();
                    scanner.nextLine();

                    Van van = new Van(vanId, vanPlaca, vanModelo, numeroPassageirosVan);
                    System.out.println(van);
                    break;

                case 2:
                    System.out.print("Digite o ID do Microônibus: ");
                    String microonibusId = scanner.nextLine();
                    System.out.print("Digite a placa do Microônibus: ");
                    String microonibusPlaca = scanner.nextLine();
                    System.out.print("Digite o modelo do Microônibus: ");
                    String microonibusModelo = scanner.nextLine();
                    System.out.print("Digite o número de assentos do Microônibus: ");
                    int numeroAssentosMicroonibus = scanner.nextInt();
                    scanner.nextLine();

                    Microonibus microonibus = new Microonibus(microonibusId, microonibusPlaca, microonibusModelo, numeroAssentosMicroonibus);
                    System.out.println(microonibus);
                    break;

                case 3:
                    System.out.print("Digite o ID do Ônibus: ");
                    String onibusId = scanner.nextLine();
                    System.out.print("Digite a placa do Ônibus: ");
                    String onibusPlaca = scanner.nextLine();
                    System.out.print("Digite o modelo do Ônibus: ");
                    String onibusModelo = scanner.nextLine();
                    System.out.print("Digite o número de passageiros do Ônibus: ");
                    int numeroPassageirosOnibus = scanner.nextInt();
                    System.out.print("Digite a capacidade máxima de carga do Ônibus (em kg): ");
                    int capacidadeCargaOnibus = scanner.nextInt();
                    System.out.print("O Ônibus tem banheiro? (true/false): ");
                    boolean temBanheiro = scanner.nextBoolean();
                    scanner.nextLine();

                    Onibus onibus = new Onibus(onibusId, onibusPlaca, onibusModelo, numeroPassageirosOnibus, capacidadeCargaOnibus, temBanheiro);
                    System.out.println(onibus);
                    break;

                case 4:
                    System.out.print("Digite o nome do Motorista: ");
                    String nomeMotorista = scanner.nextLine();
                    System.out.print("Digite o CPF do Motorista: ");
                    int cpfMotorista = scanner.nextInt();
                    System.out.print("Digite a data de nascimento do Motorista: ");
                    scanner.nextLine();
                    String dataNascimentoMotorista = scanner.nextLine();

                    Motorista motorista = new Motorista(nomeMotorista, cpfMotorista, dataNascimentoMotorista, null);
                    System.out.println(motorista);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
