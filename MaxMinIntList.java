import java.util.ArrayList;

/**
 * program to find min and max of a list
 */
public class MaxMinIntList extends ArrayList {

    /**
     *
     * @effects
     *  return the smallest element of the list
     */
    public Integer min() {
       if (this.repOk()){
        int t = (int) this.get(0);
        for (int i = 1; i < this.size(); i++){
            if (t > (int) this.get(i)){
                t = (int) this.get(i);
            }
        }
        return t;
        }
       return null;
    }
    /**
     *
     * @effects
     *  return the largest element of the list
     */
    public Integer max(){
        if (this.repOk()){
        int t = (int) this.get(0);
        for (int i = 1; i< this.size(); i++){
            if (t < (int) this.get(i)){
                t = (int) this.get(i);
            }
        }
        return t;
    }
        return null;
    }

    /**
     *
     * @effects check list not null
     */
    public boolean repOk(){
        return this.size() != 0;
    }
}
