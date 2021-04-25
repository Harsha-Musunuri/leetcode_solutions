public class findMidElement {

    //using the linkedlist class
    public static void main(String[] args) {
        // testcase 1: 101
        linkedlist li = new linkedlist();
        li.push(1);
        li.push(2);
        li.push(3);
        li.push(4);
        li.push(5);
        li.push(6);
        // li.showList();
    //core logic to return middle node
    Node fast=li.head;
    Node slow = li.head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        // System.out.println(li.head.data);
    }

    System.out.println(slow.data);
    }
}
