package Lesson_16.page_565;

class Book implements Comparable<Book> {
    String title;
    public Book (String t) {
        title = t;
    }

    // if we remove it, b1 will be added with no probs but when b2 comes a ClassCastException will pop
    @Override
    public int compareTo(Book b) {
        return title.compareTo(b.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
