package statics;

/**
 * Created by Maxim on 31.10.2016.
 */
public class FinallyWorking {

    static void procA(){
        try{
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("procA's finally");
        }
    }

    static void procB(){
        try {
            System.out.println("Inside procB");
            return;
        }finally {
            System.out.println("procB's finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){}
        procB();
    }
}
