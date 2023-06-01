
package stackarray;

import java.util.*;

/**
 *
 * @author Teano
 */
public class StackArray {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("****************************STACK***********************************");
       Stack<String> games = new Stack<String>(); // STACK IS (LIFO) LAST IN FIRST OUT
       
       games.add("Dota 2");
       games.add("League of Legends");
       games.add("Mobile Legends");
       System.out.println(games);
       games.pop();                              // REMOVE THE LAST ELEMENT(MOBILE LEGENDS) BECAUSE ITS THE LAST THAT GOES IN
       System.out.println(games);                                       
       games.push("Chess");                 // CHESS BECOME THE LAST 
       System.out.println(games.peek());      // OUTPUT IS CHESS BECAUSE IT IS THE LAST GOES IN BECAUSE WE PUSH IT AFTER POP(REMOVES THE LAST) WE PUSH INSIDE
       
       
       
       System.out.println("****************************QUEUE*********************************");
       Queue<Integer> Numbers = new LinkedList<Integer>(); // QUEUE IS FIRST IN FIRST OUT (FIFO)
       Numbers.add(710);
       Numbers.add(690);
       Numbers.add(340);
       System.out.println(Numbers);                //[710, 690, 340]
       Numbers.remove();                            //REMOVE THE FIRST IN (THE HEAD)(710)
       System.out.println(Numbers);             
       System.out.println(Numbers.peek());      // PRINTS THE HEAD WHICH IS 690 BECAUSE LAST TIME WE REMOVE 710 
       Numbers.add(970);
       Numbers.poll();                           //REMOVES THE HEAD (THE FIRST IN)
       System.out.println(Numbers);            // ONLY OUTPUT IS 340 ABD 970 BECAUSE THE HEAD(690) REMOVED BY SYNTAX POLL
         
       
       
       
       
    }
    
}
