public class Animal {
    protected int velocidadeMaxima;
    protected int velocidadeMedia;
    protected int sexo;
    protected final int FEMININO = 0;
    protected final int MASCULINO = 1;

    public Animal(int sex, int vmax, int vmed) {
        sexo = sex;
        velocidadeMaxima = vmax;
        velocidadeMedia = vmed;
    }
}

public class Vertebrado extends Animal {
    private int numeroVertebras;

    public Vertebrado(int sex, int vmax, int vmed) {
        super(sex, vmax, vmed);
    }

    public Vertebrado(int sex, int vmax, int vmed, int nVer) {
        super(sex, vmax, vmed);
        numeroVertebras = nVer;
    }

    public String toString() {
        String genero = (sexo == FEMININO) ? "feminino" : "masculino";
        return "Vertebrado do sexo " + genero + " com velocidade máxima de " + velocidadeMaxima + " km/h, velocidade média de " + velocidadeMedia + " km/h, e " + numeroVertebras + " vértebras.";
    }
}
