public class Driver{

    public static void main(String[] args) {

        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println("My Unique Identifier is "+a.getId());
        System.out.println("My Unique Identifier is also "+b.getId()+" because I'm the same instance");
    }
}
