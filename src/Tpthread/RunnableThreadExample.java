package Tpthread;

import java.io.FileWriter;
import java.io.IOException;

public class RunnableThreadExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("D:\\LSI3\\JAVA2\\TP21Java2\\src\\Tpthread\\output.txt")) {
            AndroidRunnable androidRunnable = new AndroidRunnable(fileWriter);
            PythonRunnable pythonRunnable = new PythonRunnable(fileWriter);

            Thread androidThread = new Thread(androidRunnable);
            Thread pythonThread = new Thread(pythonRunnable);

            androidThread.start();
            pythonThread.start();

            androidThread.join(); // Attend la fin du thread Android
            pythonThread.join();  // Attend la fin du thread Python
        } catch (IOException | InterruptedException e) {
            ((Throwable) e).printStackTrace();
        }
}}