package node.utils;

import node.vo.Node;

/**
 * @Author huzhpm
 * @Date 2019/10/12 21:36
 * @Version 1.0
 * @Content
 */
public class RemoveMidNode {

    public Node removeMidNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        if(head.next.next == null){
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while(cur.next != null && cur.next.next != null){
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
