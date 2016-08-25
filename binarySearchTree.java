/*
    Binary Search Tree:
    1. Need a root.
    2. Smaller on the left, Larger on the right side
    3. Deplucate element put on the left.
    4. Class: Node, BinarySearchTree

*/

import java.utl.*;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node (int value){
        this.value = value;
         leftChild = null;
        rightChild = null;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value
    }

    public Node getLeftChild(){
        return leftChild;
    }

    public Node getRightChild(){
        return rightChild;
    }
}

public class binarySearchTree{
    //private member
    private Node root;    

    //constructor
    public binarySerachTree(){
        root = null;        
    }

    //insert a value to the binarySearchTree
    public void insert (int value)
    {        
        Node parent = null;
        Node current = null;
        Node newNode = new Node(value);

        //if root is empty, put in the new node, set current to root.
        if (root == null){
            root = newNode;
            return;
        }else current = root;    

        //Loop down until find the leave node and put the value in.
        while(true){
            if (current.getValue()< value){
                current = current.getLeftChild();
                if(current == null){
                    current = newNode;
                    return;
                }
            }else{
                current = current.getRightChild();
                if(current == null){
                    current = newNode;
                    return;
                }
            }
        }  
    }


    //search for a node
    public boolean search(int value){
        Node current = root;

        while (current != null){
            if(current.getValue == value)
                return true;
            else if (current.getValue()< value)
                current = current.getLeftChild();
            else
                current.getRightChild();
        }
        return false;
    }

   


}
}




    

