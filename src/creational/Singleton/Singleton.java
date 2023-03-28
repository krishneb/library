package creational.Singleton;

public class Singleton {
    private static Singleton get_instances = null;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if(get_instances == null) {
            synchronized (Singleton.class) {
                //Double-checking in Singleton
                if(get_instances == null) {
                    get_instances = new Singleton();
                }
            }
        }
        return get_instances;
    }

    public static void main(String args[]) {
        Singleton x1 = Singleton.getInstance();
        Singleton x2 = Singleton.getInstance();
        Singleton x3 = Singleton.getInstance();

        int x1Hash = x1.hashCode();
        int x2Hash = x2.hashCode();
        int x3Hash = x3.hashCode();

        if(x1Hash  == x3Hash) {
            System.out.println("Both the hashcodes are same");
        }

        if(x1Hash  == x2Hash) {
            System.out.println("Both the hashcodes are same");
        }
    }
}
