public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Victor");
        p2.setNome("Joelma");
        p3.setNome("Joao");
        p4.setNome("Gabriel");

        p2.setCurso("Informatica.");
        p3.setSalario(2500.50f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
