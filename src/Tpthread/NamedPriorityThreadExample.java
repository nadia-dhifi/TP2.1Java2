package Tpthread;

import java.io.FileWriter;
import java.io.IOException;

public class NamedPriorityThreadExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            AndroidRunnable androidRunnable = new AndroidRunnable(fileWriter);
            PythonRunnable pythonRunnable = new PythonRunnable(fileWriter);

            Thread androidThread = new Thread(androidRunnable);
            Thread pythonThread = new Thread(pythonRunnable);

            androidThread.start();
            pythonThread.start();

            androidThread.join(); // Attend la fin du thread Android
            pythonThread.join();  // Attend la fin du thread Python
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
