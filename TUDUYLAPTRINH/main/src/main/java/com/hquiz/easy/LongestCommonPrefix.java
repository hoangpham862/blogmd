package com.hquiz.easy;

import java.util.Arrays;

/*
==> Problem: Viết một hàm tìm chuỗi tiền tố chung dài nhất của các chuỗi trong mảng.

====> Solution1: Đơn giản là sort mảng đó sau đó so sánh các phần tử đầu và cuối của mạng là đc 

====> Solution2: Coi phần tử đầu tiên trong mảng là tiền tố cần tìm, Viết một vòng lặp xuyên qua các phần tử 
còn lại của mảng trong vòng lặp đó so sánh chuỗi Prefix với chuỗi trong mảng nếu không prefix không khớp 
thì cắt một ký tự cuối của Prefix cho đến khi khớp thì thôi. Đã có kết quả thì dừng lại và trả về. Hành động
này được lặp cho đến hết phần tử của mảng

====> Solution 3: Chúng ta sẽ xử dụng vét cạn 2 vòng for lồng nhau duyệt qua từng phần tử của list
tại vòng for đầu tiên lấy ký tự ở phần tử đầu chuỗi tại vị trí i
tại vòng for thứ 2 lặp từ phần tử thứ 2 trong mảng so sánh với ký tự tại j và i với nhau.
Trả ra kết quả khi hết vòng for hoặc nếu chuỗi j nhỏ hơn ký tự vị trí i hoặc là ký tự tại vị trí j khác ký tự tại j 




*/
public class LongestCommonPrefix {

    public String solution1(String[] strs) {
        Arrays.sort(strs);
        if (strs.length == 0)
            return "";
        String first = strs[0];
        String last = strs[strs.length - 1];
        String result = "";
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                result += first.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }
    /// chuỗi phải bắt đầu tiền tố chung nhất prefix
    
    public String solution2(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // tiền tố lên index phải là 0 
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    
    /// 
    public String solution3(String[] strs) {
        if (strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    
}
