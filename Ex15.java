import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Autor {
    private String nome;
    private String morada;

    public Autor(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}

class Livro {
    private String isbn;
    private String titulo;
    private int anoEdicao;
    private Autor autor;

    public Livro(String isbn, String titulo, int anoEdicao, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoEdicao = anoEdicao;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public Autor getAutor() {
        return autor;
    }
}

class GereLivro {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String isbn) {
        Livro livroParaRemover = null;
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                livroParaRemover = livro;
                break;
            }
        }
        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Ano de Edição: " + livro.getAnoEdicao());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Morada do Autor: " + livro.getAutor().getMorada());
            System.out.println();
        }
    }

    public void ordenarPorAnoEdicao() {
        Collections.sort(livros, new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getAnoEdicao() - l2.getAnoEdicao();
            }
        });
    }

    public void ordenarPorTitulo() {
        Collections.sort(livros, new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getTitulo().compareTo(l2.getTitulo());
            }
        });
    }

    public Livro buscarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }
}

class Biblioteca {
    private GereLivro gereLivro = new GereLivro();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarLivro() {
        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.nextLine();
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o ano de edição do livro:");
        int anoEdicao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do autor do livro:");
        String nomeAutor = scanner.nextLine();
        System.out.println("Digite a morada do autor do livro:");
        String moradaAutor = scanner.nextLine();
        Autor autor = new Autor(nomeAutor, moradaAutor);
        Livro livro = new Livro(isbn, titulo, anoEdicao, autor);
        gereLivro.adicionarLivro(livro);
    }

    public void verDadosLivro() {
        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.nextLine();
        Livro livro = gereLivro.buscarLivro(isbn);
        if (livro != null) {
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Ano de Edição: " + livro.getAnoEdicao());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Morada do Autor: " + livro.getAutor().getMorada());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void eliminarLivro() {
        System.out.println("Digite o ISBN do livro que deseja remover:");
        String isbn = scanner.nextLine();
        gereLivro.removerLivro(isbn);
    }

    public void listarLivros() {
        gereLivro.listarLivros();
    }

    public void ordenarPorAnoEdicao() {
        gereLivro.ordenarPorAnoEdicao();
    }

    public void ordenarPorTitulo() {
        gereLivro.ordenarPorTitulo();
    }

    public void iniciar() {
        boolean executando = true;
        while (executando) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Ver dados de um livro");
            System.out.println("3 - Eliminar livro");
            System.out.println("4 - Listar todos os livros");
            System.out.println("5 - Ordenar livros por ano de edição");
            System.out.println("6 - Ordenar livros por título");
            System.out.println("7 - Sair do programa");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    verDadosLivro();
                    break;
                case 3:
                    eliminarLivro();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    ordenarPorAnoEdicao();
                    break;
                case 6:
                    ordenarPorTitulo();
                    break;
                case 7:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.iniciar();
    }
}
