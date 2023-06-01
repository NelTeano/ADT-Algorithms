package activity02;
import java.util.Scanner;
/**
 *
 * @author Teano
 */
public class Activity02 {
    
    public static int Sum(int num){
        
        if(num == 0 || num == 1){
    
            return num;
  
        }
        else{
            
            return(num + Sum(num - 1) );
        }

    }
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);                                
        int num;
        
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        int TotalofAllIntegers = Sum(num);
        System.out.println("The sum of the first " + num + " Intergers are : " + TotalofAllIntegers);
      
    }
}
