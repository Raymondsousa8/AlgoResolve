# AlgoResolve

Este projeto implementa uma série de algoritmos de resolução de problemas básicos em Java. As funcionalidades incluem cálculos matemáticos, verificação de sequências, análise de faturamento e manipulação de strings.

## Funcionalidades

### 1. Calcular valor final de SOMA (Exercício 1)
Realiza a soma de todos os números de 1 até o valor 13. O código pode ser ajustado para realizar a soma de um intervalo diferente, se necessário.

#### Exemplo:
- **Input**: Nenhum
- **Output**: Soma total dos números de 1 a 13, que resulta em 91.

### 2. Verificar se um número pertence à sequência de Fibonacci (Exercício 2)
Verifica se o número informado pertence à sequência de Fibonacci. A sequência começa com 0, 1 e continua somando os dois números anteriores.

#### Exemplo:
- **Input**: 5
- **Output**: O número 5 pertence à sequência de Fibonacci.

### 3. Análise de faturamento diário (Exercício 3)
Analisa os dados de faturamento diário fornecidos em formato JSON e calcula o menor valor, o maior valor, e o número de dias em que o faturamento foi maior do que a média dos dias válidos (dias com faturamento maior que zero).

#### Exemplo:
- **Input**: JSON simulado de faturamento diário
- **Output**: 
  - Menor valor de faturamento: 1000,00
  - Maior valor de faturamento: 3500,00
  - Número de dias com faturamento acima da média: 3

### 4. Calcular percentual de faturamento por estado (Exercício 4)
Calcula o percentual de representação do faturamento por estado, com base em valores de faturamento previamente definidos para os estados SP, RJ, MG, ES e outros.

#### Exemplo:
- **Input**: Nenhum
- **Output**:
  - SP: 37,53%
  - RJ: 20,29%
  - MG: 16,17%
  - ES: 15,03%
  - Outros: 10,98%

### 5. Inverter uma string (Exercício 5)
Inverte a string fornecida pelo usuário.

#### Exemplo:
- **Input**: "45"
- **Output**: "54"

## Estrutura do Projeto

O projeto está dividido nas seguintes classes:

- **Main.java**: Classe principal que exibe o menu de opções e chama os métodos de acordo com a escolha do usuário.
- **SomaIndice.java**: Realiza o cálculo da soma de números de 1 até um valor específico (13 neste caso).
- **Fibonacci.java**: Verifica se um número pertence à sequência de Fibonacci.
- **Faturamento.java**: Analisa o faturamento diário a partir de dados JSON simulados.
- **PercentualFaturamento.java**: Calcula o percentual de faturamento por estado.
- **InverterString.java**: Realiza a inversão de uma string fornecida pelo usuário.

## Como Executar

1. Clone este repositório.
2. Certifique-se de que você tem o Java JDK instalado (versão 17 ou superior).
3. Navegue até o diretório raiz do projeto.
4. Compile o projeto com o comando:
   ```bash
   javac -d bin src/algosolver/*.java
5.   Execute o projeto com o comando:
java -cp bin algosolver.Main

6.Escolha a operação desejada no menu e siga as instruções.
Dependências
Este projeto utiliza a biblioteca org.json para manipulação de dados JSON. Para incluí-la, adicione a seguinte dependência ao seu pom.xml (caso esteja utilizando Maven):

xml
Copiar código
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20220320</version>
</dependency>


