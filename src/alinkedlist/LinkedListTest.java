package alinkedlist;

import student.Student;

public class LinkedListTest {
    public static void main(String[] args) {


        Student student1 = new Student(1,"Thuy","nguyenthuy123@gmail.com",8.0);
        Student student2 = new Student(2,"Mai","nguyenmaix123@gmail.com",5.0);
        Student student3 = new Student(3,"Thanh","nguyenThanh123@gmail.com",9.0);
        Student student4 = new Student(4,"Hai","nguyenhai926@gmail.com",7.0);
        Student student5 = new Student(5,"Huong","nguyenHuong123@gmail.com",10.0);
        Student student6 = new Student(6,"Duy","nguyenduy321@gmail.com",6.0);

        LinkedListSelf studentManagerList = new LinkedListSelf();
        studentManagerList.insertFirst(student1);
        studentManagerList.insertFirst(student2);
        studentManagerList.insertFirst(student3);
        studentManagerList.insertFirst(student4);
        studentManagerList.insertFirst(student5);
        studentManagerList.insertFirst(student6);
        studentManagerList.displayAll();

        System.out.println(studentManagerList.searchAnNodeInfoInLinkedList(student1));
    }
}
