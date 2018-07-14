 class Entity {
  int data;
  Entity down;
  public Entity(int data) {
    this.data = data;
    this.down= null;
  }
}

class Stackimp {
  Entity top;
  public Stackimp() {
    this.top = null;
  }
  /*The data is strored in e; if top is null place e in top; else place the
  present top value as top.down and and the data as the lates top*/
  public void push(int data) {
    Entity e = new Entity(data);
    if(top == null) {
      top = e;
    }
    else {
      e.down = top;
      top = e;
    }
  }
  public int pop(){
    int data = top.data;
    top = top.down;
    return data;
  }

  public void print() {
    Entity temp;
    if(top == null) {
      System.out.println("Stack is empty");
    }
  for(temp = this.top; temp != null; temp = temp.down) {
        System.out.println(temp.data);
      }
  }
}
  class Stack {
    public static void main(String[] args) {
      Stackimp s = new Stackimp();
      System.out.println("Stack after push");
      s.push(2);
      s.push(4);
      s.push(6);
      s.push(12);
      s.push(18);
      s.push(32);
      s.print();
      System.out.println("Stack after pop");
      s.pop();
      s.print();
    }
  }
