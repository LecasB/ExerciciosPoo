import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int numerador = Ler.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = Ler.nextInt();

        try {
            int resultado = divideNumeros(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        }
    }

    public static int divideNumeros(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        return numerador / denominador;
    }
}
