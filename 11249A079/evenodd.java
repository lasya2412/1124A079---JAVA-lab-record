public class EvenOdd {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }

            i++;
        }
    }
}
