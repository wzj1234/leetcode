public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class InitialListNode{
    public ListNode str2Int(String str){
        if(str.length()<3){
            return null;
        }
        str = str.substring(1, str.length()-1);
        String[] strs = str.split(",");
        ListNode head = new ListNode(Integer.parseInt(strs[0]));
        ListNode locListNode = head;
        for(int i=1;i<strs.length;i++){
            ListNode newNode = new ListNode(Integer.parseInt(strs[i]));
            locListNode.next = newNode;
            locListNode = locListNode.next;
        }
        return head;
    }
    public void printListNode(ListNode list) {
        while (list != null) {
            System.out.print(list.val+" -> ");
            list = list.next;
        }
        System.out.println("null");
    }
    public ListNode reverse(ListNode list) {
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
}
