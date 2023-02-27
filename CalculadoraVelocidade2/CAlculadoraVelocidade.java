package CalculadoraVelocidade2;

import java.util.Scanner;

public class CAlculadoraVelocidade {

    Scanner sc = new Scanner(System.in);
    
    public void calcular() {
        System.out.println(" Informe a distância percorrida");
        double distânciaPercorrida = sc.nextDouble();
        System.out.println("Informe o tempo gasto");
        double tempoGasto = sc.nextDouble();
        double velocidadeMédia = distânciaPercorrida / tempoGasto;
        System.out.println("A velocidade média é" + velocidadeMédia + "Km/h");
       

    }
    public void destino() {
        System.out.println("Informe o ponte de saída");
        String origem = sc.nextLine();
        System.out.println("Informe o ponto de destino");
        String destino = sc.nextLine();
        System.out.println("Sua viagem é de" + origem + " a " + destino);
    }
}
