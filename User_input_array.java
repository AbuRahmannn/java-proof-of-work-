import java.util.Scanner;
public class User_input_array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your fav color");
        String s = scan.next();
        System.out.println("your favoraite color is: "+s);
        scan.close();
    }
}
