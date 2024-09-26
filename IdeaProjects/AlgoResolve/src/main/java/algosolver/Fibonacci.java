package algosolver;

public class Fibonacci {

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificarSePertence(int numero) {
        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0, b = 1;

        // Se o número é 0 ou 1, ele já pertence à sequência
        if (numero == a || numero == b) {
            return true;
        }

        // Calcula a sequência de Fibonacci até encontrar o número ou passar dele
        int proximo = a + b;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }

        // Se não encontrou o número, ele não pertence à sequência
        return false;
    }
}

