public class Variables {
    public static void main(String[] args) {
        int age = 2;
        double price = 19.99;
        char currency = '$';
        boolean isStudent = false;

        System.out.println("I am " + age + " years old.");
        System.out.println(price);
        System.out.println(currency);

        if(isStudent){
            System.out.println("you are a student!");
        }
        else{
            System.out.println("you are NOT a student!");
        }
    }
}
