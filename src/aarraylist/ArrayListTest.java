package aarraylist;

import student.Student;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayListSelf arrayListSelf = new ArrayListSelf();
        Student student1 = new Student(1, "Thuy", "nguyenthuy123@gmail.com", 8.0);
        Student student2 = new Student(2, "Mai", "nguyenmaix123@gmail.com", 5.0);
        Student student3 = new Student(3, "Thanh", "nguyenThanh123@gmail.com", 9.0);
        Student student4 = new Student(4, "Hai", "nguyenhai926@gmail.com", 7.0);
        Student student5 = new Student(5, "Huong", "nguyenHuong123@gmail.com", 10.0);
        Student student6 = new Student(6, "Duy", "nguyenduy321@gmail.com", 6.0);
        arrayListSelf.add(student1);
        arrayListSelf.add(student2);
        arrayListSelf.add(student3);
        arrayListSelf.add(student4);
        arrayListSelf.add(student5);
        arrayListSelf.add(student6);

        arrayListSelf.readList();
        arrayListSelf.remove(3);
        arrayListSelf.readList();

        arrayListSelf.readList(8.0);
    }
}
