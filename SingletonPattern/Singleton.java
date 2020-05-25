public class Singleton {
    public static void main(String [] args) {
        ChocolateBoiler c1 = ChocolateBoiler.getInstance();
        c1.fill();
        c1.boil();
        c1.drain();
    }
}
