/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author admin
 */
public class StackArray {

    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\nStack elements:");
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Remove: " + stack.pop());

        System.out.println("Top element: " + stack.peek());

        System.out.println("\nStack after pop:");
        stack.display();
    }

    // Add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println("Pushed at " + top + ": " + value);
    }

    // View the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return stack[top];
    }

  
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}