package DESAFIOS.Loja;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produtos> listaDeProdutos = new LinkedList<>();

        System.out.println("Digite o limite do seu cartão: ");
        int informacaoDoCartao = scanner.nextInt();
        scanner.nextLine();

        int totalPago = 0;
        StringBuilder produtosComprados = new StringBuilder();

        while (true) {
            System.out.println("Digite o nome do produto que você gostaria de comprar ou 'sair' para encerrar: ");
            String produto = scanner.nextLine();
            if (produto.equals("sair")) {
                break;
            }

            System.out.println("Digite o valor que você gostaria de pagar por " + produto);
            int dinheiroPago = scanner.nextInt();
            scanner.nextLine();

            if (totalPago + dinheiroPago > informacaoDoCartao) {
                System.out.println("Saldo insuficiente!");
                break;
            }

            Produtos novoProduto = new Produtos(produto);
            novoProduto.setValoresPagos(dinheiroPago);

            listaDeProdutos.add(novoProduto);
            totalPago += dinheiroPago;

            produtosComprados.append("- ").append(novoProduto.getNomeDoProduto()).append(" - ").append(novoProduto.getValoresPagos()).append("\n");

            System.out.println("Compra realizada!");
        }

        System.out.println("COMPRAS REALIZADAS:");
        listaDeProdutos.sort((Comparator.comparing(Produtos::getValoresPagos)));
        System.out.println(produtosComprados);
        System.out.println("Total pago: " + totalPago);
    }
}