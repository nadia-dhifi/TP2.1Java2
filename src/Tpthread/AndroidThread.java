package Tpthread;
import java.io.FileWriter;
import java.io.IOException;

class AndroidThread extends Thread {
    private FileWriter fileWriter;

    public AndroidThread(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() {
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

class PythonThread extends Thread {
    private FileWriter fileWriter;

    public PythonThread(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() {
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
