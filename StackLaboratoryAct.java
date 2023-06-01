
package stacklaboratoryact;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Teano
 */
public class StackLaboratoryAct {
    static Scanner sc = new Scanner(System.in);
    
    static int mystack[] = new int[0];
    static int index;
    static int value;
    
   
    static void Push(){
        if(index == mystack.length){
        
            System.out.println("Array has Fulfilled");
            
        }else{
            
            value = sc.nextInt();
            mystack[index] = value;
            index++;
            Push();
            
        }
        
    
    }
          
    static void myStackElements(){
        System.out.println("Stack : " + Arrays.toString(mystack));
            
    }
    
    
    static void TopofStack(){
        System.out.print("Top of the Stack is : ");
        System.out.println(mystack[mystack.length - 1]);
       
    }
    
    
    static void SizeofStack(){
        System.out.print("Size of the Stack is : ");
        System.out.println(mystack.length);
    
    }


    public static void main(String[] args) {

        
        System.out.println("Minimum of 10 Maximum of 20");
            int size = sc.nextInt();
            
            
            if(size >= 10){
            mystack = Arrays.copyOf(mystack, size);
       
          
            System.out.println("Enter the Numbers");
            Push();
            myStackElements();
            TopofStack();
            SizeofStack();
            }else{
                System.out.println("Did not meet the Require Value of Array Size");
            }

    }
    
}
