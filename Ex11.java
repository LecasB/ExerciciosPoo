import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            if (i == 0 || i == palavras.length - 1) {
                sb.append(palavra).append(" ");
            } else {
                sb.append(palavra.charAt(0)).append(". ");
            }
        }
        System.out.println("Nome abreviado: " + sb.toString().trim());
    }
}
