package EstruturaDecisaoifElse;

import java.util.Scanner;

public class DecisaoifElse {
    Scanner sc = new Scanner(System.in);

    // If desencadeado
    public void decisaoif() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProduto >=100 então desconto =5

        if (precoProduto >= 100) {
            desconto = 5.0;
        }
        if (precoProduto >= 200) {
            desconto = 10.0;
        }

        if (precoProduto >= 300) {
            desconto = 15.0;

        }
        // realizar conta

        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto é $" + precoFinal);
    }

    // If encadeado (if-else)
    public void decisaoifelse() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // Estrutura de decisão encadeada if-else
        if (precoProduto >= 300) {
            desconto = 15.0;
        }

        else if (precoProduto >= 200) {
            desconto = 10.0;
        }

        else if (precoProduto >= 100) {
            desconto = 5;
        }

        else {
            desconto = 0;
        }
        // realizar conta

        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto é $" + precoFinal);
    }

}
