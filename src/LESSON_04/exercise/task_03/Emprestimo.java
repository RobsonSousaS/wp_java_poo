package LESSON_04.exercise.task_03;

public class Emprestimo {
    private Pessoa nome;
    private Livro titulo;

    
    public Emprestimo(Pessoa nome, Livro titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public Livro getTitulo() {
        return titulo;
    }

    public void setTitulo(Livro titulo) {
        this.titulo = titulo;
    }

    public Pessoa getNome() {
        return nome;
    }

    public void setNome(Pessoa nome) {
        this.nome = nome;
    }

}
