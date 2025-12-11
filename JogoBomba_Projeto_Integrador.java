/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package ado11;

import java.util.Scanner;

/**
 *
 * @author kauane mineiro coimbra
 *
 * -1 -> bomba
 0 -> posicao livre
 1 -> posicao escolhida pelo jogador
 */import java.util.Scanner;
public class Ado11 {


    static int tamanhovetor() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int tv = input.nextInt();
        return tv;
    }


    static int[] criarVetor(int tamanho) {
  
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0; // inicializa todas as posicoes como vazias
        }
        // Mostra o vetor com posicao e simbolos visuais
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + "    ");
        }
        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*--* ");
        }
        System.out.println();
        return vetor;

    }

    
    static int quantidadeBombas(int tamanho) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Bombas: ");
        int bombas;
        do { // ROXO - repetir enquanto invalido
            System.out.print("Quantas bombas deseja colocar (entre 1 e " + tamanho + ")? "); // ROXO
            bombas = input.nextInt(); // ROXO - entrada do usuario
            if (bombas <= 0 || bombas > tamanho) { // ROXO - valido
                System.out.println("Quantidade invalida, tente novamente"); // ROXO
            }
        } while (bombas <= 0 || bombas > tamanho); // ROXO - repetir
        System.out.println("Quantidade escolhida valida: " + bombas); // ROXO
        return bombas;

    }

    
    static void colocarBombas(int[] vetor, int bombas) {
    
        java.util.Random random = new java.util.Random();
        int bombasColocadas = 0;

        while (bombasColocadas < bombas) {
            int pos = random.nextInt(vetor.length); // sorteia posicao no vetor

            if (vetor[pos] == 0) { //ja coloca bomba se estiver vazio
                vetor[pos] = 9; // 9 = bomba
                bombasColocadas++;
            }
        }
    }

    
    static boolean processarOsPassosDoJogador(int[] campo, int posicao) {
     
        if (posicao < 0 || posicao >= campo.length) {
            System.out.println("Jogada invalida! Fora do campo.");
            return false;
        }
        if (campo[posicao] == -1) {
            System.out.println("Voce ja tentou essa posicao");
            return false;
        }
        if (campo[posicao] == 9) {
            System.out.println(" BOOOM! Voce acertou uma bomba!");
            System.out.println("GAME OVER!");
            return true;
        }
        campo[posicao] = -1;

        int bombasProximas = 0;

        // posicao anterior
        if ((posicao - 1 >= 0 && campo[posicao - 1] == 9)) {
            bombasProximas++;
        }

        // Proxima posicao
        if ((posicao + 1 < campo.length) && (campo[posicao + 1] == 9)) {
            bombasProximas++;
        }
        if (bombasProximas == 0) {
            System.out.println("aee… area totalmente segura! Nenhuma bomba proxima.");
        } else if (bombasProximas == 1) {
            System.out.println("aee¸Cuidado! ha 1 bomba proxima.");
        } else {
            System.out.println("aee, Cuidado!ha 1 " + bombasProximas + " bombas proximas.");
        }
        return false;
    }

    
    static void mostrarCampoDuranteOJogo(int[] campo) {
        // Mostrar indices
        for (int i = 0; i < campo.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        // Mostrar posicao jogadas
        for (int i = 0; i < campo.length; i++) {
            if (campo[i] == -1) {
                System.out.print("X  "); // posicao ja jogada
            } else {
                System.out.print("-  "); // posicao nao jogada, bombas ocultas
            }
        }
        System.out.println();
    }

    //  Nova funcao para mostrar o campo COMPLETO ao perder
    static void mostrarCampoCompleto(int[] campo) {
        // Mostrar indices
        for (int i = 0; i < campo.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        // Mostrar bombas e  posicao jogadas
        for (int i = 0; i < campo.length; i++) {
            if (campo[i] == 9) {
                System.out.print("b  "); // bomba revelada
            } else if (campo[i] == -1) {
                System.out.print("X  "); // posicao ja jogada¡ jogada
            } else {
                System.out.print("-  "); //posicao nao jogada
            }
        }
        System.out.println();
    }

    /////////////////////////////////////////////////////////////////////////////
    static boolean verificouVitoria(int[] campo, int bombas) {
        int contagemSeguras = 0;
        for (int i = 0; i < campo.length; i++) {
            if (campo[i] == -1) {
                contagemSeguras++;
            }
        }
        return contagemSeguras == campo.length - bombas;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1) Pergunta o tamanho do vetor e cria o campo
        int tamanho = tamanhovetor();
        int[] campo = criarVetor(tamanho);

        // 2) Pergunta quantas bombas e coloca aleatoriamente
        int bombas = quantidadeBombas(tamanho);
        colocarBombas(campo, bombas);

        // 4) Loop principal de jogadas: o usuario escolhe  posicao
        System.out.println("\n Agora voce pode jogar. Digite -1 para sair.");
        while (true) {
            System.out.print("Escolha uma  posicao (0 a " + (campo.length - 1) + "): ");
            int pos = input.nextInt();

            if (pos == -1) {
                System.out.println("Saindo do jogo. ate mais!");
                break;
            }

            // funcao para processar a jogada
            boolean pisouBomba = processarOsPassosDoJogador(campo, pos);
            if (pisouBomba) {
                System.out.println("Fim de jogo!");
                break; // ¹ sai do loop
            }
            if (verificouVitoria(campo, bombas)) {
                System.out.println("\n nossa parabens! Voce ganhou! Todas as  posicoes seguras foram reveladas.");
                mostrarCampoCompleto(campo); // mostra todas as bombas ao final
                break;
            }
            // Mostra o campo ao usuario a jogada (bombas mostradas como 'b')
            System.out.println("Estado atual do campo:");
            mostrarCampoDuranteOJogo(campo);
        }

        input.close();
    }

    /* funcao auxiliar para mostrar o vetor substituindo 9 por 'b' e -1 por 'X'
   (nao altera o vetor, e imprime) */
    static void mostrarCampoComB(int[] campo) {
        for (int i = 0; i < campo.length; i++) {
            if (campo[i] == 9) {
                System.out.print("b ");         // bomba visivel como 'b'
            } else if (campo[i] == -1) {
                System.out.print("X ");         //  posicao ja¡ revelada/marcada
            } else {
                System.out.print("- ");         //  posicao fechada / sem bomba conhecida
            }
        }
        System.out.println();
    } 
}
}
}

}

