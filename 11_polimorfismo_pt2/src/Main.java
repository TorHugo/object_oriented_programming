public class Main {
    public static void main(String[] args) {
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();

        lobo.emitirSom();
        cachorro.emitirSom();

        cachorro.reagir("Olá");
        cachorro.reagir(true);
        cachorro.reagir(6, 20.5f);
        cachorro.reagir(8,30);
    }
}
