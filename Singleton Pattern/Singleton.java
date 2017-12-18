import java.util.Random;
class Singleton {

    private int UId;
    public int getId(){
        return UId;
    }
    private static Singleton instance;

    private Singleton(){
        UId= (new Random()).nextInt()*100000;
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
