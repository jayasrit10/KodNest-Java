
class Parent {

    void display1() {
        System.out.println("Inside Parent display1");
    }

    void display2() {
        System.out.println("Inside Parent display2");
    }
}

class Child1 extends Parent {

    @Override
    void display2() {
        System.out.println("Inside Child1 display2");
    }

    void display3() {
        System.out.println("Inside Child1")
    }

77
}
