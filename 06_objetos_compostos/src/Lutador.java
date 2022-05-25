import jdk.swing.interop.SwingInterOpUtils;

public class Lutador implements Luta{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // construtor

    public Lutador(String nome,
                   String nacionalidade,
                   int idade,
                   float altura,
                   float peso,
                   int vitorias,
                   int derrotas,
                   int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // getter & setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    //

    @Override
    public void apresentar() {
        System.out.println("----- APRESENTAÇÃO -----");
        System.out.println("LUTADOR: " + this.getNome());
        System.out.println("ORIGEM: " + this.getNacionalidade());
        System.out.println("IDADE: " + this.getIdade());
        System.out.println("ALTURA: " + this.getAltura());
        System.out.println("PESO: " + this.getPeso());
        System.out.println("VITÓRIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("----- STATUS -----");
        System.out.println("NOME: " + this.getNome());
        System.out.println("CATEGORIA: " + this.getCategoria());
        System.out.println("VITÓRIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
