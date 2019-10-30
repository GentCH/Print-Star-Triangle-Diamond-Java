
import java.util.Scanner;

public class PrintStar {
    static int r, c;
    
    PrintStar (){
        
    }
    
    public static void main(String[] args){
        System.out.print("Enter number of row: ");
        Scanner scan = new Scanner(System.in);
        int numberOfRows = scan.nextInt();
        System.out.println("");
        System.out.print("Right half diamond: ");
        System.out.println("");
        starUpperRight(numberOfRows);
        starLowerRight(numberOfRows);
        System.out.println("");
        System.out.print("Left half diamond: ");
        System.out.println("");
        starUpperLeft(numberOfRows);
        starLowerLeft(numberOfRows);
        System.out.println("");
        System.out.print("Triangle: ");
        System.out.println("");
        starUpperMiddle(numberOfRows);
        System.out.println("");
        System.out.print("Flip Triangle: ");
        System.out.println("");
        starLowerMiddle(numberOfRows);
        System.out.println("");
        System.out.print("Diamond: ");
        System.out.println("");
        starDiamond(numberOfRows);
        
    }
    
    public static void starUpperRight(int number){
        for(r=0; r<number; r++){
            for(c=0;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void starLowerRight(int number){
        for(r=number-1; r>0; r--){
            for(c=r;c>0;c--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void starUpperLeft(int number){
        for(r=0; r<number; r++){
            for(c=number-1; c>r; c--){
                System.out.print("  ");
            }
            for(c=0; c<=r; c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void starLowerLeft(int number){
        for(r=number-1; r>0; r--){
            for(c=r+1; c<=number; c++){
                System.out.print("  ");
            }
            for(c=1; c<=r; c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void starUpperMiddle(int number){
        for(r=0; r<number; r++){
            for(c=0;c<=number-r-2;c++){
                System.out.print(" ");
            }
            for(c=0;c<=r;c++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    
    public static void starLowerMiddle(int number){
        for(r=number; r>0; r--){
            for(c=number-r;c>0;c--){
                System.out.print(" ");
            }
            for(c=r;c>0;c--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    
    public static void starDiamond(int number){
        for(r=0; r<number; r++){
            for(c=0;c<=number-r-2;c++){
                System.out.print(" ");
            }
            for(c=0;c<=r;c++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for(r=number-1; r>0; r--){
            for(c=number-r;c>0;c--){
                System.out.print(" ");
            }
            for(c=r;c>0;c--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
