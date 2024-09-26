package algosolver;

import java.util.HashMap;
import java.util.Map;

public class PercentualFaturamento {

    public static void calcularPercentual() {
        // Valores de faturamento por estado usando um Map
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Cálculo do faturamento total
        double total = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        // Exibe os percentuais de cada estado
        System.out.println("Percentual de representação de faturamento por estado:");
        faturamentoPorEstado.forEach((estado, valor) ->
                System.out.printf("%s: %.2f%%\n", estado, (valor / total) * 100));
    }
}

