package com.hquiz.easy;

/*
Problem: Cho 2 chuỗi là s và t, tìm vị trí đầu tiên mà chuỗi t xuất hiện trong s nếu không thấy thì trả về -1


===> Solution: Sử dụng kỹ thuật cửa số trượt ta di chuyển cửa sổ tìm kiếm trên chuỗi chính nếu tìm thấy trả về index 
nếu không tìm thấy thì trả vê -1

*/

public class find_index_first_occurrence {
    // Dùng kỹ thuật cửa sổ trượt tìm các chuỗi con từ s có độ dài bằng t thỏa mãn
    // điều kiện return kết quả luôn
    public int strStr(String s, String t) {
        for (int i = 0, j = t.length(); j < s.length(); i++, j++) {
            if (s.substring(i, j).equals(t))
                return i;
        }
        return -1;
    }

}
