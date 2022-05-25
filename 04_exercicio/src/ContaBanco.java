public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // metodos
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.isStatus());
    }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){ // .equals = "=="
            this.setSaldo(50);
        } else if (t.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta.");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0 ){
            System.out.println("Conta com saldo.");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta com débito.");
        } else {
            System.out.println("Conta fechada.");
        }
    }
    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso. \nDONO: " + this.getDono());
        } else{
            System.out.println("Não foi possivel fazer o depósito.");
        }
    }
    public void sacar(float v){
        if(this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado. \nDONO: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta inativa.");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo().equals("CC")){
            v =  12;
        } else if (this.getTipo().equals("CP")){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso. \nDONO: " + this.getDono());
        } else {
            System.out.println("Conta inativa.");
        }
    }

    //construtor
    public ContaBanco() {
       this.saldo = 0;
       this.status = false;
    }

    // numero da conta
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    // dono da conta
    public String getDono() {
        return dono;
    }
    public void setDono(String setDono) {
        this.dono = setDono;
    }

    // tipo
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // status

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    // saldo

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
