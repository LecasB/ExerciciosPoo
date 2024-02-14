import java.util.Scanner;

class Ex7 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Enter ur phrase: ");
        String frase = Ler.nextLine();
        int size = frase.length();
        int wordCount = frase.split("\\W+").length;
        System.out.println("Tamanho: " + size + " Palavras: " + wordCount);
    }
}


