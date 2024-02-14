import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = Ler.nextLine();

        System.out.print("Digite o caractere para a primeira letra da palavra: ");
        char caracter = Ler.next().charAt(0);

        System.out.print("Digite a posição da palavra: ");
        int posicao = Ler.nextInt();

        try {
            String palavraSelecionada = obterPalavra(frase, posicao, caracter);
            System.out.println("Palavra selecionada: " + palavraSelecionada);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String obterPalavra(String frase, int posicao, char caracter) throws IllegalArgumentException {
        String[] palavras = frase.split(" ");
        if (posicao < 1 || posicao > palavras.length) {
            throw new IllegalArgumentException("A posição excede o tamanho da frase.");
        }

        String palavra = palavras[posicao - 1];
        if (palavra.charAt(0) != caracter) {
            throw new IllegalArgumentException("Palavra inexistente nessa posição.");
        }

        return palavra;
    }
}
