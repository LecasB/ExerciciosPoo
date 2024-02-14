import java.util.Scanner;

class Ex8 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Introduza a frase: ");
        String frase = Ler.nextLine();
        System.out.print("Introduza a Palavra: ");
        String palavra = Ler.nextLine();

        int contador = 0;
        int index = frase.indexOf(palavra);

        while (index != -1) {
            contador++;
            index = frase.indexOf(palavra, index + 1);
        }

        System.out.println("A palavra '" + palavra + "' aparece " + contador + " vezes na frase.");
    }
}
