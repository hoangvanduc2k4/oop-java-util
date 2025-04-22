package oop.java.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HoangDuc
 */
public class OopJavaUtilTest {
    
    private Calculator factorialCalculator;
    private Calculator sumCalculator;

    // Khởi tạo các đối tượng calculator trước mỗi test case
    @Before
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
        sumCalculator = new SumCalculator();
    }

    // Phương thức tearDown không cần thiết cho ví dụ này, nhưng có thể dùng để giải phóng tài nguyên
    @After
    public void tearDown() {
    }

    // Kiểm thử FactorialCalculator
    @Test
    public void testFactorialCalculator() {
        // Kiểm thử với n = 0 (giai thừa của 0 phải là 1)
        assertEquals(1, factorialCalculator.compute(0));
        
        // Kiểm thử với n = 5 (giai thừa của 5 là 120)
        assertEquals(120, factorialCalculator.compute(5));

        // Kiểm thử với n = 10 (giai thừa của 10 là 3628800)
        assertEquals(3628800, factorialCalculator.compute(10));
    }

    // Kiểm thử SumCalculator
    @Test
    public void testSumCalculator() {
        // Kiểm thử với n = 0 (tổng từ 1 đến 0 phải là 0)
        assertEquals(0, sumCalculator.compute(0));

        // Kiểm thử với n = 5 (tổng từ 1 đến 5 là 15)
        assertEquals(15, sumCalculator.compute(5));

        // Kiểm thử với n = 10 (tổng từ 1 đến 10 là 55)
        assertEquals(55, sumCalculator.compute(10));
    }

    // Kiểm thử main method với lựa chọn tính giai thừa
    @Test
    public void testMainMethodFactorial() {
        // Kiểm thử khi người dùng chọn tính giai thừa và nhập 5
        // Mock input cho System.in để thử case này
        System.setIn(new java.io.ByteArrayInputStream("1\n5\n".getBytes())); // Chọn giai thừa và nhập 5
        OopJavaUtil.main(new String[]{});

        // Kiểm tra kết quả in ra (có thể sử dụng System.setOut để kiểm tra kết quả nếu cần)
        // Trong trường hợp này, chúng ta chỉ cần kiểm tra xem chương trình có chạy thành công mà không có lỗi
        // Vì main method không trả về giá trị mà chỉ in ra màn hình, có thể kiểm tra output thông qua System.setOut
    }

    // Kiểm thử main method với lựa chọn tính tổng
    @Test
    public void testMainMethodSum() {
        // Kiểm thử khi người dùng chọn tính tổng và nhập 5
        // Mock input cho System.in để thử case này
        System.setIn(new java.io.ByteArrayInputStream("2\n5\n".getBytes())); // Chọn tổng và nhập 5
        OopJavaUtil.main(new String[]{});

        // Kiểm tra kết quả in ra (có thể sử dụng System.setOut để kiểm tra kết quả nếu cần)
        // Cũng như trường hợp giai thừa, chúng ta không thể kiểm tra trực tiếp giá trị trả về từ main method
    }

    // Kiểm thử main method khi nhập lựa chọn không hợp lệ
    @Test
    public void testMainMethodInvalidChoice() {
        // Kiểm thử khi người dùng nhập một lựa chọn không hợp lệ (ví dụ nhập số 3)
        System.setIn(new java.io.ByteArrayInputStream("3\n5\n".getBytes())); // Chọn không hợp lệ và nhập 5
        OopJavaUtil.main(new String[]{});
        // Chương trình sẽ in thông báo "Lựa chọn không hợp lệ."
        // Chúng ta có thể kiểm tra thông báo này qua System.setOut (nếu cần)
    }
}
