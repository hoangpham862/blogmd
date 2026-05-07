package com.hquiz.easy;

/*
Problem: Cho một số nguyên x, trả về true nếu x là số đối xứng (palindrome), ngược lại trả về false

ví dụ : 
121 là palindrome => true
-121 không phải palindrome => false
10 không phải palindrome => false

==> Solution 1: Đơn giản chuyển số thành chuỗi rồi đảo ngược chuỗi đó xem có giống nhau không 

==> Solution 2: Chúng ta sẽ chơi trò bóc tách số nguyên ra: phần đơn vị và phần hàng chục (cưa đôi số)
- Chúng ta sẽ bóc dần từng số phần đơn vị cho vào biến tạm, số ban đầu bỏ đi 1 số hàng đơn vị tương ứng 
- Khi nào số ban đầu nhỏ hơn số tạm thì dừng lại
- trả về true với 1 trong 2 trường hợp: số ban đầu bằng số tạm 
hoặc số tạm bỏ đi một chữ số hàng đơn vị thì bằng số ban đầu: Cái này là trong trường hợp đối xứng qua một tâm 



*/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10 ==0 && x!=0)) return false;
        // String input = String.valueOf(x);
        // String input2 = new StringBuilder(input).reverse().toString();
        // if(input.equals(input2)) return true;
        // return false;

        int temp = 0;
        while(x>temp){
            // lấy hàng đơn vị của x làm số mới
            temp = temp*10 + x%10;
            // lấy các chữ số hàng chục của x sau mỗi vòng 
            x/=10;
        }
        return x==temp || temp/10 == x; // trường hơn đối xứng ví đụ 124 , 12

    }
}
