package algosolver;

public class SomaIndice {

    // Método que calcula a soma conforme o primeiro exercício
    public static int calcularSoma() {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        // Soma de valores de 1 até o índice
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        return SOMA; // Retorna o valor final da soma
    }
}

