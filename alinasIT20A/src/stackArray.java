public class stackArray {
private int[]Stack;
private int top;
private int capacity;

public stackArray(int capacity){
    this.capacity = capacity;
    this.Stack = new int [capacity];
    this.top = -1            
}
public static void main(String [] args){
    stackArray stack = new stackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("peek; "+ stack.peek());
        System.out.println(" empty: "+ stack.isEmpty);
        System.out.println("pull: "+stack.isFull);
}
public void push (int value){
    is(usFull()){
    System.out.println("stack is full");
    return;
}
    top++;
    stack[top] = value;
    System.out.println("stack is empty");
    return -1;
}
}
