/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class add_two_numbers {
//    https://leetcode-cn.com/problems/add-two-numbers/
//    middle

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode res = null;
//        ListNode l1Reverse = reverse(l1);
//        ListNode l2Reverse = reverse(l2);
        ListNode l1Reverse = l1;
        ListNode l2Reverse = l2;
        ListNode tempNode = new ListNode(0);
        ListNode resTail = tempNode;
        int carry = 0;
        int tempResult = 0;
        while(l1Reverse != null || l2Reverse != null){
            if((l1Reverse == null) || (l2Reverse == null)){
                if(l1Reverse == null){
                    tempNode.next = l2Reverse;
                }
                if(l2Reverse == null){
                    tempNode.next = l1Reverse;
                }
                tempNode = tempNode.next;
                while(carry != 0){
                    tempResult = tempNode.val + carry;
                    carry = tempResult/10;
                    tempResult = tempResult%10;
                    tempNode.val = tempResult;
                    if(tempNode.next == null){
                        if(carry != 0){
                            ListNode newNode = new ListNode(carry);
                            tempNode.next = newNode;
                            tempNode = tempNode.next;
                            carry = 0;
                        }
                        break;
                    }
                    tempNode = tempNode.next;
                }
                break;
            }
            tempResult = l1Reverse.val + l2Reverse.val + carry;
            carry = tempResult/10;
            tempResult = tempResult%10;
            ListNode newNode = new ListNode(tempResult);
            tempNode.next = newNode;
            tempNode = tempNode.next;
            l1Reverse = l1Reverse.next;
            l2Reverse = l2Reverse.next;
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            tempNode.next = newNode;
            tempNode = tempNode.next;
            carry = 0;
        }
        res = resTail.next;
//        res = reverse(res);
        return res;
    }
    public static ListNode reverse(ListNode list) {
        if(list==null || list.next==null) {
            return list;
        }
        ListNode preNode = list;
        ListNode locNode = preNode.next;
        ListNode tempNode = locNode;
        preNode.next = null;
        while (locNode != null) {
            locNode = locNode.next;
            tempNode.next = preNode;
            preNode = tempNode;
            tempNode = locNode;
        }
        return preNode;
    }
    public static void main(String[] args) {
        InitialListNode iln = new InitialListNode();
        ListNode l1 = iln.str2Int("[1]");
        ListNode l2 = iln.str2Int("[9,9]"); //1 -> 8
//        ListNode l1 = iln.str2Int("[2,4,3]");
//        ListNode l2 = iln.str2Int("[5,6,4]"); //[7,0,8]
        l1 = addTwoNumbers(l1, l2);
        System.out.println("result:");
        iln.printListNode(l1);
    }

}
