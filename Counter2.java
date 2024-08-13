public class Counter2 extends Counter{
    private int count;
    public Counter2() {
        this.count = 0;
    }
    public void incr() {
        count *= 2;
    }
}
