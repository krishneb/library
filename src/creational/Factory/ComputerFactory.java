package creational.Factory;

public class ComputerFactory {

    //We can keep Factory class Singleton, or we can keep the method that returns the subclass as static.
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);

        return null;
    }

    public static void main(String args[]) {
        //Notice that based on the input parameter, different subclass is created and returned.
        //getComputer is the factory method.
        Computer cp = ComputerFactory.getComputer("Server","8","1000","2.1");
        System.out.println("Server details : " + cp.toString());
    }
}
