import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final NumberProcessor processor;

    public RandomNumberGenerator(NumberProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            // Generate a random integer between 0 and 99
            int number = random.nextInt(100);
            System.out.println("Generated number: " + number);
            processor.processNumber(number);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class NumberProcessor extends Thread {
    private int number;

    public void processNumber(int number) {
        this.number = number;
        // Process the number: print square if even, cube if odd
        if (number % 2 == 0) {
            System.out.println("Square of " + number + " is " + (number * number));
        } else {
            System.out.println("Cube of " + number + " is " + (number * number * number));
        }
    }
}

public class MultiThreadedRandomNumber {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor(); // Create the processor
        processor.start(); // Start the number processor thread

        RandomNumberGenerator generator = new RandomNumberGenerator(processor);
        generator.start(); // Start the random number generator thread
    }
}
