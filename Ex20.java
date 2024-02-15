public class Vertebrado {
    private int numeroVertebras;
    private double velocidadeMaxima;
    private double velocidadeMedia;

    public Vertebrado(int numeroVertebras, double velocidadeMaxima, double velocidadeMedia) {
        this.numeroVertebras = numeroVertebras;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getNumeroVertebras() {
        return numeroVertebras;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Vertebrado do sexo " + (this.getNumeroVertebras() % 2 == 0 ? "feminino" : "masculino") + " com "
                + this.getNumeroVertebras() + " vértebras.";
    }
}

public class Mamifero extends Vertebrado {
    private boolean podeAmamentar;

    public Mamifero(int numeroVertebras, double velocidadeMaxima, double velocidadeMedia, boolean podeAmamentar) {
        super(numeroVertebras, velocidadeMaxima, velocidadeMedia);
        this.podeAmamentar = podeAmamentar;
    }

    public boolean isPodeAmamentar() {
        return podeAmamentar;
    }

    public void setPodeAmamentar(boolean podeAmamentar) {
        this.podeAmamentar = podeAmamentar;
    }

    @Override
    public String toString() {
        return "Mamífero do sexo " + (this.getNumeroVertebras() % 2 == 0 ? "feminino" : "masculino") + " com "
                + this.getNumeroVertebras() + " vértebras. " + (this.isPodeAmamentar() ? "Pode" : "Não pode")
                + " amamentar";
    }
}

public class Taxonomia {
    public static void main(String[] args) {
        Mamifero m = new Mamifero(20, 40.0, 20.0, true);
        System.out.println(m);
    }
}
