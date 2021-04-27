public class merge2SortedLists {

    //using the linkedlist class 2 create 2 lists
    public static void main(String[] args) {
        // testcase 1: 101
        linkedlist l1 = new linkedlist();
        linkedlist l2 = new linkedlist();
        l1.push(1);
        l1.push(2);
        l1.push(4);
        l2.push(1);
        l2.push(3);
        l2.push(4);
        // li.showList();

    //core logic to return merged list
    Node dummy = new Node(-1);
    Node head = dummy;
    while(l1.head!=null && l2.head!=null){
        if(l1.head.data<l2.head.data){
            dummy.next=l1.head;
            l1.head=l1.head.next;
        }else{
            dummy.next=l2.head;
            l2.head=l2.head.next;
        }
        dummy=dummy.next;
    }
    if(l1!=null){
        dummy.next=l1.head;
    }else{
        dummy.next=l2.head;
    }
    Node temp=head.next;
    // finally print the merged list
    while(temp!=null){
        System.out.println("\n");
        System.out.println(temp.data);
        temp=temp.next;
    }
    }
}
