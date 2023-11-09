import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTestClass {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(3);
        node1 = new ListNode(4, node1);
        node1 = new ListNode(2, node1);

        ListNode node2 = new ListNode(4);
        node2 = new ListNode(6, node2);
        node2 = new ListNode(5, node2);

        ListNode node = Main.addTwoNumbers(node1, node2);

        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }

        assertEquals("708", builder.toString());
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(0);

        ListNode node2 = new ListNode(0);

        ListNode node = Main.addTwoNumbers(node1, node2);

        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }

        assertEquals("0", builder.toString());
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(9);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);

        ListNode node2 = new ListNode(9);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);

        ListNode node = Main.addTwoNumbers(node1, node2);

        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }

        assertEquals("89990001", builder.toString());
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(9);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);
        node1 = new ListNode(9, node1);

        ListNode node2 = new ListNode(9);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);
        node2 = new ListNode(9, node2);

        ListNode node = Main.addTwoNumbers(node1, node2);

        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }

        assertEquals("89990001", builder.toString());
    }
}