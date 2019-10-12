package node.utils;

import node.vo.Node;

/**
 * @Author huzhpm
 * @Date 2019/10/12 22:46
 * @Version 1.0
 * @Content 链表工具类
 */
public class NodeListUtil {

    /**
     * 反转部分单向链表
     * 给定一个单向链表的头结点head,以及两个整数from和to，在单向链表上把第form个节点
     * 到第to个节点这一部分进行反转
     * @param head
     * @param form
     * @param to
     * @return
     */
    public static Node reversePart(Node head, int form, int to){
        int len = 0;
        Node node1 = head;
        Node fPre = null;
        Node tPos = null;
        //确认结点数量
        while(node1 != null){
            len++;
            //确认头结点
            fPre = len == form - 1 ? node1 : fPre;
            //确认尾结点
            tPos = len == to + 1 ? node1 : tPos;
            node1 = node1.next;
        }
        if(form > to || form < 1 || to > len){
            return head;
        }
        node1 = fPre == null ? head : fPre.next;
        Node node2 = node1.next;
        node1.next = tPos;
        Node next = null;
        while(node2 != tPos){
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if(fPre != null){
            fPre.next = node1;
            return head;
        }
        return node1;
    }
}
