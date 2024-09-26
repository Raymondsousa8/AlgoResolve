package algosolver;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    public static void analisarFaturamentoDiario() {
        try {
            // Simulação de leitura do JSON
            String jsonData = """
                    [
                      {"dia": 1, "valor": 1000.0},
                      {"dia": 2, "valor": 2500.0},
                      {"dia": 3, "valor": 0.0},
                      {"dia": 4, "valor": 3000.0},
                      {"dia": 5, "valor": 1000.0},
                      {"dia": 6, "valor": 0.0},
                      {"dia": 7, "valor": 3500.0}
                    ]
                    """;

            // Parse o JSON para um JSONArray
            JSONArray faturamentoMensal = new JSONArray(jsonData);

            // Listas para armazenar os valores de faturamento
            List<Double> valoresValidos = new ArrayList<>();

            // Variáveis para armazenar o menor, maior e média
            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;

            // Loop para processar os valores de faturamento
            for (int i = 0; i < faturamentoMensal.length(); i++) {
                JSONObject dia = faturamentoMensal.getJSONObject(i);
                double valor = dia.getDouble("valor");

                // Ignorar dias com faturamento 0
                if (valor > 0) {
                    valoresValidos.add(valor);
                    soma += valor;
                    diasComFaturamento++;

                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                }
            }

            // Cálculo da média mensal
            double media = soma / diasComFaturamento;

            // Contar dias acima da média
            int diasAcimaDaMedia = 0;
            for (double valor : valoresValidos) {
                if (valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibir resultados
            System.out.printf("Menor valor de faturamento: %.2f\n", menorValor);
            System.out.printf("Maior valor de faturamento: %.2f\n", maiorValor);
            System.out.printf("Número de dias com faturamento acima da média: %d\n", diasAcimaDaMedia);

        } catch (Exception e) {
            System.out.println("Erro ao processar o faturamento diário: " + e.getMessage());
        }
    }
}

