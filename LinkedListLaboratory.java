






package linkedlistlaboratory;
import java.util.LinkedList;


/**
 *
 * @author Teano
 */
public class LinkedListLaboratory {

   
    
    
    
    
    public static void main(String[] args) {
       
           LinkedList Mylist = new LinkedList();
           Mylist.add("Your Love");
           Mylist.add("Paraluman");
           Mylist.add("Perfect");
           Mylist.add("Bohemian Rhapsody");
           Mylist.add("Ilaw sa Daan");
           
           
           LinkedList MySingers = new LinkedList();
           MySingers.add("Alamin");
           MySingers.add("Adie");
           MySingers.add("Ed Sheeran");
           MySingers.add("Queens");
            MySingers.add("IV of Spades");
            
            
            LinkedList All = new LinkedList();
            All.addAll(Mylist);
            All.addAll(MySingers);
             
            
             
               
            
             
            for(int i = 0 ; i < All.size() - 5 ; i++ ){
            
                
                System.out.print(All.get(i));
                System.out.print("        ");
                System.out.println(All.get(i + 5));
                
                
                
            
            }
           
           
    
     
        
        
        
        
     
        
        
      
    }
    
}
