public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;

    public void fazerAniversario(){
        this.idade++;
    }

    public Pessoa(String n, String s, int i) {
        this.nome = n;
        this.sexo = s;
        this.idade = i;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
