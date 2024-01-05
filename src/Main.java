import Exem.First;
import Exem.ImmutableClass;
import Exem.LRUCache;

public class Main {
    public static void main(String[] args) {
        LRUCache obj=new LRUCache(5);
        obj.put(5,5);
        obj.put(4,5);
        obj.put(3,5);
        obj.put(2,5);
        obj.put(1,5);
        obj.put(1,9);
        System.out.println(obj.get(1));
    }
}