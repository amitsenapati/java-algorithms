

import java.util.List;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class AddTwoNumbers {
    public static void main(String[] args){
//        Long input1 = 9L;
//        Long input2 = 9999999991L;
//
//        Long input1 = 243L;
//        Long input2 = 564L;

        Long input1 = 1L;
        Long input2 = 99L;


        ListNode currentNode = new ListNode(0);
        ListNode prevNode = new ListNode(0);
        ListNode head1 = currentNode;
        while(input1 > 0){
            Long digit = input1 % 10;
            currentNode.val = digit.intValue();
            prevNode = currentNode;
            if ((input1 / 10) > 0){
                currentNode = new ListNode(0);
                prevNode.next = currentNode;
            }
            input1 = input1 / 10;
        }

        currentNode = new ListNode(0);
        prevNode = new ListNode(0);
        ListNode head2 = currentNode;
        while(input2 > 0){
            Long digit = input2 % 10;
            currentNode.val = digit.intValue();
            prevNode = currentNode;
            if((input2 / 10) > 0){
                currentNode = new ListNode(0);
                prevNode.next = currentNode;
            }
            input2 = input2 /10;
        }

//        ListNode head = head1;
//        while(head!= null){
//            System.out.println(head.val);
//            head = head.next;
//        }
//
//        head = head2;
//        while(head!= null){
//            System.out.println(head.val);
//            head = head.next;
//        }

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode result = addTwoNumbers.addTwoNumbers(head1, head2);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode prevNode = null;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            ListNode node = new ListNode(0);
            int sum = 0;
            if(head == null){
                head = node;
            }
            if(l1 != null && l2 != null){
                if (carry > 0) {
                    sum = l1.val + l2.val + carry;
                }else{
                    sum = l1.val + l2.val;
                }
                if(sum > 9){
                    node.val = sum % 10;
                    carry = 1;
                }else{
                    node.val = sum;
                    carry = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            }else if (l1 != null && l2 == null){
                if(carry == 1){
                    sum = l1.val + carry;
                    carry = 0;
                }else{
                    sum = l1.val;
                }
                if(sum > 9){
                    node.val = sum % 10;
                    carry = 1;
                }else{
                    node.val = sum;
                }
                l1 = l1.next;
            }else if(l1 == null && l2 != null){
                if(carry == 1){
                    sum = l2.val + carry;
                    carry = 0;
                }else{
                    sum = l2.val;
                }
                if(sum > 9){
                    node.val = sum % 10;
                    carry = 1;
                }else{
                    node.val = sum;
                }
                l2 = l2.next;
            }else if(carry == 1){
                node.val = carry;
                carry = 0;
            }
            if(prevNode != null){
                prevNode.next = node;
            }
            prevNode = node;
        }
        ListNode node = head;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
        return head;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode node1 = l1;
//        ListNode node22 = l2;
//        ListNode node = new ListNode(0);
//        ListNode head = node;
//
//        while(l1 != null || l2 != null){
//            if(l1 != null && l2 != null){
//                node.val = l1.
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(l1.val);
//        while(l1.next != null){
//            l1 = l1.next;
//            sb.append(l1.val);
//        }
//
//        Long first = Long.parseLong(sb.reverse().toString());
//        head = l2;
//        sb.setLength(0);
//        sb.append(l2.val);
//        while(l2.next != null){
//            l2 = l2.next;
//            sb.append(l2.val);
//        }
//        Long second = Long.parseLong(sb.reverse().toString());
//        Long res = first + second;
//        StringBuilder resString = new StringBuilder(res.toString()).reverse();
//        ListNode currentNode = new ListNode(0);
//        ListNode prevNode = new ListNode(0);
//        head = currentNode;
//        for (int i = 0; i < resString.length(); i++){
//            currentNode.val = Character.getNumericValue(resString.charAt(i));
//            prevNode = currentNode;
//            currentNode = new ListNode(0);
//            prevNode.next = currentNode;
//        }
//
//        ListNode node = head;
//        while(node.next != null){
//            System.out.println(node.val);
//            node = node.next;
//        }
//
//        return head;
//    }
}


