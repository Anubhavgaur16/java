import java.util.Random;

public class Rvariable {
    public static void main(String[] args) {
        
        Random random = new Random();

        boolean isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.err.println("TAILS");
        }
    }
}
