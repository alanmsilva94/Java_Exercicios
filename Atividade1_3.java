package atividade1_3;

import java.util.Scanner;

public class Atividade1_3 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String continuar = "S";
        String hospede;
        float diaria;
        int idade; 
        int gratuidade = 0;
        int meia = 0;
        float total_pago = 0.0f;
        
        
        System.out.print("Informe o valor da diaria: ");
        diaria = input.nextFloat();
        System.out.print("\n");
        
        while (continuar.equals("S")) 
        {
            System.out.print("Informe o nome do hóspede: ");
            hospede = input.next();
            System.out.print("\n");
            
            System.out.print("Informe a sua idade: ");
            idade = input.nextInt();
            System.out.print("\n"); 

            total_pago = total_pago + diaria;
            
            if(idade <= 4)
            {
                System.out.print(hospede + " possui gratuidade.\n");
                System.out.print("\n");
                gratuidade = gratuidade + 1;
                total_pago = total_pago - diaria;
            }
            
            else if (idade >= 80)
            {
                System.out.print(hospede + " paga meia.\n");
                System.out.print("\n");
                meia = meia + 1;
                total_pago = total_pago - (diaria / 2);
            }

            System.out.print("Deseja continuar informando os dados [S] para sim ou [N] para não: ");
            continuar = input.next().toUpperCase();
            System.out.print("\n");
        }
        
    System.out.print("A quantidade de hospedagem gratuitas é de " +gratuidade+ " hospedes. \n");
    System.out.print("\n");
    System.out.print("A quantidade de hospedagem que pagam meia é de " +meia+ " hospedes. \n");
    System.out.print("\n");
    System.out.print("O valor total a pagar é de R$ " + total_pago);
    } 
}
