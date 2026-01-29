# Biến và Kiểu Dữ Liệu trong Java (Variables & Data Types)

Tài liệu này cung cấp hướng dẫn toàn diện về cách quản lý dữ liệu trong Java, từ việc khai báo biến cơ bản đến sự khác biệt cốt lõi giữa các kiểu dữ liệu trong bộ nhớ.

---

## 1. Biến (Variables)

Biến là tên gọi của một vùng nhớ dùng để lưu trữ dữ liệu. Trong Java, là ngôn ngữ định kiểu tĩnh (statically typed), mỗi biến bắt buộc phải được khai báo với một **Kiểu Dữ Liệu** cụ thể trước khi sử dụng.

### Cú pháp khai báo
```java
// Cú pháp: <Kiểu_Dữ_Liệu> <Tên_Biến> = <Giá_Trị_Ban_Đầu>;

int age = 22;               // Khai báo và khởi tạo
String name;                // Khai báo trước
name = "Antigravity";       // Khởi tạo sau
final double PI = 3.14159;  // Hằng số (không thể thay đổi)
```

### Quy tắc đặt tên (Naming Convention)
- **camelCase**: Dùng cho tên biến và phương thức (ví dụ: `studentName`, `totalPrice`).
- **UPPER_SNAKE_CASE**: Dùng cho hằng số (`MAX_VALUE`, `CONNECTION_STRING`).
- **Phân biệt hoa thường**: `score` và `Score` là hai biến khác nhau.

---

## 2. Phân loại Kiểu Dữ Liệu (Data Types Categorization)

Trong Java, kiểu dữ liệu được chia làm 2 nhóm chính:

1.  **Primitive Types (Kiểu nguyên thủy)**: Chứa giá trị đơn giản.
2.  **Reference Types (Kiểu tham chiếu)**: Chứa địa chỉ trỏ tới đối tượng phức tạp.

---

## 3. Kiểu Dữ Liệu Nguyên Thủy (Primitive Types)

Java có 8 kiểu nguyên thủy. Chúng được tối ưu hóa cho hiệu suất và lưu trữ dữ liệu cơ bản.

| Kiểu | Kích thước | Giá trị mặc định | Mô tả | Ví dụ |
| :--- | :--- | :--- | :--- | :--- |
| **byte** | 8-bit | 0 | Số nguyên rất nhỏ (-128 đến 127) | `byte b = 100;` |
| **short** | 16-bit | 0 | Số nguyên nhỏ | `short s = 30000;` |
| **int** | 32-bit | 0 | **Số nguyên mặc định** | `int count = 10;` |
| **long** | 64-bit | 0L | Số nguyên lớn (cần hậu tố `L`) | `long population = 8000000000L;` |
| **float** | 32-bit | 0.0f | Số thực, độ chính xác thấp (cần `f`) | `float price = 10.5f;` |
| **double** | 64-bit | 0.0d | **Số thực mặc định**, độ chính xác cao | `double pi = 3.14159;` |
| **char** | 16-bit | '\u0000' | Ký tự Unicode đơn (dùng nháy đơn) | `char grade = 'A';` |
| **boolean** | 1 bit* | false | Logic đúng/sai | `boolean isActive = true;` |

---

## 4. Kiểu Dữ Liệu Tham Chiếu (Reference Types)

Bất kỳ thứ gì không phải là 8 kiểu nguyên thủy ở trên đều là kiểu tham chiếu. Chúng bao gồm:
- **String** (Chuỗi ký tự)
- **Array** (Mảng)
- **Class/Object** (Các lớp do người dùng định nghĩa hoặc thư viện có sẵn)
- **Interface**

```java
String message = "Hello World";
int[] numbers = {1, 2, 3};
Date today = new Date();
```

---

## 5. CƠ CHẾ HOẠT ĐỘNG: Primitive vs Reference (Quan Trọng)

Để hiểu sâu sắc, ta cần nhìn vào cách Java quản lý bộ nhớ: **Stack** và **Heap**.

### Cơ chế bộ nhớ
*   **Stack Memory (Ngăn xếp):** Tốc độ truy xuất rất nhanh, dùng để lưu các biến cục bộ và **giá trị** của kiểu nguyên thủy.
*   **Heap Memory (Vùng nhớ Heap):** Vùng nhớ lớn hơn, dùng để lưu trữ các **Đối tượng (Objects)** thực sự.
*   Đơn giản nguyên thuỷ giống như tiền nó là giá trị thuần tuý và độc lập với nhau còn kiểu tham chiếu thì giống cái ví nó chứa tiền và các ngăn đựng thẻ mở rộng khác 

### So sánh chi tiết

#### A. Kiểu Nguyên Thủy (Primitive)
*   **Lưu trữ:** Giá trị thực sự được lưu trực tiếp trong bộ nhớ **Stack** tại vị trí của biến.
*   **Gán giá trị:** Khi gán `int a = b`, Java **sao chép giá trị** của `b` sang `a`. Hai biến hoàn toàn độc lập.

