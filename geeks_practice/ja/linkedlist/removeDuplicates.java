public class removeDuplicates {

    //using the linkedlist class
    public static void main(String[] args) {
        // testcase 1: 101
        linkedlist li = new linkedlist();
        li.push(1);
        li.push(1);
        li.push(1);
        // li.showList();
    //core logic to remove duplicates
    
        Node prev = li.head;
        Node curr = li.head.next;
        while(curr != null){
            if(curr.data == prev.data)prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        // finally print the final list
        while(li.head!=null){
            System.out.println("\n");
            System.out.println(li.head.data);
            li.head=li.head.next;
        }
    }
    
}
