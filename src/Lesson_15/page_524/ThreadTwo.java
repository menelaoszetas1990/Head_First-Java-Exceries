package Lesson_15.page_524;

class ThreadTwo implements Runnable {
    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int y = 0; y < 99; y++) {
            System.out.println("y = " + y);
            a.updateCounter(1);
            System.out.println("B = " + a.getCount());
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {}
        }
        System.out.println("two " + a.getCount());
    }
}
