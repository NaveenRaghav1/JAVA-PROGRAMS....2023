package keyword;
// with the help of default constructor this keyword....

class C3 {

    C3() {
        System.out.println("naveen raghav");

    }

    C3(int a) {
        this();
        System.out.println(a);
    }

    public static void main(String[] args) {
        C3 r = new C3(100);
    }
}
