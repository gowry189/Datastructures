class Node {
int data;
Node next;
Node prev;

public Node (int data) {
  this.data = data;
  this.next = null;
  this.prev = null;
  }
}

class DoublyLink{
  Node head;
  public DoublyLink(){
    this.head = null;
    }

    public void print(){
      Node snode;
      for(snode = this.head;snode != null;snode = snode.next){
        System.out.println(snode.data);
      }
   }
   public void insertFront(int data) {
     Node newnode= new Node (data);
     if(head!=null) {
       head.prev=newnode;
     }
     newnode.next=head;
     head=newnode;
   }

   public void insertLast (int data) {
     Node newnode = new Node (data);
     Node temp;
     if(head==null){
       head=newnode;
     }
     for(temp = this.head; temp.next != null;temp = temp.next);
     temp.next=newnode;
     temp.prev=temp;
   }

   public void insertPos(int data,int pos) {
     Node tem=this.head;
     int i=1;
     Node newnode = new Node (data);
     if(head==null && pos==1) {
     head=newnode;
     return;
      }
      if (head==null && pos!=1){
        System.out.println("invalid position");
        return;
      }
      if(head!=null && pos==1) {
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return;
      }

      while(i<pos-1 && tem!=null) {
        tem=tem.next;
        i++;
      }
      if(i==pos-1) {
        if(tem.next!=null) {
          newnode.next=tem.next;
          tem.next.prev=newnode;
        }
          tem.next=newnode;
          newnode.prev=tem;
        }
        else
        System.out.println("invalid ");
      }

      public void delFront() {
        head=head.next;
        head.prev=null;
      }

      public void delLast() {
        Node temp;
        for(temp = this.head; temp.next.next != null;temp=temp.next);
        temp.next=null;
      }

      public void delPos(int pos) {
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
        tempo.next.next.prev=tempo;
        tempo.next=tempo.next.next;
      }
   }



class Doubly {
  public static void main(String[] args) {
    DoublyLink l  = new DoublyLink();
    Node one=new Node (1);
    l.head=one;
    Node two=new Node (2);
    one.next=two;
    two.prev=one;
    l.print();
    l.insertFront(3);
    System.out.println("----INSERT 3 AT FRONT------");
    l.print();
    l.insertLast(4);
    System.out.println("----INSERT 4 AT LAST------");
    l.print();
    System.out.println("-----INSERT 5 AT POS 2-----");
    l.insertPos(5,2);
    l.print();
    System.out.println("------INSERT 8 AT POS 1----");
    l.insertPos(8,1);
    l.print();
    System.out.println("------DELETE AT FRONT----");
    l.delFront();
    l.print();
    System.out.println("------DELETE AT LAST----");
    l.delLast();
    l.print();
    System.out.println("------DELETE AT POS 3----");
    l.delPos(3);
    l.print();
  }
}
