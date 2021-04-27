class Node{
    Object data;
    Node next;
    public Node(Object data){
        this.data = data;
    }
}

public class stack {
    Node head= null;
    int size =0;

    public void push(Object data){
        Node x = new Node(data);
        if(getSize()==0){
            head = x;
        }else{
            //add the Node at the start of a Linked List
            Node temp = head;
            x.next = temp;
            head = x;
        }
        System.out.println("Element "+ data + " is pushed into Stack");
        size++;
    }

    public Object pop(){
        if(getSize()==0){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }

    }
    public boolean isEmpty(){
        if (getSize()==0)return true;
        else return false;
    }

    public void printStack(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }

    public Object peekStack(){
        if(head.data==null)return null;
        else return head.data;
    }

    public static void main(String[] args) {
        stack stck = new stack();
        stck.push("(");
        stck.push("{");
        stck.push("[");
        System.out.println("peeked element " + stck.peekStack());
        stck.printStack();
        stck.printStack();
        System.out.println("Pop out element " + stck.pop());
        stck.printStack();
    }
}
