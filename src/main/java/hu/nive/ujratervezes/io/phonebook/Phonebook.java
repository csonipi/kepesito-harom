package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output){
        if(contacts == null || output == null){
            throw new IllegalArgumentException("Null object");
        }
        try{
            FileWriter fileWriter = new FileWriter(output);
            for (Map.Entry entry:contacts.entrySet()) {
                fileWriter.write((String) entry.getKey() + ": " + entry.getValue() + "\n");
            }
            fileWriter.close();
        }catch(IOException e){

        }
    }
}