public class Main {
    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        for (int i = 1; i <= 10; i++) {
            streamExample.addNumber(i);
        }
        System.out.println(streamExample.sumEvenNumbers());
        streamExample.doubleAll();
        System.out.println();
        System.out.println(streamExample.findMax());
        streamExample.getAllUnevenNumbers();
        System.out.println();
        System.out.println(streamExample.getAverage());
    }
}