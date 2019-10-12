package node.utils;

import node.vo.DoubleNode;
import node.vo.Node;

/**
 * @Author huzhpm
 * @Date 2019/10/12 20:20
 * @Version 1.0
 * 在单链表和双链表中删除倒数第K个节点
 */
public class RemoveLastKthNode {

    /**
     * 在单链表删除倒数第K个节点
     * @param head
     * @param lastKth
     * @return
     */
    public Node removeLastKthNode(Node head, int lastKth){
        if(head == null || lastKth < 1){
            return head;
        }
        Node cur = head;
        while(cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth == 0){
            head = head.next;
        }
        if(lastKth < 0){
            cur = head;
            while(++lastKth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }


    /**
     * 在双链表中删除倒数第K个节点
     * @param head
     * @param lastKth
     * @return
     */
    public DoubleNode removeLastKthNode(DoubleNode head, int lastKth){
        if(head == null || lastKth < 1){
            return head;
        }
        DoubleNode cur = head;
        while(cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth == 0){
            head = head.next;
            head.last = null;
        }
        if(lastKth < 0){
            cur = head;
            while(++lastKth != 0){
                cur = cur.next;
            }
            DoubleNode newNext = cur.next.next;
            cur.next = newNext;
            if(newNext != null){
                newNext.last = cur;
            }
        }
        return head;
    }
}
