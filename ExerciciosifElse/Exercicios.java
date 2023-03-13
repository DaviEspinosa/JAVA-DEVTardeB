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
        double macaPêga = sc.nextDouble();
        if (macaPêga >= 12) {
            double total = macaPêga* 0.25;
            System.out.println("O valor que você pagará será de: " + total);
        } else {
            double total = macaPêga* 0.30;
            System.out.println("O valor que você pagará será de :" + total);
        }

    }

    public void exercicio5() {
        System.out.println("Insira um valor:");
        int v1 = sc.nextInt();
        System.out.println("Insira um segundo valor:");
        int v2 = sc.nextInt();
        System.out.println("Insira um terceiro valor:");
        int v3 = sc.nextInt();

        if (v1 > v2 && v1 > v3 && v2 > v3) {
            System.out.println("Ordem crescente: " + v3 + "," + v2 + "," + v1);

        } else if (v2 > v1 && v2 > v3 && v1 > v3) {
            System.out.println("Ordem crescente: " + v3 + "," + v1 + "," + v2);

        } else if (v3 > v1 && v3 > v2 && v2 > v1) {
            System.out.println("Ordem crescente: " + v1 + "," + v2 + "," + v3);

        } else if (v1 > v3 && v1 > v2 && v3 > v2) {
            System.out.println("Ordem crescente: " + v2 + "," + v3 + "," + v1);

        } else if (v2 > v3 & v2 > v1 & v3 > v1) {
            System.out.println("Ordem crescente: " + v1 + "," + v3 + "," + v2);

        } else if (v3 > v2 & v3 > v1 & v1 > v2) {
            System.out.println("Ordem crescente: " + v2 + "," + v1 + "," + v3);

        }
    }

    public void exercicio6() {
        System.out.println("Insira seu sexo: 1:feminio/2:masculino");
        double sexo = sc.nextDouble();

        System.out.println("Insira sua altura: (em metros)");
        double altura = sc.nextDouble();

        if (sexo == 2) {
            System.out.println("O seu peso seria de:" + ((72.7 * altura) - 58) + "kg");

        }
        else {
            System.out.println("O seu peso seria de:" + ((62.1 * altura) - 44.7) + "kg");
        } 

    }
    

}
    
