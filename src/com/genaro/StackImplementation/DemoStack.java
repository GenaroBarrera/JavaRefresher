package com.genaro.StackImplementation;

import java.util.Arrays;

public class DemoStack {
    private int stackSize; //will determine the size of the stack
    private int[] stackArray; //the stack will be an int[] based implementation (actual stack class is vector list based)
    private int top; //represents the top position of the stack,
                     // elements enter from the top and elements can only exit from the top

    //constructor, (takes int size to determine the size of the stack)
    public DemoStack(int size) {
        stackSize = size;
        stackArray = new int[stackSize];
        top = -1; //an empty stack will start with the top position at -1,
                  // each push and pop will then affect the position of the top accordingly
    }
    /**
     * increaseCapacity()
     * To be called on push(), check that the top position isn't greater
     * than the stackSize, if so copy the stack into a new array with an
     * increased capacity (2x) return the array
     */
    public int[] increaseCapacity(){
        stackSize *=2;
        int[] newArray = new int[stackSize]; // having a parameterizable growth rate is probably a good idea

        for (int i = 0; i < stackArray.length; i++) {
            newArray[i] = stackArray[i]; //copy the elements into the new array
            //System.out.println(newArray[i] + " " + stackArray[i]);
        }

        return newArray; //return the newly increased stackArray
    }
    /**
     * Push(int i)
     * Takes in an integer value i and places it on the top of the stack
     * Note: it calls increaseCapacity() to check if the capacity needs to be increased
     * @param i
     */
    public void push(int i) {
        //check if the capacity needs to be increased
        if (top+1 >= stackSize) { //Note: (don't do top++ bc that assigns a new value to top)
            stackArray = increaseCapacity();
        }
        //Note: the top position will be incremented on each push!
        stackArray[++top] = i;
    }
    /**
     * pop()
     * returns the top element in the stack (last push)
     * and decrements the stack top position by one
     * @return
     */
    public int pop() {
        return stackArray[top--];
    }
    /**
     * peek()
     * returns the value at the top without removing it
     * @return
     */
    public int peek() {
        return stackArray[top];
    }
    /**
     * isEmpty()
     * returns true or false depending if the stack
     * is empty or not
     * @return
     */
    public boolean isEmpty() {
        //if the top position == the initial position of -1,
        //that means the stack is empty
        return (top == -1);
    }
    /**
     * isFull()
     * returns true or false depending if the stack
     * is full or not
     * @return
     */
    public boolean isFull() {
        //if the top position  == the size of the stack -1 (0 based index)
        //that means the stack is full, (top is at the end of the stack)
        return (top == stackSize - 1);
    }
    public static void main(String[] args) {
        DemoStack myStack = new DemoStack(5);

        //push into the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6); //should increase capacity at this push()

        //demo peek
        System.out.println("No peeking: " + myStack.peek());

        while (!myStack.isEmpty()) { //while the stack isn't empty
            int value = myStack.pop(); //pop the top
            System.out.print(value); //print the popped value
            System.out.print(" "); //this is just a space
        }
    }
}
