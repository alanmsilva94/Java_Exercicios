package atividade1_4;

import java.util.Scanner;

public class Atividade1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        String[] hospede = new String[14];
        String pesquisar;
        int opcoes;

        System.out.print("Bem-vindo(a)!\n");
        System.out.print("Escolha uma das opções a seguir. (1 - Cadastrar, 2 - Pesquisar, 3 - Sair): ");
        opcoes = input.nextInt();
        System.out.print("\n");

        if (opcoes < 1 || opcoes > 3) {
            System.out.print("Opção inválida. Insira uma opção válida: ");
            opcoes = input.nextInt();
            System.out.print("\n");
        }

        while (opcoes != 3) {
            switch (opcoes) {
                case 1:
                    System.out.print("Digite o nome do hospede a ser cadastrado: ");
                    hospede[contador] = input.next();
                    System.out.print("\n");
                    contador = contador + 1;
                    System.out.print("Escolha uma das opções a seguir. (1 - Cadastrar, 2 - Pesquisar, 3 - Sair): ");
                    opcoes = input.nextInt();
                    System.out.print("\n");

                    if (contador > 15) {
                        System.out.print("Máximo de cadastros atingido");
                        System.out.print("\n");
                        System.out.print("Escolha uma das opções a seguir. (1 - Cadastrar, 2 - Pesquisar, 3 - Sair): ");
                        opcoes = input.nextInt();
                        System.out.print("\n");
                    }
                    break;

                case 2:
                    System.out.print("Informe o nome do hóspede que dejesar pesquisar: ");
                    pesquisar = input.next();
                    System.out.print("\n");

                    int encontrado = -1;
                    for (int i = 0; i < contador; i++) {
                        if (pesquisar.equals(hospede[i])) {
                            encontrado = i;
                            break;
                        }
                    }
                    if (encontrado != -1) {
                        System.out.print("Hóspede " + pesquisar + " foi encontrado no índice " + (encontrado + 1) + ".\n");
                        System.out.print("\n");
                        System.out.print("Escolha uma das opções a seguir. (1 - Cadastrar, 2 - Pesquisar, 3 - Sair): ");
                        opcoes = input.nextInt();
                        System.out.print("\n");
                    } else {
                        System.out.print("Hóspede não encontrado! \n");
                        System.out.print("\n");
                        System.out.print("Escolha uma das opções a seguir. (1 - Cadastrar, 2 - Pesquisar, 3 - Sair): ");
                        opcoes = input.nextInt();
                        System.out.print("\n");
                    }
                    break;

                case 3:
                    break;
            }
        }
        System.out.print("Programa encerrador!\n");
    }
}
