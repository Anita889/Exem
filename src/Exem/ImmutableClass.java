package Exem;

public class ImmutableClass {
    private int a;
    private First obj;

    public ImmutableClass(int a, First obj) {
        this.a = a;
        this.obj = obj;
    }
    public int getA(){
        return a;
    }
    public First getObj(){
        return new First(obj.getA());
    }

    public void setA(int a) {
    }
    public void setObj(First obj){
    }
}
