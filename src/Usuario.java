import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();


        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        input.nextLine();

        System.out.print("Digite sua profissão: ");
        String profissao = input.nextLine();

        System.out.print("Olá, seu nome é ");
        System.out.println(nome + "!");
        System.out.printf("Você tem %d anos e trabalha como %s.%n", idade, profissao);

        input.close();
    }
}