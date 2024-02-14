import java.util.Scanner;

class Ex9 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Introduza a frase: ");
        String frase = Ler.nextLine();
        System.out.print("Introduza o caracter que quer substituir: ");
        char oldChar = Ler.nextLine().charAt(0);
        System.out.print("Digita o caracter que vai substituir ");
        char newChar = Ler.nextLine().charAt(0);

        String novaFrase = frase.replace(oldChar, newChar);

        System.out.println("A nova frase é: " + novaFrase);
    }
}
