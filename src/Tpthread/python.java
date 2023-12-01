package Tpthread;

import java.io.FileWriter;
import java.io.IOException;

public class python {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("D:\\LSI3\\JAVA2\\TP21Java2\\src\\Tpthread\\output.txt")) {
            AndroidThread androidThread = new AndroidThread(fileWriter);
            PythonThread pythonThread = new PythonThread(fileWriter);

            androidThread.start();
            pythonThread.start();

            androidThread.join(); // Attend la fin du thread Android
            pythonThread.join();  // Attend la fin du thread Python
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        }
    }


