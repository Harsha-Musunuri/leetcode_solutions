public class removeAElement{

    public static Node removeElement(Node head,int remEle){
        if(head.data==remEle)removeElement(head.next, remEle);
        else{
            Node temp=head;
            while(temp.next!=null){
                if(temp.next.data==remEle)temp.next=temp.next.next;
                else{
                    temp=temp.next;
                }
            }
        }
        return head;
    } 
    //using the linkedlist class
    public static void main(String[] args) {
        // testcase 1: 101
        linkedlist li = new linkedlist();
        li.push(1);
        li.push(2);
        li.push(6);
        li.push(3);
        li.push(4);
        li.push(5);
        li.push(6);
        // li.showList();
    //core logic to remove a element 
        int remElement=6;
        Node updatedList=removeElement(li.head,remElement);
        System.out.println("updatedList");
        // System.out.println(updatedList.data);
        while(updatedList!=null){
            System.out.println(updatedList.data);
            updatedList=updatedList.next;
        }
    }
}