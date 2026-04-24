import javax.swing.JOptionPane;

public class SistemaLogin {

    // Atributos
    static String[] nomes = new String[5];
    static String[] senhas = new String[5];
    static int pos = 0;
    static final int MAX = 5;

    public static void main(String[] args) {

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU:\n1 - Inserir\n2 - Listar\n3 - Ordenar (Bubble Sort)\n4 - Buscar senha\n5 - Sair"));

            switch (opcao) {
                case 1:
                    inserir();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    ordenar();
                    break;
                case 4:
                    buscar();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 5);
    }

    // Método 1 - Inserir
    public static void inserir() {
        if (pos < MAX) {
            nomes[pos] = JOptionPane.showInputDialog("Digite o nome:");
            senhas[pos] = JOptionPane.showInputDialog("Digite a senha:");
            pos++;
        } else {
            JOptionPane.showMessageDialog(null, "Limite máximo atingido!");
        }
    }

    // Método 2 - Listar
    public static void listar() {
        String lista = "";

        for (int i = 0; i < pos; i++) {
            lista += "Posição " + i + " - Nome: " + nomes[i] + " | Senha: " + senhas[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }

    // Método 3 - Ordenar (Bubble Sort pela senha)
    public static void ordenar() {
        for (int i = 0; i < pos - 1; i++) {
            for (int j = 0; j < pos - 1 - i; j++) {

                if (senhas[j].compareTo(senhas[j + 1]) > 0) {

                    // Troca senha
                    String tempSenha = senhas[j];
                    senhas[j] = senhas[j + 1];
                    senhas[j + 1] = tempSenha;

                    // Troca nome junto
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Ordenado com sucesso!");
    }

    // Método 4 - Busca Binária
    public static void buscar() {
        String senhaBusca = JOptionPane.showInputDialog("Digite a senha para buscar:");

        int inicio = 0;
        int fim = pos - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            int comparacao = senhaBusca.compareTo(senhas[meio]);

            if (comparacao == 0) {
                JOptionPane.showMessageDialog(null,
                        "Encontrado!\nNome: " + nomes[meio] +
                        "\nSenha: " + senhas[meio] +
                        "\nPosição: " + meio);
                encontrado = true;
                break;

            } else if (comparacao > 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Senha não encontrada!");
        }
    }
}