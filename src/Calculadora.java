import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        String  operacao = "";
        int control=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = input.nextLine();

        System.out.println("Digite um valor: ");
        numero1 = input.nextInt();

        System.out.println("Digite um valor: ");
        numero2 = input.nextInt();

        if(operacao.equals("+")) {
            System.out.println("A soma é: " +(numero1 + numero2));
            control++;
        }

        if(operacao.equals("-")) {
            System.out.println("A subtração é: " +(numero1 - numero2));
            control++;
        }

        if(operacao.equals("*")) {
            System.out.println("A multiplicação é: " +(numero1 * numero2));
            control++;
        }

        if(operacao.equals("/")) {
            System.out.println("A divisão é: " +(numero1 / numero2));
            control++;
        }

        if(control == 0) {
            System.out.println("Operação inválida. Por favor, tente novamente!");

        }
        System.out.println("Calculadora encerrada.");
        input.close();
    }
}