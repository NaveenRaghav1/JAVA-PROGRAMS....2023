public class one {

    private int number;

    public one(int num) {
        number = num;
    }

    public int calculateSquare() {
        return number * number;
    }

    public int calculateCube() {
        return number * number * number;
    }

    public static void main(String[] args) {
        one obj = new one(5);
        int squareResult = obj.calculateSquare();
        int cubeResult = obj.calculateCube();
        System.out.println("Number: " + obj.number);
        System.out.println("Square: " + squareResult);
        System.out.println("Cube: " + cubeResult);
    }
}
