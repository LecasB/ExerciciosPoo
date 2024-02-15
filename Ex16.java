import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        // Criar uma lista para armazenar os utentes
        List<Utente> utentes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        // Menu
        int opcao;
        do {
            System.out.println("1. Adicionar um novo utente");
            System.out.println("2. Listar todos os utentes");
            System.out.println("3. Listar todos os alunos");
            System.out.println("4. Pesquisar um utente pelo nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Tipo (1 - Aluno, 2 - Professor, 3 - Funcionário): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    switch (tipo) {
                        case 1:
                            System.out.print("Número Interno: ");
                            int numeroInterno = scanner.nextInt();
                            System.out.print("Ano da Matrícula: ");
                            int anoMatricula = scanner.nextInt();
                            utentes.add(new Aluno(nome, idade, numeroInterno, anoMatricula));
                            break;
                        case 2:
                            System.out.print("Categoria: ");
                            String categoria = scanner.nextLine();
                            System.out.print("Número do Gabinete: ");
                            int numeroGabinete = scanner.nextInt();
                            utentes.add(new Professor(nome, idade, categoria, numeroGabinete));
                            break;
                        case 3:
                            System.out.print("Secção: ");
                            String secção = scanner.nextLine();
                            System.out.print("Cargo: ");
                            String cargo = scanner.nextLine();
                            utentes.add(new Funcionario(nome, idade, secção, cargo));
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de todos os utentes:");
                    for (Utente utente : utentes) {
                        System.out.println(utente);
                    }
                    break;
                case 3:
                    System.out.println("Lista de todos os alunos:");
                    for (Utente utente : utentes) {
                        if (utente instanceof Aluno) {
                            System.out.println(utente);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Pesquisar utente por nome: ");
                    String nomePesquisar = scanner.nextLine();
                    for (Utente utente : utentes) {
                        if (utente.getNome().equals(nomePesquisar)) {
                            System.out.println(utente);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}

// Classe base para todos os utentes
class Utente {
    private String nome;
    private int idade;

    public Utente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

// Classe para representar alunos
class Aluno extends Utente {
    private int numeroInterno;
    private int anoMatricula;

    public Aluno(String nome, int idade, int numeroInterno, int anoMatricula) {
        super(nome, idade);
        this.numeroInterno = numeroInterno;
        this.anoMatricula = anoMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Aluno, Número Interno: " + numeroInterno + ", Ano da Matrícula: " + anoMatricula;
    }
}

// Classe para representar professores
class Professor extends Utente {
    private String categoria;
    private int numeroGabinete;

    public Professor(String nome, int idade, String categoria, int numeroGabinete) {
        super(nome, idade);
        this.categoria = categoria;
        this.numeroGabinete = numeroGabinete;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Professor, Categoria: " + categoria + ", Número do Gabinete: " + numeroGabinete;
    }
}

// Classe para representar funcionários
class Funcionario extends Utente {
    private String secção;
    private String cargo;

    public Funcionario(String nome, int idade, String secção, String cargo) {
        super(nome, idade);
        this.secção = secção;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Funcionário, Secção: " + secção + ", Cargo: " + cargo;
    }
}
