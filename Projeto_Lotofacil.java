import java.util.Scanner;
import java.util.Random;

public class Projeto_Lotofacil {
    public static void main(String[] args){

        int opcao, aposta;
        char letraPremiada = 'A', letraAposta = ' ';

        Scanner entrada = new Scanner (System.in);
        Random aleatorio = new Random();

        do{
            System.out.println("\n**************************");
            System.out.println("Menu LOTOFACIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A a Z");
            System.out.println("3) Apostar em par ou impar");
            System.out.println("0) Sair");
            System.out.println("**************************");

            System.out.print("Selecione uma opcao: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Informe um numero de 0 a 100 para ser apostado: ");
                    aposta = entrada.nextInt();

                    int resultado = aleatorio.nextInt(101);

                    if(aposta < 0 || aposta > 100){
                        System.out.println("Aposta invalida!");
                    }else{
                        if(resultado == aposta){
                            System.out.println("Voce ganhou R$1000,00 reais");
                        }else{
                            System.out.println("Que pena! O numero sorteado foi "+resultado);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Informe uma letra de A a Z para ser apostada: ");
                    letraAposta = entrada.next().charAt(0);

                    letraAposta = Character.toUpperCase(letraAposta);

                    if(Character.isLetter(letraAposta)){
                        if(letraAposta == letraPremiada){
                            System.out.println("Voce ganhou R$500,00 reais");
                        }else{
                            System.out.println("Que pena! A letra sorteada foi "+letraPremiada);
                        }
                    }else{
                        System.out.println("Aposta invalida!");
                    }

                    break;

                case 3:
                    System.out.print("Informe um numero inteiro para ser apostado: ");
                    aposta = entrada.nextInt();

                    if(aposta % 2 == 0){
                        System.out.println("Voce ganhou R$100,00 reais!");
                    }else{
                        System.out.println("Que pena! O numero digitado e impar e a premiacao foi apenas para numeros pares!");
                    }

                    break;

                case 0:
                    System.out.println("Sistema encerrado!");
                    break;

            }

        }while(opcao != 0);


    }
}   