# Strategy Pattern

- Mục đích của mẫu chiến lược là `tách rời phần xử lý một chức năng` cụ thể ra khỏi `đối tượng` của bạn. Sau đó tạo ra một `tập hợp các thuật toán` để xử lý chức năng đó và `lựa chọn thuật toán` nào mà bạn thấy đúng đắn nhất khi thực thi chương trình. Mẫu thiết kế này thường được sử dụng để `thay thế cho sự kế thừa`, khi bạn muốn `chấm dứt việc theo dõi và chỉnh sửa một chức năng qua nhiều lớp con.`

- Trong source code GoAlgorithm là 1 interface để `khai báo các chức năng` của đối tượng Vehicle các `chức năng của mỗi loại đối tượng` FormulaOne, Jet, Helicopter, StreetRacer được `định nghĩa` trong các lớp GoByFlying, GoByFlyingFast... và Vehicle là 1 abstract để `quản lý các chức năng` (nó là 1 abstract vì nó gọi goAlgorithm.go() của interface). Và main sẽ `quyết định thuật toán nào sẽ được sử dụng cho mỗi loại đối tượng Vehicle`.
