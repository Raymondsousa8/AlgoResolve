package algosolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Escolha a operação que deseja realizar:");
            System.out.println("1. Calcular valor final de SOMA (Exercício 1)");
            System.out.println("2. Verificar se número pertence à sequência de Fibonacci (Exercício 2)");
            System.out.println("3. Análise de faturamento diário (Exercício 3)");
            System.out.println("4. Calcular percentual de faturamento por estado (Exercício 4)");
            System.out.println("5. Inverter uma string (Exercício 5)");
            System.out.println("0. Sair");
            System.out.print("Digite sua escolha: ");

            // Verifica se a entrada é válida
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha pendente

                switch (opcao) {
                    case 1:
                        int somaFinal = SomaIndice.calcularSoma();
                        System.out.println("Valor final de SOMA: " + somaFinal);
                        break;

                    case 2:
                        System.out.print("Informe um número: ");
                        if (scanner.hasNextInt()) {
                            int numero = scanner.nextInt();
                            boolean pertence = Fibonacci.verificarSePertence(numero);
                            if (pertence) {
                                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                            } else {
                                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor, informe um número inteiro.");
                            scanner.next(); // Limpa a entrada inválida
                        }
                        break;

                    case 3:
                        Faturamento.analisarFaturamentoDiario();
                        break;

                    case 4:
                        PercentualFaturamento.calcularPercentual();
                        break;

                    case 5:
                        System.out.print("Informe uma string: ");
                        String input = scanner.nextLine();
                        String invertida = InverterString.inverter(input);
                        System.out.println("String invertida: " + invertida);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        // Fecha o Scanner ao final da execução
        scanner.close();
    }
}
