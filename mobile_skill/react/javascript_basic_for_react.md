# Javascript Basic for React

## 1. Cấu trúc và cú pháp cơ bản

### a. Khai báo biến

Có thể dùng các từ khóa `let`, `const` hoặc `var` để khai báo biến trong
Javascript.

### b. Kiểu dữ liệu

Các kiểu dữ liệu cơ bản:\
`string`, `number`, `object (Map)`, `array`, `undefined`, `null`,
`symbol`, `bigint`.

-   **undefined**: có nghĩa là chưa được gán giá trị nào cả. Ví dụ:
    -   Khai báo biến không có giá trị.
    -   Truy cập một phần tử không có trong object.
    -   Một hàm không có `return`.
-   **null**: giá trị của nó là `null`, biểu thị biến đó không có giá
    trị.

### c. Toán tử số học (Arithmetic)

``` js
5 + 3        // 8
10 - 2       // 8
2 * 4        // 8
16 / 2       // 8
17 % 3       // 2   (phần dư)
2 ** 3       // 8   (2^3)

'5' + 3      // "53" (nối chuỗi vì có string)
'5' - 3      // 2    (ép kiểu sang number)
```

Javascript sẽ cố ép kiểu `string` sang `number` trước khi thực hiện các
phép toán trừ phép cộng (vì `+` là nối chuỗi).\
Khi không thể ép kiểu số được, phép toán sẽ trả về **NaN** (Not a
Number).

Ép kiểu trong Javascript: - `null` → `0` - `false` → `0` - `true` →
`1` - `undefined` → không thể ép kiểu về number.

### Toán tử logic `||` và `&&`

-   `a || b`: trả về giá trị đầu tiên **truthy**, nếu không có thì trả
    về giá trị cuối cùng.
-   `a && b`: trả về giá trị đầu tiên **falsy**, nếu không có thì trả về
    giá trị cuối cùng.

**Truthiness/Falsiness**\
- **Truthy**: giá trị có tồn tại, không rỗng. - **Falsy**: giá trị không
tồn tại hoặc rỗng (`0`, `""`, `null`, `undefined`, `false`, `NaN`).

------------------------------------------------------------------------

## 2. Hàm mũi tên (Arrow Function)

Cú pháp hiện đại của hàm:

``` js
// Truyền thống
function abc() {}

// Hiện đại
const abc = () => {}
```

Nếu hàm chỉ có **một dòng return**, ta có thể bỏ `{}` và từ khóa
`return`:

``` js
const sum = (a, b) => a + b;
```

------------------------------------------------------------------------

## 3. Import và Export

### Export

Có 2 kiểu: - **Default export**: dùng khi chỉ export một phần tử.
`js   export default Page;` - **Named export**: dùng khi export nhiều
phần tử. `js   export { Page, Home };`

### Import

-   **Default import** (không cần `{}`):

    ``` js
    import Page from "./Page";
    ```

-   **Named import** (phải có `{}`):

    ``` js
    import { Page, Home } from "./Page";
    ```

> Với **default export**, có thể đổi tên khi import.\
> Với **named export**, tên phải chính xác như khi export.

------------------------------------------------------------------------

## 4. Toán tử ba ngôi và JSX logic

### Toán tử ba ngôi

``` js
isLogin ? <p>Welcome</p> : <p>Please login</p>;
```

### Toán tử `&&` và `||` trong JSX

-   `isLogin && <p>Hello</p>` → render `<p>` nếu `isLogin` là truthy.\
-   `!isLogin || <p>Guest</p>` → render `<p>` nếu `isLogin` là falsy.\
-   `??` → dùng khi giá trị là `null` hoặc `undefined`.

------------------------------------------------------------------------

## 5. Object (Giống Map trong Dart)

Khai báo với cặp `key: value`.

### a. Destructuring (Bóc tách)

``` js
const { age, className } = cat;
```

> Tên biến phải trùng với key trong object.

### b. Shorthand property

Nếu key và value trùng nhau, có thể viết gọn:

``` js
const person = { name, age };
```

### c. Boolean shorthand

Nếu giá trị là `true`, chỉ cần ghi key:

``` js
const options = { darkMode };
```

### d. Spread operator

Sao chép hoặc gộp object/array:

``` js
const cat2 = { ...cat1, b: 1 };
```

> Nếu key trùng thì ghi đè, nếu khác thì thêm mới.

------------------------------------------------------------------------

## 6. Làm việc với mảng (Array)

### `map()`

Dùng để vẽ danh sách JSX hoặc tạo mảng mới:

``` js
numbers.map(num => <p>{num}</p>);
```

### `filter()`

Dùng để lọc phần tử:

``` js
numbers.filter(num => num > 5);
```

> Khi viết code JS trong JSX, đặt trong `{}`.

------------------------------------------------------------------------

## 7. Xử lý bất đồng bộ (Promise & Async/Await)

### Promise

Đại diện cho kết quả tương lai. Có 3 trạng thái: - **pending** (đang xử
lý) - **fulfilled** (hoàn tất) - **rejected** (lỗi)

``` js
fetch(url)
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));
```

### Async/Await

Cú pháp dễ đọc hơn Promise:

``` js
const fetchData = async () => {
  try {
    const response = await fetch(url);
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
};
```

> Khi gọi nhiều API song song, dùng `Promise.allSettled([])` để xử lý
> nhanh hơn.

------------------------------------------------------------------------

*© Tổng hợp kiến thức JavaScript cơ bản cho React --- viết lại mạch lạc,
dễ hiểu, trực quan.*
