package oop.java.util;

import java.util.Scanner;

// Định nghĩa một Interface Calculator
interface Calculator {

    long compute(int n);
}

// Cài đặt FactorialCalculator để tính giai thừa
class FactorialCalculator implements Calculator {

    @Override
    public long compute(int n) {
        if (n == 0) {
            return 1;
        }
        return n * compute(n - 1);
    }
}

// Cài đặt SumCalculator để tính tổng các số từ 1 đến n
class SumCalculator implements Calculator {

    @Override
    public long compute(int n) {
        return n * (n + 1) / 2; // Công thức tính tổng từ 1 đến n
    }
}

// Lớp main, chịu trách nhiệm nhập dữ liệu và hiển thị kết quả
public class OopJavaUtil {

    private static void displayResult(Calculator calculator, int n) {
        System.out.println("Kết quả tính toán: " + calculator.compute(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập lựa chọn
        System.out.print("Chọn bài toán (1 - Giai thừa, 2 - Tổng): ");
        int choice = sc.nextInt();

        // Nhập số nguyên
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        Calculator calculator = null;

        switch (choice) {
            case 1:
                calculator = new FactorialCalculator();
                System.out.println(n + "! = ");
                break;
            case 2:
                calculator = new SumCalculator();
                System.out.println("Tổng từ 1 đến " + n + " = ");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }

        // Hiển thị kết quả
        displayResult(calculator, n);
    }
}
