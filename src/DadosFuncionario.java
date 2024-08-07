import java.util.Scanner;

public class DadosFuncionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = input.nextDouble();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        input.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = input.nextLine().charAt(0);

        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Salário: %.2f%n", salario);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Altura: %.2f metros%n", altura);
        System.out.printf("Sexo: %c%n", sexo);

        input.close();
    }
}