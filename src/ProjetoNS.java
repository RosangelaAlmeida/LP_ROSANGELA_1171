import java.util.Scanner;

public class ProjetoNS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano atual da missão (max 9999): ");
        short ano = input.nextShort();
        System.out.print("Digite a quantidade de funcionários envolvidos (max 100): ");
        byte funcionarios = input.nextByte();


        System.out.print("Digite a distância que o satélite ficará da terra (max 2 milhões): ");
        int distanciaSat = input.nextInt();
        System.out.print("Digite a velocidade máxima (max 30.000 km/h): ");
        int velocidadeMax = input.nextInt();


        System.out.print("A missão já iniciou? (Verdadeiro/falso): ");
        boolean missaoIniciada = input.nextBoolean();
        System.out.print("Digite a distância que será percorrida durante a missão em km (max 3 bilhões): ");
        long distanciaMissao = input.nextLong();
        System.out.print("Digite a calibragem das antenas (precisão mínima de 14 casas decimais): ");
        double calibragemAntenas = input.nextDouble();

        input.close();

        System.out.println("\nValores capturados:");
        System.out.printf("Ano da missão: %d%n", ano);
        System.out.printf("Quantidade de funcionários: %d%n", funcionarios);
        System.out.printf("Distância do satélite da Terra: %d km%n", distanciaSat);
        System.out.printf("Velocidade máxima: %d km/h%n", velocidadeMax);
        System.out.printf("Missão iniciada: %b%n", missaoIniciada);
        System.out.printf("Distância percorrida na missão: %d km%n", distanciaMissao);
        System.out.printf("Calibragem das antenas: %.14f%n", calibragemAntenas);
    }
}