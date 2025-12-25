import java.util.Scanner;
public class Userinputproblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = scanner.next();
        
        System.out.println("enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("enter your cgpa percentile: ");
        float cgpa = scanner.nextFloat();

        System.out.println("enter your average grades");
        char grade = scanner.next().charAt(0);
        System.out.println("your name is "+name+" your age is "+age+" your cgpa percentile is "+cgpa+" and your average grades are "+grade);
        scanner.close();
    }
}
