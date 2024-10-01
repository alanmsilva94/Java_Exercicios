package atividade1_1;

import java.util.Scanner;

public class Atividade1_1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int alfa = 150;
        final int beta = 350;
        int convidados;
        
        System.out.println("Informe o número de convidados. [Capacidade máxima de convidados é de 350]: ");
        convidados = input.nextInt();
        
        int adicionais = convidados - alfa;
        
        if (convidados > 0 && convidados <= 150)
        {
            System.out.println("Use o auditório Alfa");
        }
        
        else if (convidados > 151 && convidados <= 220)
        {
            System.out.println("Use o auditório Alfa e inclua mais "+ adicionais +" cadeiras");
        }
        
        else if (convidados > 152 && convidados <= 350)
        {
            System.out.println("Use o auditório Beta");
        }
        
       else if (convidados < 0 || convidados > 350)
       {  
           System.out.println("Número de convidados inválido.");
       }      
    }
}
