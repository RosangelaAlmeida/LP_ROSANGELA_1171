import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha a figura geométrica para calcular a área:");
            System.out.println("1. Retângulo");
            System.out.println("2. Triângulo");
            System.out.println("3. Círculo");
            System.out.println("4. Trapézio");
            System.out.println("5. Sair");
            System.out.print("Digite a sua escolha: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    calcularAreaRetangulo(input);
                    break;
                case 2:
                    calcularAreaTriangulo(input);
                    break;
                case 3:
                    calcularAreaCirculo(input);
                    break;
                case 4:
                    calcularAreaTrapezio(input);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 5.");
            }
            System.out.println();
        } while (escolha != 5);

        input.close();
    }

    private static void calcularAreaRetangulo(Scanner input) {
        System.out.print("Digite a largura do retângulo: ");
        double largura = input.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = input.nextDouble();
        double area = largura * altura;
        System.out.printf("A área do retângulo é: %.2f%n", area);
    }

    private static void calcularAreaTriangulo(Scanner input) {
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo é: %.2f%n", area);
    }

    private static void calcularAreaCirculo(Scanner input) {
        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.2f%n", area);
    }

    private static void calcularAreaTrapezio(Scanner input) {
        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = input.nextDouble();
        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = input.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        double altura = input.nextDouble();
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.printf("A área do trapézio é: %.2f%n", area);
    }
}