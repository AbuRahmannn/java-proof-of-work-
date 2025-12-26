import java.util.Scanner;
public class Userinput_and_multidimentional_array
{
    public static void main(String[] args)
    {
        //scanner
        Scanner scanner = new Scanner(System.in);
            System.out.println("enter number of rows: ");
            int row = scanner.nextInt();
            scanner.nextLine();
            //number of rows and columns
            System.out.println("enter number of columns: ");
            int col = scanner.nextInt();
    int num[][] = new int[row][col];
    System.out.println("enter the row & col elements: ");
//taking input    
    for(int i = 0;i<row;i++)
        {
            for(int j =0;j<col;j++)
                {
                     num[i][j] = scanner.nextInt();
                }
                System.out.println();
            }
//printing output
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(num[i][j]+" ");
    }
    System.out.println();
}
        scanner.close();
     }
}

