# Hướng dẫn cài đặt chương trình

## Yêu cầu

- Cài đặt Java JDK 20
- SQL Server
- NetBeans IDE 8.2 trở lên

## Các bước cài đặt

1. Clone hoặc tải xuống repo từ GitHub.
2. Mở và chạy file `?.sql` trong thư mục SQL Server.
3. Mở project bằng NetBeans IDE và thêm các thư viện (file JAR) từ thư mục lib vào project.
4. Thay đổi CODE, USERNAME và PASSWORD để kết nối với SQL SERVER trong `src\Connect\JDBCConnection` và đường dẫn lưu file Excel trong `src\Constant\InOutFileAttr`

## Chạy chương trình
1. Màn hình đăng nhập được hiển thị (chạy file `Đăng nhập`).
2. Đăng nhập với tài khoản mặc định:
    **Tài khoản Admin**
   ```
        Tài khoản: yenthan2004
        Mật khẩu: 123456
    ```
    
### Chức năng quản lý (Đăng nhập với admin)
- Đăng xuất / Thoát
- Quản lý nhân viên:
  - Xem
  - Thêm
  - Sửa
  - Xóa
  - Tìm kiếm nhân viên theo tên
- Quản lý tài khoản
  - Xem
  - Thêm
  - Sửa
  - Xóa
  - Sắp xếp theo tên
- Thống kê doanh số
  - Xem
  - Thống kê theo ngày
  - Sắp xếp theo thành tiền
  - Xuất báo cáo ra file Excel

### Chức năng nhân viên (đăng nhập với user)

- Đăng nhập/đăng xuất
- Quản lý sản phẩm:
  - Thêm sản phẩm
  - Sửa sản phẩm
  - Xóa sản phẩm
  - Tìm kiếm sản phẩm theo thên
- Quản lý hóa đơn
    - Xóa hóa đơn
    - Tìm kiếm theo mã
    - Sắp xếp theo ngày
- Thêm hóa đơn
    - Thêm hàng
    - Xóa hàng
    - Sắp xếp theo giá