public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];

        l[0] = new Lutador("Victor", "Brasileiro", 18,
                1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Joao", "Brasileiro", 22,
                1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Vagner", "Brasileiro", 24,
                1.88f, 95.8f, 5, 1, 8);
        l[3] = new Lutador("Willian", "Brasileiro", 26,
                1.88f, 95.8f, 7, 5, 2);


        Luta uec01 = new Luta();
        uec01.marcarLuta(l[0], l[1]);
        uec01.lutar();
        l[0].status();
        l[1].status();

    }
}
