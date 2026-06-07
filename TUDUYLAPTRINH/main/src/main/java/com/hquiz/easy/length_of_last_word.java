package com.hquiz.easy;
/*
Problem: Tìm chiều dài của từ cuối trong chuỗi bỏ qua dấu cách các từ


===> Solution: Lọc từ cuối chuỗi trở về trước khi gặp ký tự khác space đầu tiên đánh dấu break = true, 
và cộng 1 vào trong biến tạm. Khi đến dấu cách tiếp theo trong chuỗi thì break trả ra kết quả.

===> Solution 2: Dùng hàm có sẵn của Java ta chuyển chuỗi thành mảng không chứa dấu cách. lấy phần tử cuối 
và tính length của chuỗi đó 

*/

public class length_of_last_word {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        int l = 0;
        boolean skip = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                skip = true;
                l += 1;
            } else if (skip) {
                break;
            }

        }
        return l;
    }

    public int lengthOfLastWord2(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}
