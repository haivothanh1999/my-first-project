package LinkedList;

import java.util.List;
import java.util.LinkedList;

public class DemoLinkedList {
 
     public static void main(String[] args) {
 // Tạo một đối tượng LinkedList.
    List<String> list = new LinkedList<>();
    list.add("F");
    list.add("B");
    list.add("D");
    list.add("E");
    list.add("C");
    System.out.println(list);
  // Chèn thêm phân từ vào list ở vị trí 1
    list.add(1, "A2");
    System.out.println(list);
   // Loại bỏ 1 phần tử của danh sách
    list.remove("F");
    System.out.println(list);
    // Loại bỏ phần tử tại vị trí số 2 
    list.remove(2);
    System.out.println(list);
    String str =list.get(2);
    list.set(2, "K");	
    System.out.println(list);
 }
 
}