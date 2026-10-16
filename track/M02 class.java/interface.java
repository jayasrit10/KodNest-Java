
interface Shape {

    public abstract void input();

    public abstract void disp();
}

class Square implements java.awt.Shape {

    @Override
    public void input() {
        System.ojut.println("Input");
    }

    @Override
    public void disp() {
        System.out.println("disp");
    }
}

public class Main1 {

    public static void main(String arg[]) {
        Square s = new Square();
        s.input();
        s.disp();
    }
}
