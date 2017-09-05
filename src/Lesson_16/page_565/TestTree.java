package Lesson_16.page_565;

import java.util.TreeSet;

public class TestTree {
    public static void main (String[] args) {
        new TestTree().go();
    }

    public void go () {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        System.out.println("1 : " + tree);
        tree.add(b2);
        System.out.println("2 : " + tree);
        tree.add(b3);
        System.out.println("3 : " + tree);
    }

}
