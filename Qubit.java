
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Qubit {
    private QuantumSystem quantumSystem;
    private ComplexNumber alpha; // Represents the probability amplitude of |0> state
    private ComplexNumber beta; // Represents the probability amplitude of |1> state

    public Qubit(QuantumSystem system) {
        this.quantumSystem = system;

        // Initialize with equal probabilities for |0> and |1> states
        this.alpha = new ComplexNumber(1, 0).normalize();
        this.beta = new ComplexNumber(0, 0);
    }

    // Add getters and setters as necessary for the amplitudes list
    // Also include any methods required for the functionality of your Qubit class

    public void measure() {
        double probability = ThreadLocalRandom.current().nextDouble(0, 1);
        if (probability < Math.pow(alpha.magnitude(), 2)) {
            // Collapse to |0> state
            alpha = new ComplexNumber(1, 0);
            beta = new ComplexNumber(0, 0);
            System.out.println("Collapse to |0> state");
        } else {
            // Collapse to |1> state
            System.out.println("Collapse to |1> state");
            alpha = new ComplexNumber(0, 0);
            beta = new ComplexNumber(1, 0);
        }
    }

    @Override
    public String toString() {
        return "|0>: " + alpha.toString() + ", |1>: " + beta.toString();
    }
} 