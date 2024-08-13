/**
 *  class Counter with variable count and method incr
 *  if method incr is called, the variable count will increase by one
 */
public class Counter {
    public static void main(String[] args) {
        Counter count = new Counter();
        for(int i = 1; i <=100; i++) {
            count.incr();
            System.out.println(count.get());
        }
    }
    private int count;
    /**
     * @requires count > 0
     * @effects Makes this contain 0
     */
    public Counter(){
        this.count = 0;
    }

    /**
     *
     * @effects Returns the value of this
     */
    public int get(){
        return this.count;
    }

    /**
     * @modifies this
     * @effects Increments the value of this by one
     */
    public void incr(){
       this.count++;
    }


}
