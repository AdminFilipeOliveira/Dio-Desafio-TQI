/*
 * Desafio
Neste desafio, você deverá ajudar o gerente de uma loja geek a gerenciar o desempenho de seus funcionários em um determinado período. O gerente pode inserir a média das avaliações de desempenho dos funcionários e o programa irá classificar cada um deles em "APR" (bom), "MED" (médio) ou "REP" (ruim), com base em critérios predefinidos.

Entrada
O programa solicitará ao usuário que insira a média das avaliações de desempenho dos funcionários em um determinado período.

Saída
O programa irá classificar cada funcionário em "APR" (bom), "MED" (médio) ou "REP" (ruim), de acordo com as seguintes regras:

Se a média da avaliação for menor que 5, o funcionário estará reprovado em seu teste e será classificado como "REP";
Se a média da avaliação for menor que 7, mas maior ou igual a 5, o funcionário terá sua avaliação como "MED";
Se a média for maior ou igual a 7, o funcionário está aprovado no teste de desempenho e será classificado como "APR".
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
3	REPROVADO
4.5	REPROVADO
5	MEDIO
6	MEDIO
7	APROVADO
8.5	APROVADO
 */
import java.util.Scanner;

public class LojaGeek {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.println("Digite a média de avaliações dos funcionários de (1 a 10): ");
    double media = scanner.nextDouble();

    //TODO: Verifique a média lida e imprima a avaliação do funcionário.
    String classificacao;

    if (media < 5) {
        classificacao = "REPROVADO";
    } else if (media < 7) {
        classificacao = "MEDIO";
    } else {
        classificacao = "APROVADO";
    }
    //Onde: "APR" é bom, "MED" é médio e "REP" é ruim.
    System.out.println(classificacao);

    scanner.close();
    
  }
  
}