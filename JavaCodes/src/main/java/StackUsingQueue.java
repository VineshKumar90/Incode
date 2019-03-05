import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> myQueue = new LinkedList<Integer>();

    private void push(int num){
        int size = myQueue.size();
        myQueue.add(num);

        for(int i=0;i<size;i++) {
            num = myQueue.remove();
            myQueue.add(num);
        }
    }

    private int top(){
        return myQueue.peek();
    }
    private int pop(){
        return myQueue.remove();
    }

    private void showStackValues(){
        Iterator<Integer> itertor = myQueue.iterator();
        while(itertor.hasNext()){
            System.out.print(" Stack Elements are :"+itertor.next());
        }
    }

    public static void main(String args[]){

        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top());
        stack.pop();
        stack.push(50);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
