import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Insira 3 números");
        int a = Ler.nextInt();
        int b = Ler.nextInt();
        int c = Ler.nextInt();

        Ex3 Fixe = new Ex3();
        System.out.println("Max: " + Fixe.max(a, b, c));
        System.out.println("Min: " + Fixe.min(a, b, c));
        System.out.println("Soma: " + Fixe.soma(a, b, c));
        System.out.println("Media: " + Fixe.media(a, b, c));
    }

    public int max(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    public int min(int a, int b, int c) {
        int min = 0;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }

    public int soma(int a, int b,int c){
        int soma = a + b + c;
        return soma;
    }

    public double media(int a,int b, int c){
        double media = (a + b + c)/3;
        return media;
    }
}
