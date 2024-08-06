import java.util.Scanner;

public class Carro {
    private static final int incrementoVel = 10;
    private static boolean ligado = false;
    private static int velocidade = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha;

        do {
            MenuCar();
            escolha = Escolha(input);

            switch (escolha) {
                case 1:
                    LigarCar();
                    break;
                case 2:
                    AcelerarCar();
                    break;
                case 3:
                    FrearCar();
                    break;
                case 4:
                    DesligarCar();
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 4.");
            }

            System.out.println();

        } while (ligado);

        System.out.println("Programa encerrado.");
        input.close();
    }

    private static void MenuCar() {
        System.out.println("* Menu do Carro *");
        System.out.println("1. Ligar o carro");
        System.out.println("2. Acelerar (+10 km/h)");
        System.out.println("3. Frear (-10 km/h)");
        System.out.println("4. Desligar o carro");
        System.out.print("Escolha uma opção: ");
    }

    private static int Escolha(Scanner input) {
        int escolha = 0;
        try {
            escolha = input.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, insira um número.");
            input.next(); // Limpar o scanner
        }
        return escolha;
    }

    private static void LigarCar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    private static void AcelerarCar() {
        if (ligado) {
            velocidade += incrementoVel;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado. Por favor, ligue o carro primeiro.");
        }
    }

    private static void FrearCar() {
        if (ligado) {
            if (velocidade >= incrementoVel) {
                velocidade -= incrementoVel;
            } else {
                velocidade = 0;
            }
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado. Por favor, ligue o carro primeiro.");
        }
    }

    private static void DesligarCar() {
        if (ligado) {
            if (velocidade == 0) {
                ligado = false;
                System.out.println("Carro desligado.");
            } else {
                System.out.println("O carro só pode ser desligado quando a velocidade for 0 km/h.");
            }
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}