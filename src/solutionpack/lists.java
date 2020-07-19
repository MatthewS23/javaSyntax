package solutionpack;

import java.util.LinkedList;
import java.util.Stack;

public class lists {

    //Instantiate the class 'List' with a Stack

    //Instantiate the class 'List' with a ArrayList

    //Instantiate the class with a private  Linked List
     private static LinkedList<Integer> classList = new LinkedList<Integer>();

    //Constructor Method for class 'lists'
    public static void setlists(){
        //add elements to LinkedList
        LinkedList<Integer> listCreation = new LinkedList<Integer>();
        listCreation.add(1);
        listCreation.add(2);
        listCreation.add(3);
        classList = listCreation;
    }
    //Getter for class private static LinkedList
    public static LinkedList<Integer> getClassLinkedList(){
        return classList;
    };

//Methods for Analyzing and Manipulating Lists:

    //Delete Specified Node, according to the value of the node received, and return newly modified Linked List
    public static LinkedList<Integer> deleteNode(int num) {
        LinkedList<Integer> listCreation = new LinkedList<Integer>();
        listCreation.add(1);
        listCreation.add(2);
        listCreation.add(3);
        //Iterate through array and find node with same value as 'num'
        for(int i =0; i < listCreation.size(); i++){
            int valueOfNode = listCreation.get(i);
            if(valueOfNode == num){
                listCreation.remove(i);
            }
        }
        return listCreation;
    }

    public static LinkedList<Integer> removeNthNode(int num){
        LinkedList<Integer> listCreation = new LinkedList<Integer>();
        listCreation.add(1);
        listCreation.add(2);
        listCreation.add(3);

        for(int i =0; i < listCreation.size(); i++){
            if(i == num){
                listCreation.remove(i);
            }
        }
        return listCreation;

    }

    //reverse linked list
        public static LinkedList<Integer> reverseLinkedList(){
        //Overall Idea: Convert LinkedList to array, reverse array, convert back into Linked List

        //Original Linked List
        LinkedList<Integer> listCreation = new LinkedList<Integer>();
        listCreation.add(1);
        listCreation.add(2);
        listCreation.add(3);

        //Linked List reversed
            LinkedList<Integer> reversedList = new LinkedList<>();
        //Convert Linked List to array for easier backwards parsing
        Object[] linkedListToArray = listCreation.toArray();
        //Append Linked List on each backwards iteration
        for(int r = listCreation.size() -1; r >=0 ; r--){
            int dataConversion = (int) linkedListToArray[r];
            reversedList.add(dataConversion);
        }
        System.out.println("Reversed Link List: " + reversedList);
        return reversedList;
    }



    public static void main(String args[]){
    lists.reverseLinkedList();



    }
}
