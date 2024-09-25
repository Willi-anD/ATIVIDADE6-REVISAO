import java.util.Scanner;

public class PesquisaDeIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas no grupo: ");
        int tamanhoGrupo = scanner.nextInt();

        int[] idades = new int[tamanhoGrupo];
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int maiorDeIdade = 0;
        int menorDeIdade = 0;

        for (int i = 0; i < tamanhoGrupo; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
            }

            // Contar maiores e menores de idade
            if (idades[i] >= 18) {
                maiorDeIdade++;
            } else {
                menorDeIdade++;
            }
        }

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + maiorDeIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + menorDeIdade);

        scanner.close();
    }
}
