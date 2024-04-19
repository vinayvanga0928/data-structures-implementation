import CircularDoublyLinkedList.CircularDoublyLInkedList;
import CircularSinglyLinkedList.CircularSinglyLinkedList;
import DoublyLinkedList.DoublyLinkedList;
import Stack.StackWithArray;
import Stack.StackWithLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        //CircularDoublyLInkedList
//        CircularDoublyLInkedList cdll = new CircularDoublyLInkedList();
//        //create cdll
//        cdll.createCDLL(0);
//        System.out.println(cdll.head.value);
//        //Insert in cdll
//        cdll.insertInCdll(5,1);
//        cdll.insertInCdll(6,2);
//        cdll.insertInCdll(7,3);
//        cdll.insertInCdll(8,4);
//        //traverse cdll
//        cdll.traverseCdll();
//        cdll.reverseTraverseCdll();
//        //search in cdll
//        cdll.searchInCdll(5);
//        //delete node in CDLL
//        cdll.deleteInCdll(4);
//        cdll.traverseCdll();
//
//
//        //CircularSinglyLinkedList
//        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        //create a csll
//        csll.createCSLL(0);
//        System.out.println(csll.head.value);
//        //insert nodes in csll
//        csll.insertInCsll(5,1);
//        csll.insertInCsll(6,2);
//        csll.insertInCsll(7,3);
//        csll.insertInCsll(8,4);
//        csll.insertInCsll(9,3);
//        System.out.println(csll.head.next.value);
//        //traverse csll
//        csll.traverseCsll();
//        //search in csll
//        csll.searchInCsll(6);
//        //delete node from CSLL
//        csll.deleteInCsll(5);
//        csll.traverseCsll();
//
//
//        //DoublyLinkedList
//        DoublyLinkedList dLL = new DoublyLinkedList();
//        dLL.createDLL(0);
//        System.out.println(dLL.head.value);
//        dLL.insertInDLL(5,1);
//        dLL.insertInDLL(6,2);
//        dLL.insertInDLL(7,3);
//        dLL.insertInDLL(8,4);
//        dLL.traverseDll();
//        dLL.searchInDll(6);
//        dLL.deleteInDll(1);
//        dLL.traverseDll();

//        StackWithArray stack1 = new StackWithArray(4);
//        stack1.push(1);
//        stack1.push(2);
//
//        stack1.intoString();
//        stack1.push(3);
//        stack1.push(4);
//
//        stack1.intoString();
//
//        System.out.println(stack1.peek());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.peek());
//
//        stack1.intoString();


        StackWithLinkedList stack = new StackWithLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.delete();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}