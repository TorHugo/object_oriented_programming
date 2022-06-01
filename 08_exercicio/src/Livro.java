public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPagina;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro {\n" +
                " titulo: '" + titulo + '\'' +
                ",\n autor: '" + autor + '\'' +
                ",\n totalPagina: " + totalPagina +
                ",\n paginaAtual: " + paginaAtual +
                ",\n aberto: " + aberto +
                ",\n leitor: " + leitor.getNome() +
                ",\n idade: " + leitor.getIdade() +
                ",\n sexo: " + leitor.getSexo() +
                "\n}";
    }

    // constructor
    public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;
    }

    // setter and getter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPagina){
            this.paginaAtual = 0;
        } else{
            this.paginaAtual = p;
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
}
