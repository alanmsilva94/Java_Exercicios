package atividade1_5;

import java.util.Scanner;

public class Atividade1_5 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String hotel[][] = new String[4][3];
        int andar;
        int quarto;
        String ocupar;
        String continuar = "S";

        while (continuar.equals("S")) {
            System.out.print("Aperte [X] para efetuar a hospedagem: ");
            ocupar = input.next().toUpperCase();

            if (ocupar.equals("X")) 
            {
                System.out.println("Escolha o nº do andar (1-4) que desejar ocupar: ");
                andar = input.nextInt() - 1;
                System.out.println("Informe o nº do quarto(1-3) que desejar ocupar: ");
                quarto = input.nextInt() - 1;

                if (andar < 0 || andar > 3 || quarto < 0 || quarto > 3) 
                {
                    System.out.print("Andar ou quarto inválido. Por favor, informe um valor entre 1 e 4 para o andar e entre 1 e 3 para o quarto.");
                    System.out.print("\n");
                } 
                else 
                {
                    hotel[andar][quarto] = ocupar;
                }
            } 
            else 
            {
                System.out.println("Opção inválida.");
            }

            System.out.print("Tabela dos Quartos - Livres & Ocupados: \n");
            for (int i = hotel.length - 1; i >= 0; i--) 
            {
                System.out.print((i + 1) + "º Andar | ");
                for (int j = 0; j < 3; j++) 
                {
                    System.out.print("Quarto " + (j + 1) + ": ");
                    System.out.print(hotel[i][j] + " " + " | ");
                }
                System.out.print("\n");
            }
            System.out.print("Deseja se hospedar? (S/N): ");
            continuar = input.next().toUpperCase();
            System.out.print("\n");
        }
    }
}
