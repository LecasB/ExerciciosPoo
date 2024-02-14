import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Entre com as notas dos dois trabalhos e dos dois projetos:");
        double trabalho1 = Ler.nextDouble();
        double trabalho2 = Ler.nextDouble();
        double projeto1 = Ler.nextDouble();
        double projeto2 = Ler.nextDouble();

        trabalho1 = trabalho1 * 0.15;
        trabalho2 = trabalho2 * 0.15;
        projeto1 = projeto1 * 0.35;
        projeto2 = projeto2 * 0.35;
        double notafinal = trabalho1 + trabalho2 + projeto1 + projeto2;

        System.out.println("A nota final é " + notafinal);
    }
}
