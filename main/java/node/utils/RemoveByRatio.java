package node.utils;

import node.vo.Node;

/**
 * @Author huzhpm
 * @Date 2019/10/12 21:52
 * @Version 1.0
 * @Content 删除链表的a/b处的节点
 */
public class RemoveByRatio {

    /**
     * 删除链表的a/b处的节点
     * @param head
     * @param a
     * @param b
     * @return
     */
    public Node removeByRatio(Node head, int a, int b){
        if(a < 1 || a > b){
            return head;
        }
        int n = 0;
        Node cur = head;
        while(cur != null){
            n++;
            cur = cur.next;
        }
        n = (int) Math.ceil((double)(a * n) / (double)b);
        if(n == 1){
            head = head.next;
        }
        if(n > 1){
            cur = head;
            while(--n != 1){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
