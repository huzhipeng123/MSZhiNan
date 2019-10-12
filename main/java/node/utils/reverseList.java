package node.utils;

import node.vo.DoubleNode;
import node.vo.Node;

/**
 * @Author huzhpm
 * @Date 2019/10/12 22:00
 * @Version 1.0
 * @Content 反转链表
 */
public class reverseList {

    /**
     *反转单向链表
     * @param head
     * @return
     */
    public Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 反转双向链表
     * @param head
     * @return
     */
    public DoubleNode reverseList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
