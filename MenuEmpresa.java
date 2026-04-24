
import java.io.File;
import java.util.Scanner;

public class MenuEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcao;

        do {
            System.out.println("menu:");
            System.out.println("1 novaPasta");
            System.out.println("2 lista");
            System.out.println("3 sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a linha restante

            switch (opcao) {
                case 1:
                    System.out.print("digitar o nome da nova pasta: ");
                    String nomePasta = scanner.nextLine();
                    criarNovaPasta(nomePasta);
                    break;
                case 2:
                    listarInformacoes(empresa);
                    break;
                case 3:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("opção inválida!");
            }
        } while (opcao != 3);
    }


    private static void listarInformacoes(Empresa empresa) {
        System.out.println("Informações da Empresa:");
        System.out.print("Digite o email da empresa: ");
        String email = new Scanner(System.in).nextLine();
        empresa.setEmail(email);
        System.out.print("Digite o CEP da empresa: ");
        String cep = new Scanner(System.in).nextLine();
        empresa.setCep(cep);
        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = new Scanner(System.in).nextLine();
        empresa.setNomeEmpresa(nomeEmpresa);
        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = new Scanner(System.in).nextLine();
        empresa.setCnpj(cnpj);

        System.out.println("Email: " + empresa.getEmail());
        System.out.println("CEP: " + empresa.getCep());
        System.out.println("Nome da Empresa: " + empresa.getNomeEmpresa());
        System.out.println("CNPJ: " + empresa.getCnpj());
    }
}