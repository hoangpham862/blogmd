package com.hquiz.easy;
/*
Vấn đề: Ghép 2 linked list đã sắp xếp lại với nhau và trả về phần tử đầu tiên của linked list đã sắp xếp đó


==> Solution 1: Tạo một dummy node để lưu trữ linked list đã sắp xếp. Không quan tâm giá trị của phần tử này là gì. 
Một con trỏ để các phần tử luôn được nối tiếp vào nhau trong dummy node không làm sáo trộn trật tự 

Lặp tiếp cho đến khi một trong 2 LinkedList rỗng thì dừng vòng lặp. Trong quá trình lặp qua các phần tử trong list ta so sánh giá trị của 2 phần tử lấy 
từ 2 list. Nếu phần tử của list 1 nhỏ hơn hoặc bằng phần tử của list 2 thì ta nối next của con trỏ đến phần tử 1 đó và dịch chuyển list 1 sang phần tử tiếp theo 
trong list đó. Tiếp tục so sánh và làm tương tự với list 2. 

==> Khi một trong 2 list rỗng thì ta nối tiếp con trỏ đến phần tử còn lại của một trong 2 list đó (tham chiếu đến phần tử tiếp theo và các phần tử 
còn lại trong list đó nó đã được sắp xếp đúng theo thứ tự)
Cuối cùng ta trả về dummy.next loại bỏ phần tử dummy với giá trị mình khởi tạo đầu tiên không quan tâm. 

Độ phức tạp thuật toán: O(n)
Độ phức tạp không gian: O(1)

 ví dụ thực tế: list 1 [1,2,4] list 2 [1,3,4] 
 dummny = 0, current = 0; 
 vòng lặp đầu tiên: list1.val = 1, list2.val = 1
 check if list1.val <= list2.val ==> true => nối phần tử list 1 và next của current , dịch chuyển current sang phần tử vừa nối 
 tiếp tục vòng lặp tương tự với các vòng lặp tiếp theo 
 cuối cùng nối phần tử còn lại của list 1 hoặc list 2 vào dummy.next = list 1 hoặc 2
cuối cùng trả về dummy.next loại bỏ phần tử dummy với giá trị mình khởi tạo đầu tiên không quan tâm. 
vì sao lại là dummy.next mà không phải current nhỉ. Đơn giả là vì khi bắt đầu thì cả 2 thằng đều tham chiếu đến phần tử dummy mình khởi tạo lúc đầu tiên 
khi vòng lặp đầu tiên xảy ra thì phần tử đầu tiên chúng ta tạo ra đó .next đã tham chiếu đến một phần tử khác của 1 trong 2 list đó
và khi xong thì current nó đã nhảy sang phần tử vừa gán đó mất rồi nên lúc này dummy vẫn tham chiếu đến phần tử đầu tiên chúng ta tạo ra đó và next của nó là 
head của list đã sắp xếp current đóng vai trò như quản tàu đi tìm các toa để nối đầu tiên nối dây vào toa rồi nhảy sang toa đó để tìm tao nối tiếp

 

*/



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLinkedList {
   
    public static ListNode mergeTwoSortedLinkedList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if(list1.val  <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return dummy.next;  
        
    }
    
}
