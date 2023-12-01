package Tpthread; 
import java.io.FileWriter;
import java.io.IOException;

class AndroidRunnable implements Runnable {
    private FileWriter fileWriter;

    public AndroidRunnable(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Android Thread"); // Attribuer un nom au thread Android
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // Définir la priorité maximale

        try {
            for (int i = 0; i < 10; i++) {
                fileWriter.write("I love Android\n");
                fileWriter.flush();
                Thread.sleep(1000); // Attendez 1 seconde entre chaque itération
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PythonRunnable implements Runnable {
    private FileWriter fileWriter;

    public PythonRunnable(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Python Thread"); // Attribuer un nom au thread Python
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // Définir la priorité minimale

        try {
            for (int i = 0; i < 10; i++) {
                fileWriter.write("I love Python\n");
                fileWriter.flush();
                Thread.sleep(1000); // Attendez 1 seconde entre chaque itération
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

