import java.util.Scanner;

public class atividades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exercicio1(scanner);
        exercicio2(scanner);

        scanner.close();
    }

    public static void exercicio1(Scanner scanner) {
        System.out.println("=== EXERCÍCIO 1 ===");
        
        System.out.print("Quantos preços você deseja informar? ");
        int quantidade = scanner.nextInt();
        
        double[] precos = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o preço " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }

        double menor = precos[0];
        double maior = precos[0];
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            if (precos[i] < menor) {
                menor = precos[i];
            }
            if (precos[i] > maior) {
                maior = precos[i];
            }
            soma += precos[i];
        }

        double media = soma / quantidade;

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Menor preço: R$ %.2f\n", menor);
        System.out.printf("Maior preço: R$ %.2f\n", maior);
        System.out.printf("Média dos preços: R$ %.2f\n", media);
    }

    public static void exercicio2(Scanner scanner) {
        System.out.println("\n=== EXERCÍCIO 2 ===");
        
        int[][] alunos = new int[5][2];

        System.out.println("Preencha os dados dos 5 alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Digite o RA: ");
            alunos[i][0] = scanner.nextInt();
            System.out.print("Digite a quantidade de faltas: ");
            alunos[i][1] = scanner.nextInt();
        }

        System.out.println("\n--- RELATÓRIO DE ALUNOS ---");
        for (int i = 0; i < 5; i++) {
            int ra = alunos[i][0];
            int faltas = alunos[i][1];
            String situacao = (faltas > 20) ? "REPROVADO POR FALTAS" : "APROVADO";
            
            System.out.println("RA: " + ra + " | Faltas: " + faltas + " | Situação: " + situacao);
        }
    }
}
