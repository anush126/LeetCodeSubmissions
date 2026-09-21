class ListNode {

    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }
    
    public int get(int index) {
        if(size == 0 || index >= size){
            return -1;
        }

        ListNode cur = head;
        for(int i = 0; i <= index; i++){
            cur = cur.next;
        }
        return cur.val;

    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head.next;
        head.next = temp;
        size++;
    }
    
    public void addAtTail(int val) {

        if(size == 0){
            addAtHead(val);
            return;
        }
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }

        ListNode cur = head;

        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }

        ListNode temp = new ListNode(val);

        temp.next = cur.next;
        cur.next = temp;

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }

        ListNode cur = head;

        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */