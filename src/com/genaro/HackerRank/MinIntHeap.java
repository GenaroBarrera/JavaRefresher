package com.genaro.HackerRank;

import java.util.Arrays;

public class MinIntHeap {

//  for demo purposes
    int[] items = { 15, 10, 20, 17}; //this violates the min heap property as is
    private int capacity = items.length;
    private int size = items.length;

    //helper methods
    //get the left, right, or parent index
    private int getLeftChildIndex(int parentIndex) {return 2 * parentIndex + 1;}
    private int getRightChildIndex(int parentIndex) {return 2 * parentIndex + 2;}
    private int getParentIndex(int childIndex) {return (childIndex - 1) / 2;}

    //check if the left, right, and parent index exist
    private boolean hasLeftChild(int index) {return getLeftChildIndex(index) < size;}
    private boolean hasRightChild(int index) {return getRightChildIndex(index) < size;}
    private boolean hasParent(int index) {return getParentIndex(index) >= 0;}

    //get the values of the left, right, or parent index
    private int leftChild(int index) {return items[getLeftChildIndex(index)];}
    private int rightChild(int index) {return items[getRightChildIndex(index)];}
    private int parent(int index) {return items[getParentIndex(index)];}

    //swap method that swaps the values of two indices
    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    //ensure extra capacity method
    //TODO: note this method is untested
    private void ensureExtraCapacity(){
        if(size == capacity){ //check if the items array is full
            items = Arrays.copyOf(items, capacity * 2); //if so increase the capacity by 2
            capacity *=2;
        }
    }

    //peek method to return the first element
    public int peek() {
        if(size == 0) throw new IllegalStateException(); //first checks if the array is empty, if so return an exception
        return items[0]; //otherwise return the first element (the minimum element i.e. the root of the heap)
    }

    //poll method to extract the minimum element and remove it from the array
    public int poll() {
        if(size == 0) throw new IllegalStateException(); //first checks if the array is empty, if so return an exception
        int item = items[0]; //otherwise get the minimum value
        items[0] = items[size-1]; //swap the last element value with the first element
        size--; //"shrink" the array, get rid of the last element (which was our minimum value)
        //note: arrays are of fixed length, size-- won't actually make the array smaller.
        heapifyDown(); //reheapify down since we've moved the last element to the front, (adjust elments down as needed)
        return item; //return the value of the minimum element we've removed
    }

    //add element method
    public void add(int item) {
        ensureExtraCapacity(); //ensure there is capacity to add
        items[size] = item; //add element into the last spot of the array, (note not the last index)
        size++; //increase the size
        heapifyUp(); //heapify up, swapping each element with its parent as necessary
    }

    //called in add() to reorder the "tree structure"
    public void heapifyUp(){
        int index = size-1; //start with the last element added
        while(hasParent(index) && parent(index) > items[index]) {//walk up the tree as long as there is a parent item && as long as the element is out of order (ie if the parent is larger)
            swap(getParentIndex(index), index); //swap with the parent index
            index = getParentIndex(index); //walk upwards
        }
    }

    //called in poll() to reorder the "tree structure"
    public void heapifyDown(){
        int index = 0; //start with the root element (ie minimum element)
        while(hasLeftChild(index)) { //first check for left child, (if there is no left child then we don't have a right child either)
            int smallerChildIndex = getLeftChildIndex(index);//first let's guess and set the smaller child index as the left child index
            if(hasRightChild(index) && rightChild(index) < leftChild(index)) {//if we have a right child, && it is less than the left child
                smallerChildIndex = getRightChildIndex(index); //set the smallerChildIndex as the right child index
            }

            //check if the children of index are smaller (ie the order is correct and we can exit)
            if(items[index] < items[smallerChildIndex]){
                break;
            } else{ //else swap my index value with the smallerChildIndex value
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex; //then move down to my smaller child
        }
    }

    //main MinIntHeap demo
    public static void main(String[] args) {
        MinIntHeap demoHeap = new MinIntHeap(); //create a new MinIntHeap object
        System.out.println("what is size: " + demoHeap.size);   //print the size
        for (int i = 0; i < demoHeap.size; i++) {               //print the starting items array
            System.out.println(demoHeap.items[i]);
        }

        System.out.println(" ");                                //add a new line

        System.out.println("call heapify down to order the heap");
        demoHeap.heapifyDown();

        System.out.println("what is peek: "+demoHeap.peek());   //print peek method
        System.out.println("what is poll: "+demoHeap.poll());   //print poll method
        for (int i = 0; i < demoHeap.size; i++) {               //print array after poll method
            System.out.println(demoHeap.items[i]);
        }

        System.out.println(" ");                                //add a new line

        System.out.println("Now let's insert 8 to the heap");
        demoHeap.add(8);                                        //call add method (passing in 8)
        for (int i = 0; i < demoHeap.size; i++) {               //print array after add method
            System.out.println(demoHeap.items[i]);
        }
        System.out.println("Note: 8 is the root and parent of 15 and 20, 17 is the child of 15");
    }
}// end of MinIntHeap class




