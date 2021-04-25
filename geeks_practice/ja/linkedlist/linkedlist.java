// create a class for node
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

// create a class for linkedlist
public class linkedlist {
    Node head= null;
    int size =0;

    public void push(int data){
        Node x = new Node(data);

        if(getSize()==0){
            head = x;

        }else{
            //add the Node at the end of a Linked List
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next=x;
        }
        System.out.println("Element "+ data + " is pushed into linkedlist");
        size++;
    }

    public int pop(){
        if(getSize()==0){
            System.out.println("linkedlist is Empty");
            return -1;
        }else{
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }

    }

    public void showList(){
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
}

