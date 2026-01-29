package com.hquiz.easy;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedLinkedListTest {

    // Helper method to create a linked list from an array
    private ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to a List<Integer> for easy comparison
    private List<Integer> linkedListToList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    @Test
    public void testMerge_BothEmpty() {
        ListNode l1 = createLinkedList(new int[]{});
        ListNode l2 = createLinkedList(new int[]{});
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertTrue(linkedListToList(result).isEmpty(), "Cả hai danh sách trống");
    }

    @Test
    public void testMerge_OneEmpty() {
        ListNode l1 = createLinkedList(new int[]{});
        ListNode l2 = createLinkedList(new int[]{1, 2, 3});
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertEquals(List.of(1, 2, 3), linkedListToList(result), "Danh sách 1 trống");

        l1 = createLinkedList(new int[]{4, 5, 6});
        l2 = createLinkedList(new int[]{});
        result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertEquals(List.of(4, 5, 6), linkedListToList(result), "Danh sách 2 trống");
    }

    @Test
    public void testMerge_Basic() {
        ListNode l1 = createLinkedList(new int[]{1, 2, 4});
        ListNode l2 = createLinkedList(new int[]{1, 3, 4});
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertEquals(List.of(1, 1, 2, 3, 4, 4), linkedListToList(result), "Trường hợp cơ bản");
    }

    @Test
    public void testMerge_SingleElements() {
        ListNode l1 = createLinkedList(new int[]{1});
        ListNode l2 = createLinkedList(new int[]{2});
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertEquals(List.of(1, 2), linkedListToList(result), "Mỗi danh sách có 1 phần tử");
    }

    @Test
    public void testMerge_DifferentLengths() {
        ListNode l1 = createLinkedList(new int[]{1, 5});
        ListNode l2 = createLinkedList(new int[]{2, 3, 4, 6, 7});
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), linkedListToList(result), "Độ dài khác nhau");
    }

    @Test
    public void testMerge_NegativeValues() {
        ListNode l1 = createLinkedList(new int[]{-10, -5, 0});
        ListNode l2 = createLinkedList(new int[]{-8, -2, 5});
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        assertEquals(List.of(-10, -8, -5, -2, 0, 5), linkedListToList(result), "Giá trị âm");
    }

    @Test
    public void testMerge_BoundaryAndConstraints() {
        // Constraints: 0 <= nodes <= 50, -100 <= val <= 100
        int[] vals1 = new int[50];
        int[] vals2 = new int[50];
        for (int i = 0; i < 50; i++) {
            vals1[i] = -100 + i; // -100 to -51
            vals2[i] = 51 + i;    // 51 to 100
        }
        ListNode l1 = createLinkedList(vals1);
        ListNode l2 = createLinkedList(vals2);
        ListNode result = MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(l1, l2);
        
        List<Integer> actual = linkedListToList(result);
        assertEquals(100, actual.size());
        assertEquals(-100, actual.get(0));
        assertEquals(100, actual.get(99));
    }
}
