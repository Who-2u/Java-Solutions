import java.io.*;
import java.util.*;
class RandomizedSet {
    static LinkedHashSet<Integer> set;

    public RandomizedSet() {
        set = new LinkedHashSet<Integer>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val))
            return false;
        else{
            set.add(val);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        else
            return false;
    }
    
    public int getRandom() {
        Integer[] intArr =set.toArray(new Integer[set.size()]);
		int ran = (int)(Math.random()*set.size());
		return(intArr[ran]);
        
    }
}
public class InsertDelGetrandom{
    public static void main(String[] args){
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.remove(0)); 
        System.out.println(randomizedSet.insert(0));
        System.out.println(randomizedSet.getRandom()); 
        System.out.println(randomizedSet.remove(0)); 
        System.out.println(randomizedSet.insert(0)); 
    }
}
