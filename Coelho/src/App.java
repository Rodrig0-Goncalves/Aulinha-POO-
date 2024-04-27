public class App {
    public static void main(String[] args) throws Exception {
       Coelho c1 = new Coelho("Labrado", 8.5);
       System.out.println(c1);

       Coelho c2 = new Coelho("sharpei", 9.8);
       System.out.println(c2);

       Coelho c3 = new Coelho("Pudle", 10.0);
       System.out.println(c3);

       System.out.println(Coelho.getCont());
    }
}
