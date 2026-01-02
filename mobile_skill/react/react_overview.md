# 🧩 React, React Native & TypeScript Overview

## ⚛️ React – JavaScript

### 🔹 Khái niệm
React là **một thư viện JavaScript** do **Facebook phát triển**, được sử dụng để **xây dựng giao diện người dùng (UI)** cho website.  
Nó giúp tạo ra các giao diện web **hiện đại**, được **chia nhỏ thành các khối** gọi là **Component**, giúp dễ dàng bảo trì và mở rộng.

### 🧠 Tư duy chính
React có tư duy tương tự **Flutter**:
- Trong React: mọi thứ là **Component**.  
- Trong Flutter: mọi thứ là **Widget**.  
Các Component/Widget được **tổ hợp và kết hợp** với nhau để tạo thành **một giao diện hoàn chỉnh**.

### 💡 Ví dụ đơn giản
```jsx
function App() {
  return (
    <div>
      <h1>Hello, Hoàng!</h1>
      <button>Click me</button>
    </div>
  );
}

export default App;
```

---

## 📱 React Native

### 🔹 Khái niệm
**React Native** là một **framework** cho phép tạo ứng dụng di động cho **Android** và **iOS** bằng **JavaScript hoặc TypeScript**,  
thay vì phải học **Swift** (iOS) hay **Kotlin/Java** (Android).

### ⚙️ Cơ chế hoạt động
React Native **không tự vẽ giao diện**, mà dùng một **bridge (cầu nối)** để gọi tới **UI gốc (native)** của hệ điều hành.

Ví dụ:
- Khi bạn dùng thẻ `<Button>`, React Native sẽ **gọi đến button native** tương ứng trên Android hoặc iOS.

---

## 💬 TypeScript

### 🔹 Khái niệm
**TypeScript (TS)** là **phiên bản mở rộng của JavaScript**, được phát triển bởi Microsoft.  
Nó **thêm hệ thống kiểu dữ liệu (type system)** cho JavaScript.

### ⚠️ Vấn đề của JavaScript
JavaScript **không có kiểm tra kiểu tĩnh** — biến có thể thay đổi kiểu trong quá trình chạy, gây lỗi tiềm ẩn.

Ví dụ:
```js
let value = "hello"; // string
value = 123;         // bây giờ là number
```
Điều này khiến code **dễ sai** mà **không báo lỗi** khi biên dịch.

### ✅ Giải pháp của TypeScript
TypeScript cho phép bạn:
- **Khai báo kiểu rõ ràng** (`string`, `number`, `boolean`, v.v.)
- **Kiểm tra lỗi khi biên dịch**  
- **Tăng độ an toàn và dễ bảo trì code**

---

## 📦 NPM vs NPX

| Công cụ | Chức năng chính | Giải thích |
|----------|------------------|-------------|
| **NPM** | Trình **quản lý gói (package manager)** | Dùng để **cài đặt**, **gỡ bỏ**, và **quản lý phiên bản** của các package. Cũng có thể chạy các script trong `package.json`. |
| **NPX** | Trình **chạy gói (package runner)** | Cho phép **chạy trực tiếp** một package từ npm registry **mà không cần cài đặt trước**. |

### 💡 Ví dụ:
```bash
# Cài đặt một package bằng npm
npm install react

# Chạy một package tạm thời bằng npx
npx create-expo-app myApp
```

---

## 📝 Sự khác nhau giữa `.ts` và `.tsx`

| File | Mô tả | Dùng khi |
|------|--------|-----------|
| **`.ts`** | File **TypeScript thuần**, chỉ chứa logic (hàm, lớp, kiểu dữ liệu, v.v.) | Không có JSX/React |
| **`.tsx`** | File **TypeScript + JSX**, cho phép viết HTML-like trong code | Dùng cho React Component (UI) |

### 🔹 Ví dụ `.ts`
```ts
export function sum(a: number, b: number): number {
  return a + b;
}
```

### 🔹 Ví dụ `.tsx`
```tsx
import React from "react";
import { Text, View } from "react-native";

export default function App() {
  return (
    <View>
      <Text>Hello React Native!</Text>
    </View>
  );
}
```

---

## ✅ Tóm tắt

| Công nghệ | Vai trò chính | Ngôn ngữ |
|------------|----------------|-----------|
| **React** | Xây dựng UI cho web | JavaScript |
| **React Native** | Xây dựng ứng dụng di động (Android/iOS) | JavaScript / TypeScript |
| **TypeScript** | Mở rộng JavaScript, thêm kiểm tra kiểu | TypeScript |
| **NPM** | Cài đặt & quản lý package | CLI tool |
| **NPX** | Chạy package tạm thời mà không cài đặt | CLI tool |
| **.ts** | TypeScript logic | Không có JSX |
| **.tsx** | TypeScript + JSX (UI component) | Có JSX |

---

> ✨ *React giúp bạn chia nhỏ UI thành component; React Native giúp bạn mang React lên mobile; TypeScript giúp code của bạn an toàn và dễ bảo trì hơn.*
