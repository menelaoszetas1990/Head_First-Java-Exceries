package Lesson_16.page_554;

public class Mountain {
    String name;
    int height;

    Mountain (String n, int h) {
        name = n;
        height = h;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
