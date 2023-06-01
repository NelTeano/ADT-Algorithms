
package queuelaboratory;

/**
 *
 * @author Teano
 */
public class QueueLaboratory {

    
    static int Arr[] = new int [5];
    static int front = -1;
    static int rear = -1;
    
    
    static void EnQue(int num){
    
        if(rear >= Arr.length - 1){
            
            System.out.println("Queue is Full");
        
        }else if(front == -1 && rear == -1){
        
            front++;
            rear++;
            Arr[rear] = num;
        }
        
        else{
        
            rear++;
            Arr[rear] = num;
        }
    }
    
    static void DeQue(){
        System.out.println("Initialize DeQue");
        Arr[front] = 0;
        front ++;
    }
    
    
    static void Front(){
    
        System.out.println("The Front : " + Arr[front]);
    }
    
    static void Rear(){
    
        System.out.println("The Rear : " + Arr[rear]);
    }
    
    static void DisplayAllElements(){
        
          System.out.println("Elements : ");
        for(int i = front; i<= Arr.length - 1; i++){
            System.out.println(Arr[i]);
        }
    
    }
    
    static void IsEmpty(){
        
        if(rear > -1 ){
            System.out.println("The Queue is not Empty");
        
        }else{
            System.out.println("The Queue is Empty");
        
        }
    
    }
    
    
    
    
    public static void main(String[] args) {
        
       
       
        
     

    }
    
}
