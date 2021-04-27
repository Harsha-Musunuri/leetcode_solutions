public class findIntersectionPoint {

    //1,9,1,2,4; 3,2,4
    //using the linkedlist class
    public static void main(String[] args) {
        // testcase 1: 101
        linkedlist l1 = new linkedlist();
        l1.push(1);
        l1.push(9);
        l1.push(1);
        l1.push(2);
        l1.push(4);

        linkedlist l2 = new linkedlist();
        l2.push(3);
        l2.head.next=l1.head.next.next.next;
    //core logic to return interesection element
    Node aPointer=l1.head;
    Node bPointer=l2.head;
    while(aPointer != bPointer){
        if(aPointer==null)aPointer=l2.head;    
        else aPointer=aPointer.next;
        if(bPointer==null)bPointer=l1.head;
        else bPointer=bPointer.next;
    }
     System.out.println(aPointer.data);


    }
}
