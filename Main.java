
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        // Create a QuantumSystem object
        QuantumSystem quantumSystem = new QuantumSystem();

        // Create a Qubit object associated with the QuantumSystem object
        Qubit qubit = new Qubit(quantumSystem);


        qubit.measure();
        System.out.println(qubit.toString());

        // Create a LinuxX64SystemAdapter object associated with the QuantumSystem object
        LinuxX64SystemAdapter systemAdapter = new LinuxX64SystemAdapter(quantumSystem);

        // Create an EntanglementOperation object associated with the QuantumSystem and Qubit objects
        EntanglementOperation entanglementOperation = new EntanglementOperation(quantumSystem, qubit);

        // Use the LinuxX64SystemAdapter object to perform entanglement operation on the Qubit object
        systemAdapter.entangleQubitWithExistingOne();
    }
} 