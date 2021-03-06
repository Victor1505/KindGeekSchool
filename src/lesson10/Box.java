package lesson10;

public class Box <T, P> {

    private T object1;
    private P object2;

    public Box(T object1, P object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public P getObject2() {
        return object2;
    }

    public void setObject2(P object2) {
        this.object2 = object2;
    }
}
