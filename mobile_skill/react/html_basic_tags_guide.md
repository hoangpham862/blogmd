# 📘 Hướng dẫn thẻ HTML cơ bản

HTML (HyperText Markup Language) là ngôn ngữ đánh dấu dùng để tạo cấu
trúc cho trang web. Dưới đây là danh sách các **thẻ HTML cơ bản** được
sử dụng nhiều nhất kèm ví dụ.

------------------------------------------------------------------------

## 🧱 1. Thẻ cấu trúc chính

  ----------------------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ ---------------------------------------
  `<html>`          Gốc của tài liệu HTML    `<html>...</html>`

  `<head>`          Chứa thông tin meta,     `<head><title>My Page</title></head>`
                    title, link CSS, script  

  `<body>`          Chứa nội dung hiển thị   `<body><h1>Hello</h1></body>`
                    chính                    
  ----------------------------------------------------------------------------------

------------------------------------------------------------------------

## 📝 2. Tiêu đề và đoạn văn

  Thẻ                 Mô tả                     Ví dụ
  ------------------- ------------------------- -------------------------------
  `<h1>` đến `<h6>`   Tiêu đề, từ lớn đến nhỏ   `<h1>Tiêu đề lớn</h1>`
  `<p>`               Đoạn văn bản              `<p>Đây là một đoạn văn.</p>`
  `<br>`              Xuống dòng                `Xin chào<br>Thế giới!`
  `<hr>`              Đường kẻ ngang            `<hr>`

------------------------------------------------------------------------

## 🔤 3. Văn bản định dạng

  -----------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ ----------------------------
  `<b>` /           Chữ đậm                  `<b>Chữ đậm</b>`
  `<strong>`                                 

  `<i>` / `<em>`    Chữ nghiêng              `<i>Chữ nghiêng</i>`

  `<u>`             Gạch chân                `<u>Gạch chân</u>`

  `<small>`         Chữ nhỏ                  `<small>Nhỏ</small>`

  `<mark>`          Tô sáng                  `<mark>Tô vàng</mark>`

  `<sup>` / `<sub>` Chỉ số trên/dưới         `x<sup>2</sup>` hoặc
                                             `H<sub>2</sub>O`
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## 📸 4. Hình ảnh và liên kết

  --------------------------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ -------------------------------------------
  `<img>`           Hiển thị hình ảnh        `<img src="image.jpg" alt="Mô tả">`

  `<a>`             Liên kết (hyperlink)     `<a href="https://google.com">Google</a>`
  --------------------------------------------------------------------------------------

------------------------------------------------------------------------

## 📋 5. Danh sách

  Thẻ      Mô tả                    Ví dụ
  -------- ------------------------ ---------------------------------
  `<ul>`   Danh sách không thứ tự   `<ul><li>A</li><li>B</li></ul>`
  `<ol>`   Danh sách có thứ tự      `<ol><li>1</li><li>2</li></ol>`
  `<li>`   Mục trong danh sách      `<li>Một mục</li>`

------------------------------------------------------------------------

## 🧩 6. Bảng dữ liệu

  Thẻ         Mô tả       Ví dụ
  ----------- ----------- ----------------------
  `<table>`   Tạo bảng    `<table>...</table>`
  `<tr>`      Hàng        `<tr>...</tr>`
  `<th>`      Ô tiêu đề   `<th>Tên</th>`
  `<td>`      Ô dữ liệu   `<td>Giá trị</td>`

Ví dụ:

``` html
<table border="1">
  <tr>
    <th>Tên</th>
    <th>Tuổi</th>
  </tr>
  <tr>
    <td>Hoàng</td>
    <td>25</td>
  </tr>
</table>
```

------------------------------------------------------------------------

## 🧮 7. Biểu mẫu (Forms)

  ------------------------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ -----------------------------------------
  `<form>`          Tạo biểu mẫu nhập liệu   `<form>...</form>`

  `<input>`         Ô nhập liệu              `<input type="text" placeholder="Tên">`

  `<label>`         Nhãn cho input           `<label for="name">Tên:</label>`

  `<textarea>`      Ô nhập nhiều dòng        `<textarea rows="4"></textarea>`

  `<button>`        Nút bấm                  `<button>Gửi</button>`

  `<select>`        Danh sách chọn           `<select><option>A</option></select>`

  `<option>`        Một lựa chọn trong       `<option>Giá trị</option>`
                    `<select>`               
  ------------------------------------------------------------------------------------

------------------------------------------------------------------------

## 🧱 8. Thẻ bố cục (layout)

  --------------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ -------------------------------
  `<div>`           Khối chứa nội dung       `<div>Khối</div>`
                    (block)                  

  `<span>`          Nhóm nội dung nhỏ        `<span>Văn bản</span>`
                    (inline)                 

  `<header>` /      Phần đầu/cuối trang      `<header>Tiêu đề</header>`
  `<footer>`                                 

  `<section>`       Khu vực nội dung         `<section>Bài viết</section>`

  `<article>`       Bài viết độc lập         `<article>Bài viết</article>`

  `<nav>`           Menu điều hướng          `<nav>...</nav>`

  `<main>`          Nội dung chính           `<main>...</main>`
  --------------------------------------------------------------------------

------------------------------------------------------------------------

## 🎬 9. Media

  ---------------------------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ --------------------------------------------
  `<video>`         Phát video               `<video controls src="video.mp4"></video>`

  `<audio>`         Phát âm thanh            `<audio controls src="music.mp3"></audio>`
  ---------------------------------------------------------------------------------------

------------------------------------------------------------------------

## ⚙️ 10. Script và Style

  ---------------------------------------------------------------------------------------
  Thẻ               Mô tả                    Ví dụ
  ----------------- ------------------------ --------------------------------------------
  `<script>`        Thêm mã JavaScript       `<script>console.log('Hi')</script>`

  `<link>`          Liên kết file CSS ngoài  `<link rel="stylesheet" href="style.css">`

  `<style>`         Viết CSS trực tiếp       `<style>p {color: red}</style>`
  ---------------------------------------------------------------------------------------

------------------------------------------------------------------------

## ✅ Tổng kết

Khi học HTML, bạn nên tập trung trước vào: 1. Cấu trúc trang (`html`,
`head`, `body`)\
2. Văn bản (`h1`, `p`, `b`, `i`, `a`)\
3. Ảnh và liên kết (`img`, `a`)\
4. Bố cục (`div`, `span`)\
5. Danh sách và bảng (`ul`, `ol`, `table`)\
6. Form (`input`, `button`, `form`)

Sau đó kết hợp CSS để làm đẹp và React để tái sử dụng các thành phần
này.
