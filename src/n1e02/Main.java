package n1e02;

public class Main {

    public static void main(String[] args){
        Object myObj = null;
        try{
            myObj.toString();
        }catch (Exception e){
            System.out.println("Exception caught. Type: " + e.getClass().getName());
        }
    }
}
