package ejercicio5_fizzbuzz;

/**
 *
 * @author greivin
 */
public class Ejercicio5_FizzBuzz {

    public static void main(String[] args) {
        
        byte min = 1;
        byte max = 50;

        for (byte n = min; n <= max; n++) {

            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz!");   
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(n);
            }
        }
    }
}
