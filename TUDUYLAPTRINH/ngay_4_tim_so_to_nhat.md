Tìm số lớn nhất trong 3 số a,b,c; 

1. Gán max = a; 
2. So sánh max với b,c nếu max <b thì max = b. Tương tự như với c


Cách 2: So sánh a và b rồi lấy số lớn hơn so sánh với c là được 

Cách 3: Sắp xếp các phần tử này vào một list rồi lấy phần tử đầu hoặc cuối tuỳ vào sắp xếp tăng hay giảm dần 


public static void C1 (){
 max = a;
 if(max < b ) {
    max = b;
 }else if(max <c ) {
    max = c; 
 }


 // cách 2;
 max = 0;
 if(a>b){
    max = a;
 }else {
    max = b; 
 }
 if(max < c){
    max = c;
 }

}