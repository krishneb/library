package creational.Singleton;

public class CloningSingleton {
    private static CloningSingleton get_instances = null;

    private CloningSingleton() {

    }

    private static CloningSingleton getInstance() {
        if (get_instances == null) {
            get_instances = new CloningSingleton();
        }
        return get_instances;
    }

    @Override
    //How to stop cloning
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String args[]) {
        CloningSingleton x1 = CloningSingleton.getInstance();
        CloningSingleton x2 = null;
        try {
            x2 = (CloningSingleton)get_instances.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Hashcode of object1 - " + x1.hashCode());
        System.out.println("Hashcode of object2 - " + x2.hashCode());

    }

}