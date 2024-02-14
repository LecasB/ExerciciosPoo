import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Insira  Altura e Largura - Parede");
        float alturaParede = Ler.nextFloat();
        float larguraParede = Ler.nextFloat();
        System.out.print("Insira  Altura e Largura - Janela");
        float alturaJanela = Ler.nextFloat();
        float larguraJanela = Ler.nextFloat();
        System.out.print("Insira  Altura e Largura - Porta");
        float alturaPorta = Ler.nextFloat();
        float larguraPorta = Ler.nextFloat();
        System.out.print("Insira Tinta");
        float quantTinta = Ler.nextFloat();

        float Parede = alturaParede * larguraParede;
        float Janela = alturaJanela * larguraJanela;
        float Porta = alturaPorta * larguraPorta;

        float Area = Parede+Janela+Porta;

        if (Area > quantTinta*20) 
        System.out.println("Area: " + Area + "Tinta: Nao Suficiente");
        else
        System.out.println("Area: " + Area + "Tinta: Suficiente");


    }
}