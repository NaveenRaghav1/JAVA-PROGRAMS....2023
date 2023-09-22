
public class DemoString {
    public static void main(String[] args) {
        String str = "!@abcd$%::efg*";
        str = str.replaceAll("[^a-z A-Z 0-9]", "");
        System.out.println(str);
    }
}