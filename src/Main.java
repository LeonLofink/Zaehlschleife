public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++){
            System.out.println("Wert von i: " + i);
            if(i == 3){
                System.out.println("Holdriho!");
            }
        }
        printSomeNumbers();
        printNumbers(10,20);
        System.out.println(sumUp(1,10));
        powerOfTwo(3);
        System.out.println(powerOfTwo(3));
        sumUpPowerOfTwo(3);
        System.out.println(sumUpPowerOfTwo(3));
        rectangleStars(10, 5);
        System.out.println();
        rectangleStarsSafe(10, 5);
        System.out.println();
        rectangleStarsSafe(0, 5); // Sollte keine Ausgabe erzeugen
        System.out.println();
        triangleStars(5);
    }

    public static void printSomeNumbers(){
        for (int i = 6; i <= 23; i++) {
            System.out.println("Wert von i: " + i);
        }
    }
    public static void printNumbers(int start, int end){
        for (int j = start; j <= end; j++) {
            System.out.println("Wert von j: " + j);
        }
    }
    public static int sumUp(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i = i + 1) {
            sum = sum + i;
        }
        return sum;
    }
    public static int powerOfTwo(int exp){
        int b = 1;
        for (int i = 1; i <= exp; i = i + 1){
            b = b*2;
        }
        return b;
    }
    public static int sumUpPowerOfTwo(int n) {
        int sum = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            sum = sum + b;
            b = b*2;
        }
        return sum;
    }
    public static void rectangleStars(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rectangleStarsSafe(int width, int height) {
        if (width > 0 && height > 0) {
            rectangleStars(width, height);
        } else {
            System.out.println("Fehler: Breite und Höhe müssen größer als 0 sein!");
        }
    }
    public static void triangleStars(int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
