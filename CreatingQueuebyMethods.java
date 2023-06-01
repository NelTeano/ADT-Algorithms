/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creatingqueuebymethods;
import java.util.*;
/**
 *
 * @author Teano
 */
public class CreatingQueuebyMethods {
    
    
    static Scanner sc = new Scanner(System.in);
    
    static int index = -1;
    static int x[] = new int[5];
    static int Input;
    
    static void Push(){
        
        if(index == x.length - 1){
            System.out.println("The Queue is Full");
        
        }else{
            
            
        index++;
        Input = sc.nextInt();
        x[index] = Input;
        Push();
        }
    }
    
    static void Peek(){
        System.out.println("The Head is : " + x[0]);
    }
    
    static void Size(){
        System.out.println("The Size : " + x.length );
    
    }
    
    static void Show(){
        System.out.println(Arrays.toString(x));
    }
    
    
    
    

    
    public static void main(String[] args) {
        Push();
        Show();
        Size();
        Peek();
        
        
        
        
                
                
    }
    
}
