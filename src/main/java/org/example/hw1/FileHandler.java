package org.example.hw1;
// FileHandler.java

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileHandler implements GenealogyTree.DataIO {

    @Override
    public void writeData(Person person, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person readData(String filename) {
        return null;
    }
}