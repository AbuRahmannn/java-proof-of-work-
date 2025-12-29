import java.util.Scanner;
public class Demo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int size = scanner.nextInt();
        int a[] = new int[size];
        System.out.println("enter the array elements");
        for(int i = 0; i< size; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.println("the entered arrays elements are");
        for(int i = 0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        scanner.close();
    }
}
