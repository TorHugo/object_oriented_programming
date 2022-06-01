public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setMatricula(111);
        a1.setCurso("Programação");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(222);
        b1.setNome("Victor");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
