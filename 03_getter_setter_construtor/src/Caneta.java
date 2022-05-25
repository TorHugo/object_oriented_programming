public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    /* public Caneta(String m, String c, float p) { //metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;

        this.tampar();
    } */

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return this.getModelo();
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.getPonta();
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta: \n");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
