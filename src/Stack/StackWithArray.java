package Stack;

import java.util.Arrays;

public class StackWithArray {

    private int[] arr;
    private int topOfStack;

    public StackWithArray(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public boolean isFull(){
        return topOfStack == arr.length - 1;
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("The Array is Full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The Array is Empty");
            return -1;
        } else {
            int topElement = arr[topOfStack];
            topOfStack--;
            return topElement;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The Array is Empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    public void intoString(){
        System.out.println(Arrays.toString(arr));
    }

}
