import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split("\\s+");

        for (String palavra : palavras) {
            if (palavra.toLowerCase().replaceAll("[^a]", "").length() > 1) {
                System.out.print(palavra + " ");
            }
        }
    }
}
