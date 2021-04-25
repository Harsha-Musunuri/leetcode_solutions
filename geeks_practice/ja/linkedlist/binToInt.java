import java.util.LinkedList;

public class binToInt {

    //using the linkedlist class
    public static void main(String[] args) {
        // testcase 1: 101
        linkedlist li = new linkedlist();
        li.push(1);
        li.push(0);
        li.push(1);
        // li.showList();
    //core logic to convert this to a int
    int number = 0;
    while(li.head!=null){
        number=number*2+li.head.data;
        // System.out.println(li.head.data);
        li.head=li.head.next;
    }
    System.out.println(number);
    }
}

