package com.hquiz.medium;

/*
Vấn đề: Cho 2 danh sách linked list đều chứa số nguyên không âm, có độ dài khác nhau. List được lưu theo cấu trúc thứ tự ngược
tức là hàng đơn vị nằm ở đầu danh sách hàng chục và các hàng còn lại nằm ở sau danh sách.

==> Nhiệm vụ: Thực hiện phép cộng 2 số đó với nhau đầu ra trả về một linked list cũng theo thứ tự ngược 

=====> Solution 1: Dùng một vòng lặp while để duyệt qua 2 list điều kiện dừng: khi cả 2 list đều rỗng không còn phần tử
Lặp qua từng phần tử của list tính tổng nếu tổng đó lớn hơn hoặc bằng 10 thì lấy đơn vị nối vào list kết quả 
hàng chục thì lưu vào biến temp. Cứ thế tiếp tục cộng tổng các số còn lại trong list với temp đến khi hết thì thôi. 
Lúc này check nếu temp > 0 thì nối temp vào cuối của list kết quả nếu không thì thôi 

Độ phức tạp thời gian: O(max(m,n)), với m,n là độ dài của hai danh sách. Bạn chỉ duyệt qua mỗi danh sách đúng một lần.
Độ phức tạp không gian: O(max(m,n)), vì danh sách kết quả cũng cần bộ nhớ để lưu trữ và kích thước của nó phụ thuộc vào độ dài của hai danh sách. 

*/


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Tạo một node giả để lưu trữ danh sách kết quả
        ListNode currentNode = dummy; // Tạo một con trỏ đến node giả hiện tại
        int temp = 0; // Tạo biến lưu hàng chục
        // Lặp đến khi cả 2 list rỗng và temp !=0 thì thôi vì nếu temp !=0 tức là vẫn còn số dư cần được nối vào next sau list kết quả cuối cùng 
        while (l1 != null || l2 != null || temp != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + temp;
            temp = sum / 10; 
            currentNode.next = new ListNode(sum % 10); // nối current với kết quả hàng đơn vị mới 
            currentNode = currentNode.next; // dịch chuyển current sang node tiếp theo 
            /// di chuyển con trỏ l1 và l2 sang node tiếp theo
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummy.next; 
    }
}
