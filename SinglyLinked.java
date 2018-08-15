
class Node {
	Node next;
	int data;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class Linked {
	Node head;
	public Linked() {
	this.head=null;
	}

	public void insertFirst(int data) {
	Node newnode=new Node(data);
	if(this.head==null){
		head=newnode;
		return;
		}
	newnode.next=head;
	head=newnode;
	}



	public void insertPos(int data ,int pos) {
		Node newnode=new Node(data);
		Node tempo;
		int i;
		for(i=0,tempo=this.head; tempo!=null && i<pos-2; tempo=tempo.next, i++);
		newnode.next=tempo.next;
		tempo.next=newnode;
	}

	public void insertLast(int data) {
		Node newnode=new Node(data);
		if(this.head==null){
		head=newnode;
		return;
		}
		Node current;
	for(current=this.head; current.next!=null; current=current.next);
		current.next=newnode;
	}

	public boolean isEmpty() {
		if(this.head==null)
			return true;
		else
			return false;
	}

	public void isLastElement(int d) {
		Node curren;
		for(curren=this.head; curren.next!=null; curren=curren.next);
			if (curren.data==d)
				System.out.println("YES");
			else
				System.out.println("NO");

	}

	public void deleteFront() {
		Node t=head;
		head=head.next;
		t.next=null;
	}

	public void deleteLast() {
		Node tem;
		for(tem=this.head; tem.next.next!=null; tem=tem.next);
			tem.next=null;
	}

	public void deletePos (int p) {
		Node curr;
		int i;
		for (i = 0, curr = this.head; curr.next.next != null && i<p-1; curr=curr.next, i++);
			curr.next = curr.next.next;

	}

	public void print() {
	Node temp;
	for(temp=this.head; temp!=null; temp=temp.next)
	System.out.println(temp.data);
	}

	public void sortedInsert(int data)
	    {
					Node newnode=new Node(data);
	         Node current;
	         if (head == null || head.data >= newnode.data)
	         {
	            newnode.next = head;
	            head = newnode;
	         }
	         else {
	            current = head;
							while (current.next != null &&
	                   current.next.data < newnode.data)
	                  current = current.next;

	            newnode.next = current.next;
	            current.next = newnode;
	         }
	     }

		public void delData(int d) {
			Node crnt;
			int i=0;
			for(crnt=this.head; crnt!=null;crnt=crnt.next) {
				if(crnt.data==d) {
					i++;
					deletePos(i);
				}
			}
		}

		public void printEven() {
		Node temp=this.head.next;
		System.out.println(temp.data);
		while(temp.next!=null) {
			temp=temp.next.next;
			System.out.println(temp.data);
		}
		}
}

class SinglyLinked {
	public static void main(String[] args) {
	Linked l=new Linked();
	l.insertFirst(1);
	l.insertFirst(2);
	l.insertFirst(30);
	l.insertFirst(60);
	l.insertFirst(40);
	l.insertFirst(100);
	l.print();
	System.out.println("Insert at position");
	l.insertPos(20,2);
	l.print();
	System.out.println("Insert at last");
	l.insertLast(18);
	l.insertLast(10);
	l.print();

	boolean status =l.isEmpty();
	if (status==true)
		System.out.println("Empty");
	else
		System.out.println("Not Empty");
	System.out.println("Delete at last");
	l.deleteLast();
	l.print();
	System.out.println("Delete at front");
	l.deleteFront();
	l.print();
	l.isLastElement(2);
	System.out.println("Delete at pos");
	l.deletePos(2);
	l.print();
	System.out.println("Deleting last 4 elements");
	l.deleteLast();
	l.deleteLast();
	l.deleteLast();
	l.deleteLast();
	l.print();
	System.out.println("Insert");
	l.sortedInsert(30);
	l.print();
	System.out.println("Inserted 10");
	l.insertPos(10,2);
	l.print();
	System.out.println("Delete 10");
	l.delData(10);
	l.print();
	System.out.println("Insert");
	l.insertLast(50);
	l.insertLast(60);
	l.insertLast(70);
	l.print();
	System.out.println("Print Even");
	l.printEven();
	}
}
