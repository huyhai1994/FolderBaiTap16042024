package queue;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Hien thi danh sach  : ");
            System.out.println("2. Khach Hang Tiep Theo: ");
            System.out.println("3. Dang kham benh      : ");
            System.out.println("4. Thoat                : ");

            String value = scanner.nextLine();
            switch (value) {
                case "1":
                    queue.showList();
                    break;
                case "2":
                    queue.peek();
                case "3":
                    System.out.println("Dang kham custommer: " + queue.dequeue());
            }
        }
    }
}
