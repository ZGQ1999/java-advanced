package list;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "《百年孤独》", 12.0));
        bookList.add(new Book(2, "《呼啸山庄》", 40.0));
        bookList.add(new Book(3, "《假面山庄》", 56.9));
        bookList.add(new Book(4, "《白夜行》", 16.5));
        System.out.println("" + bookList + "   ");
        bookList.remove(2);
        System.out.println(bookList);
        bookList.add(new Book(1, "《放学后》", 15.0));
        System.out.println(bookList);
        System.out.println(bookList.indexOf("《放学后》"));
        System.out.println(bookList.lastIndexOf("《放学后》"));
    }
}