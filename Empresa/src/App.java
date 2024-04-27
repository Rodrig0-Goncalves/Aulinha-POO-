public class App {
    public static void main(String[] args) throws Exception {
        Funcionario pessoa1 = new Funcionario("Rodrigo", "Rodrigo.silva@gmail", 1200.0, 6);
        System.out.println(pessoa1);

        Funcionario pessoa2 = new Funcionario("Amigo do Rodrigo", "AmigoRodrigo@gmail.com", 1200.0, 8);
        System.out.println(pessoa2);

        Diretor diretor1 = new Diretor("Leonardo", "Leo@gmail.com", 5000, 8, 1);
        System.out.println(diretor1);

        Diretor diretor2 = new Diretor("Pai do Leonardo", "PaiLeo@gmail.com", 5000*2, 9, 2);
        System.out.println(diretor2);
    }
}