class Main {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // if (l1 == null || l2 == null) return

        ListNode root;
        ListNode newNode;
        int sum = l1.val + l2.val;
        int temp = sum / 10;
        newNode = new ListNode(sum % 10);
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + temp;
            temp = sum / 10;
            newNode = new ListNode(sum % 10, newNode);

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            while (l2 != null) {
                sum = l2.val + temp;
                temp = sum / 10;
                newNode = new ListNode(sum % 10, newNode);

                l2 = l2.next;
            }
        } else if (l2 == null) {
            while (l1 != null) {
                sum = l1.val + temp;
                temp = sum / 10;
                newNode = new ListNode(sum % 10, newNode);

                l1 = l1.next;
            }
        }

        if (temp != 0) {
            newNode = new ListNode(temp, newNode);
        }


        root = new ListNode(newNode.val);
        newNode = newNode.next;
        while (newNode != null) {
            root = new ListNode(newNode.val, root);
            newNode = newNode.next;
        }

        return root;
    }
}