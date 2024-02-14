import java.util.Scanner;

class Ex4 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int nota = Ler.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Insuficiente");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                System.out.println("Suficiente");
                break;
            case 14:
            case 15:
            case 16:
                System.out.println("Bom");
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Muito Bom");
                break;
            default:
                System.out.println("Nota inválida");
        }
    }
}
