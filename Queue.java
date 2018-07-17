import java.util.*;
class Node {
  int data;
  Node next;
  public Node(int data){

    /*initializing enetred value as data and
    the next value as null */

    this.data=data;
    this.next=null;
  }
}

class LinkedList {
  Node head;
  public LinkedList(){

    /*initializing head as null*/

    this.head=null;
  }
  public void append(int data){

    /*if head is null then the list is empty and therefore
    the entered value is added as an element else the value is added
    as the next element in the list */

    Node newnode=new Node(data);
    if(head==null)
      head=newnode;
    else
    {
      Node temp;
      for(temp = this.head;temp.next != null;temp = temp.next);
        temp.next=newnode;
    }
  }
  public void print(){
    Node snode;
    for(snode = this.head;snode != null;snode = snode.next){
      System.out.println(snode.data);
    }
  }
  /*Setting the last node as null and printing the rest*/
  public void delete()
  {
    if(head == null)
        return;
    Node tempo = this.head;
    while(tempo.next.next != null) {
          tempo = tempo.next;
      }

      tempo.next = null;
      for(tempo = this.head; tempo != null; tempo = tempo.next)
      System.out.println(tempo.data);
  }
}

public class Queue {
  public static void main(String[] args) {
    LinkedList b = new LinkedList();
    b.append(2);
    b.append(4);
    b.append(6);
    b.append(32);
    b.append(18);
    b.append(10);
    System.out.println("After insertion ");
    b.print();
    System.out.println("After first deletion");
    b.delete();
    System.out.println("After second deletion");
    b.delete();
  }
}
