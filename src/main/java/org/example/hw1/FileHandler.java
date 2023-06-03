package org.example.hw1;
// FileHandler.java
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileHandler implements Reader, Writer {

    @Override
    public void writeData(Person person, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person readData(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}