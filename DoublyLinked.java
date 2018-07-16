import java.util.*;
class Node {
  int data;
  Node next;
  Node prev;

  /*initializing as null */

  public Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class DoublyLinkedList {
  Node head;
  public DoublyLinkedList() {
    this.head = null;
  }

  /*if head is null then the list is empty and therefore
  the entered value is added as an element else the value is added
  as the next element in the list */

  public void append (int data) {
    Node newnode = new Node(data);
    if(head == null)
      head = newnode;
    else
    {
      Node temp;
      for(temp = this.head;temp.next != null;temp = temp.next);
        temp.next = newnode;
        temp.prev = temp;
    }
  }
  public void print(){
    Node snode;
    for(snode = this.head;snode != null;snode = snode.next){
      System.out.println(snode.data);
    }
 }

 /*returning when head is null and ignoring the element at the position at
 which the element is to be deleted */

 public void delete(int pos) {
   Node tempo = head;
   if(head == null)
     return;
   if (pos == 0) {
     head = tempo.next;
     return;
   }
   for(int i = 0; tempo != null && i < pos-2; i++) {
     tempo = tempo.next;
   }
   Node next = tempo.next.next;
   tempo.next = next;
   Node prev = tempo.prev.prev;
   tempo.prev = prev;
 }
}


public class DoublyLinked {
  public static void main(String[] args) {
    DoublyLinkedList b = new DoublyLinkedList();
    b.append(2);
    b.append(4);
    b.append(6);
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
    b.delete(p);
    System.out.println("linked list after deletion is:");
    b.print();
  }
}
