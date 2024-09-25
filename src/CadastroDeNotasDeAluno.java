import java.util.Scanner;

public class CadastroDeNotasDeAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        double[] notas = new double[quantidadeAlunos];
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        double somaNotas = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                i--; // Decrementa i para repetir a entrada do aluno
                continue; // Volta ao início do loop
            }

            notas[i] = nota;
            somaNotas += nota;

            if (nota >= 6) {
                alunosAprovados++;
            } else {
                alunosReprovados++;
            }
        }

        double media = somaNotas / quantidadeAlunos;
        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        System.out.println("Quantidade de alunos reprovados: " + alunosReprovados);

        scanner.close();
    }
}