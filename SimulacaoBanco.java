package DESAFIOS;

import java.util.Scanner;

public class SimulacaoBanco {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Scanner operadores = new Scanner(System.in);

        System.out.println("Qual seu nome completo?");
        String nome = dados.nextLine();

        System.out.println("Qual o tipo da sua conta?");
        String tipoDeConta = dados.nextLine();

        System.out.println("Quanto de dinheiro tem em sua conta " + tipoDeConta + "?");
        double saldo = dados.nextDouble();

        String sb = "Verifique se suas informações estão corretas: \n" +
                "\n" +
                "*********************** \n" +
                "Dados iniciais do cliente: \n" +
                "\n" +
                "Nome: " + nome + "\n" +
                "Tipo de conta: " + tipoDeConta + "\n" +
                "Saldo inicial: R$" + saldo + "\n" +
                "***********************";
        System.out.println(sb);

        System.out.println("Suas informações estão corretas?");
        boolean correto = true;
        String resposta = dados.next();

        if (correto == resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("ss") || resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Parabéns, suas informações foram confirmadas com sucesso! \n");
        } else {
            boolean b = correto = false;

            System.out.println("Por favor, especifique o que está incorreto: ");
            dados.nextLine();
            String problema = dados.nextLine();
            System.out.println("Obrigado por informar. Entraremos em contato em breve para resolver seu problema com '" + problema + "'.");
        }

        int numero = 0;
        if (correto) {
            while (numero != 4) {
                String g = "Operaçoes \n" +
                        "\n" +
                        "1- Consultar saldo \n" +
                        "2- Receber valor \n" +
                        "3- Transferir valor \n" +
                        "4- Sair";
                System.out.println(g + "\n");
                System.out.println("Digite a opção desejada:");
                numero = operadores.nextInt();

                switch (numero) {

                    case 1:
                        System.out.println(" Seu saldo atual é de " + saldo + "\n \n");
                         break;

                    case 2:
                        System.out.println("Qual o valor que você gostaria de receber? ");
                        double receber = operadores.nextDouble();
                        saldo += receber;
                        System.out.println( "Seu saldo atual é de R$" + saldo + "\n \n");
                        break;

                    case 3:
                        System.out.println("Qual o valor da quantia que você gostaria de transferir?");
                        double transferir = operadores.nextDouble();
                        saldo -= transferir;
                        System.out.println("Seu saldo atual é de R$" + saldo + "\n \n");
                    if (transferir > saldo) {
                        System.out.println("Erro: o valor a ser transferido excede o saldo disponível na conta.");
                        break;
                    }

                    case 4:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;

                }
            }
        }
    }
}