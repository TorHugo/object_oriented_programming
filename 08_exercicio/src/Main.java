public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Victor", "M", 18);
        p[1] = new Pessoa("Hugo", "M", 22);


        l[0] = new Livro("Livro1", "Autor1", 180, p[0]);
        l[1] = new Livro("Livro2", "Autor2", 350, p[1]);
        l[2] = new Livro("Livro3", "Autor3", 620, p[0]);

        l[0].abrir();
        l[0].folhear(150);
        l[0].avancarPagina();

        System.out.println(l[0].detalhes());
    }
}
