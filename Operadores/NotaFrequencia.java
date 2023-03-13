package Operadores;

import java.util.Scanner;

public class NotaFrequencia {

    Scanner sc = new Scanner(System.in);

    public void exercicio7() {
        System.out.println("Informe a nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno:");
        int nota2 = sc.nextInt();
        // Operação Aritimética
        double média = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é" + média);
        boolean mediaAprovada = média >= 50;
        System.out.println("O aluno está aprovado por nota:" + mediaAprovada);
        System.out.println("Informe a frequência do aluno:");
        int frequência = sc.nextInt();
        boolean frequênciaAprovada = frequência >= 75;
        System.out.println("O aluno está aprovado por frequência:" + frequênciaAprovada);
        boolean resultadoFinal = (mediaAprovada == true) || (frequênciaAprovada == true);
        System.out.println("O aluno está aprovado no curso?" +resultadoFinal);
    }
}
