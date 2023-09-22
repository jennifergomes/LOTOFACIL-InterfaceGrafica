package Lotofacil;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraLotofacil {

    private String menu = """
            *****************************              
            1- Apostar de 0 a 100.
            2- Apostar de A à Z.
            3- Apostar em par ou ímpar.
            0- Sair
            *****************************  
            """;
    int opcao;

    public String getMenu() {
        return menu;
    }

    public void SwithCaseNumero() {
        Scanner dado = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int numeroDigitado;
        String letra = "J";
        String letraDigitada;
        int numeroParOuImpar;

        switch (opcao) {
            case 1:
                System.out.println("\nOpção 1 escolhida!");
                System.out.printf("Digite um número de 0 a 100: ");
                numeroDigitado = dado.nextInt();
                if (numeroDigitado > 101 || numeroDigitado < 0) {
                    System.out.println("Aposta inválida\n");
                } else if (numeroDigitado == numero) {
                    System.out.println("\nParabéns! Você ganhou R$1000,00!\n");
                } else {
                    System.out.println("Que pena! O número sorteado foi: %d\n".formatted(numero));
                }


                break;

            case 2:
                System.out.println("\nOpção 2 escolhida!");
                System.out.printf("Escreva uma letra de A à Z: ");
                letraDigitada = dado.nextLine().toUpperCase();


                if (Character.isLetter(letraDigitada.charAt(0))) {
                    if (letraDigitada.equals(letra)) {
                        System.out.println("\nParabéns! Você ganhou R$500,00\n");
                    } else {
                        System.out.println("Que pena! A letra sorteada foi: %s\n".formatted(letra));
                    }
                } else {
                    System.out.println("Aposta inválida!\n");
                }
                break;
            case 3:
                System.out.println("\nOpção 3 escolhida!");
                System.out.printf("Digite um número: ");
                numeroParOuImpar = dado.nextInt();

                if (numeroParOuImpar % 2 == 0) {
                    System.out.println("\nParabéns! Você ganhou R$100,00\n");
                } else {
                    System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares!\n");
                }
                break;

            default:
                if (opcao != 0) {
                    System.out.println("\nOpção inválida!\n");
                }


        }
    }
}

