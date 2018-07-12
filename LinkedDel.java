import java.util.*;
class Node {
  int data;
  Node next;
  public Node(int data){

    /*initializing enetred value as data and
    the next value as null */

    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;
  public LinkedList(){

    /*initializing head as null*/

    this.head = null;
  }
  public void append(int data){

    /*if head is null then the list is empty and therefore
    the entered value is added as an element else the value is added
    as the next element in the list */

    Node newnode = new Node(data);
    if(head == null)
      head = newnode;
    else
    {
      Node temp;
      for(temp = this.head;temp.next != null;temp = temp.next);
        temp.next = newnode;
    }
  }


  public void print(){
    Node snode;
    for(snode = this.head;snode != null;snode = snode.next){
      System.out.println(snode.data);
    }
  }


  public void del(int pos){
    /*returning when head is null and ignoring the element at the position at which the element is to be deleted */
    Node tempo = head;
    if(head == null)
      return;
    if (pos == 0){
      head = tempo.next;
      return;
    }
    for(int i = 0; tempo != null && i < pos-2; i++){
      tempo = tempo.next;
    }
    Node next = tempo.next.next;
    tempo.next = next;
  }
}

public class LinkedDel {
  public static void main(String[] args) {
    LinkedList b = new LinkedList();
    b.append(18);
    b.append(54);
    b.append(9);
    b.append(11);
    b.append(5);
    b.append(72);
    b.append(1);
    b.append(18);
    Scanner s = new Scanner (System.in);
    System.out.println("the linked list is");
    b.print();
    System.out.println("Enter the position at which the element must be deleted");
    int	p = s.nextInt();
    b.del(p);
    System.out.println("linked list after deletion is:");
    b.print();
  }
}
