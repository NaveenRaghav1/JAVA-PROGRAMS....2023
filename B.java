class B {
    B() {
        this(10);
    }

    B(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        B r = new B();
    }

}
