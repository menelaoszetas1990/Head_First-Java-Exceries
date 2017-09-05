package Lesson_15.page_524;

class ThreadOne implements Runnable {
    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int x = 0; x < 98; x++) {
            System.out.println("x = " + x);
            a.updateCounter(1000);
            System.out.println("A = " + a.getCount());
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {}
        }
        System.out.println("one " + a.getCount());
    }
}