**Ví dụ Minh Họa:**
```java
int x = 10;
int y = x;  // Copy giá trị 10 sang y
y = 20;     // Thay đổi y thành 20

// KẾT QUẢ: x vẫn là 10. Việc thay đổi y KHÔNG ảnh hưởng x.
System.out.println(x); // Output: 10
System.out.println(y); // Output: 20
```

#### B. Kiểu Tham Chiếu (Reference)
*   **Lưu trữ:**
    *   Biến (nằm ở **Stack**): Chỉ lưu **địa chỉ bộ nhớ** (ví dụ: `0x1A2B`) trỏ tới đối tượng.
    *   Đối tượng thực (nằm ở **Heap**): Chứa dữ liệu thực sự (ví dụ: nội dung mảng, thuộc tính object).
*   **Gán giá trị:** Khi gán `Arr1 = Arr2`, Java **sao chép địa chỉ**. Cả hai biến bây giờ cùng trỏ vào **MỘT** đối tượng trong Heap.

**Ví dụ Minh Họa:**
```java
int[] arrA = {1, 2, 3};
int[] arrB = arrA;      // Copy ĐỊA CHỈ (tham chiếu) của arrA sang arrB
                        // Bây giờ cả arrA và arrB cùng "nhìn" vào một mảng trong Heap

arrB[0] = 99;           // Thay đổi phần tử đầu tiên thông qua arrB

// KẾT QUẢ: arrA cũng bị thay đổi theo! Vì chúng chung nhau một object.
System.out.println(arrA[0]); // Output: 99 (KHÔNG PHẢI 1)
System.out.println(arrB[0]); // Output: 99
```

### Tóm tắt sự khác biệt

| Đặc điểm | Primitive Type | Reference Type |
| :--- | :--- | :--- |
| **Nội dung biến chứa** | Giá trị thực (`10`, `true`, `'A'`) | Địa chỉ bộ nhớ (`0xAF...`) |
| **Nơi lưu dữ liệu** | Stack | Đối tượng thực ở Heap |
| **Phép gán (`=`)** | Sao chép giá trị (Copy Value) | Sao chép địa chỉ (Copy Reference) |
| **Ảnh hưởng lẫn nhau** | Độc lập hoàn toàn | Có thể ảnh hưởng (Side-effect) |
| **Giá trị `null`** | Không thể gán `null` | Có thể nhận giá trị `null` |

---

## 6. Ví Dụ Tổng Hợp (Real-world Example)

Dưới đây là ví dụ mô phỏng một hệ thống game đơn giản để thấy rõ sự khác biệt.

```java
import java.util.Arrays;

class Player {
    String name;         // Reference type (Object)
    int level;           // Primitive type
    int[] inventory;     // Reference type (Mảng)

    public Player(String name, int level, int[] inventory) {
        this.name = name;
        this.level = level;
        this.inventory = inventory;
    }
}

public class GameDataFlow {
    public static void main(String[] args) {
        // --- Phần 1: Primitives (Độc lập) ---
        int baseHealth = 100;
        int currentHealth = baseHealth; // Copy giá trị
        
        currentHealth -= 20; // Bị đánh trúng

        System.out.println("1. Primitive Check:");
        System.out.println("Base Health: " + baseHealth);       // 100 (Không đổi)
        System.out.println("Current Health: " + currentHealth);   // 80
        System.out.println("-----------------------------");

        // --- Phần 2: References (Chia sẻ) ---
        int[] starterItems = {1, 1, 0, 0}; // 1: Potion, 0: Empty
        
        Player p1 = new Player("Hero", 1, starterItems);
        
        // p2 là đồng đội, muốn xem và sắp xếp túi đồ của p1
        // SAI LẦM: Gán trực tiếp khiến p2 dùng chung túi đồ với p1
        int[] viewedInventory = p1.inventory; 
        
        // p2 sắp xếp lại túi đồ (tưởng là bản copy để xem)
        viewedInventory[2] = 5; // Vô tình thêm item vào slot 3

        System.out.println("2. Reference Check:");
        System.out.println("P1 Inventory (Gốc): " + Arrays.toString(p1.inventory));
        // Output: [1, 1, 5, 0] -> Bị thay đổi bất ngờ!
        
        // --- Cách khắc phục (Clone) ---
        // Muốn một bản sao độc lập? Phải tạo object mới
        int[] safeCopy = p1.inventory.clone(); 
        safeCopy[0] = 999;
        
        System.out.println("After Clone Check:");
        System.out.println("P1 Inventory (Gốc): " + Arrays.toString(p1.inventory)); 
        // Vẫn giữ nguyên [1, 1, 5, 0], không bị ảnh hưởng bởi safeCopy
    }
}
```