package algosolver;

import java.util.Scanner;

public class InverterString {
    public static String inverter(String texto) {
        StringBuilder invertida = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida.append(texto.charAt(i));  // Constrói a string invertida de forma eficiente
        }
        return invertida.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");  // Entrada fornecida pelo usuário
        String texto = scanner.nextLine();

        String resultado = inverter(texto);  // Chama a função de inversão
        System.out.println("String invertida: " + resultado);  // Exibe o resultado

        scanner.close();
    }
}
