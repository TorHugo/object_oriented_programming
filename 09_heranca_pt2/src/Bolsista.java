public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada.");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + "é bolsista.");
    }

    //getter and setter

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
