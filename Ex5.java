import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Insira as horas e o valor ");
        int horasTrab = Ler.nextInt();
        float valorHora = Ler.nextFloat();
        float salarioTotal = horasTrab * valorHora;

        double IRS = salarioTotal*0.23;
        double SegSoc = salarioTotal*0.11;

        System.out.println("Salario Bruto: " + salarioTotal + " IRS: " + IRS + " Seguranca Social: " + SegSoc + " Salario Liquido: " + (salarioTotal - IRS - SegSoc));
    }
}