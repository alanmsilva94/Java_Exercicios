package atividade1_2;

import java.util.Scanner;

public class Atividade1_2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro hóspede: ");
        String nome1 = input.next();
        System.out.println("Informe a idade do primeiro hóspede: ");
        int idade1 = input.nextInt();
        System.out.println("Informe o nome do segundo hóspede: ");
        String nome2 = input.next();
        System.out.println("Informe a idade do segundo hóspede: ");
        int idade2 = input.nextInt();
        
        String quartoA = nome1;
        String quartoB = nome2;
        
        if(idade2 > idade1)
        {
           quartoA = nome2;
           quartoB = nome1;
        }
       
        int desconto = 0;
        if(idade1 >= 60 || idade2 >= 60)
        {
            desconto = 40;
        }
        System.out.println("Quarto A: "+quartoA+" com "+desconto+"% de desconto");
        System.out.println("Quarto B: "+quartoB);
        
    } 
}
