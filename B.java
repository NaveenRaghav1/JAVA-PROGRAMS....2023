package constructor;
//in this program we saw how a constructor work in java

//import keyword.A;

class B {

    public static void main(String[] args) {
        A res = new A();
        res.show();
    }
}

class A {
    int a;
    String name;

    /*
     * A() {
     * a = 10;
     * name = "naveen";
     * }
     * /*
     */
    void show() {
        System.out.println(a + " " + name);
    }
}

/**
 * constructor
 */
