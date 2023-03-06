package ExerciciosifElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe valor 1:");
        double valor1 = sc.nextDouble();
        System.out.println("Informe o valor 2:");
        double valor2 = sc.nextDouble();
        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior " + valor1);

        } else {
            System.out.println("Valor 2  é maior " + valor2);

        }

    }

    public void exercicio2() {
        System.out.println("Informe o Ano em que você nasceu:");
        int anoNascimento = sc.nextInt();
        int total = 2023 - anoNascimento;
        if (total >= 16) {
            System.out.println("Você pode Votar");
        } else {
            System.out.println("Voce não pode votar");
        }

    }

    public void exercicio3() {
        System.out.println("Informe a Senha:");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("Acesso Permitido");

        } else {
            System.out.println("Acesso Negado");
        }

    }

    public void exercicio4() {
        System.out.println("Número de maças que deseja comprar:");

        
    }
}
