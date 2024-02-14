import java.util.Scanner;


class Ex1 {
    public static void main(String[] args) {
       Scanner Ler = new Scanner(System.in);
       System.out.println("Insira 3 números");
       int a = Ler.nextInt();
       int b = Ler.nextInt();
       int c = Ler.nextInt();

       int discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
            int x1 = (-b + (int)Math.sqrt(discriminante)) / (2 * a);
            int x2 = (-b - (int)Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As raízes são diferentes:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            int x = -b / (2 * a);
            System.out.println("As raízes são iguais:");
            System.out.println("x = " + x);
        } else {
            int parteReal = -b / (2 * a);
            int parteImaginaria = (int)Math.sqrt(-discriminante) / (2 * a);
            System.out.println("As raízes são complexas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

    }
}