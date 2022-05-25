public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Victor Arruda");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Hugo Jesus");
        p2.abrirConta("CP");
        p2.pagarMensal();

        //depositos
        p1.depositar(250);
        p2.depositar(500);
        p2.sacar(100);

        // fechar conta
        p1.sacar(300);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
