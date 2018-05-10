package com.android.garvit.timetable;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Read_write {

    private Context context;

    public Read_write(Context context) {
        this.context = context;
    }

    void write(Subjects subjects){
        String filename = "Timetable.txt";
        File file = new File(context.getFilesDir(), filename);
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(subjects);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void empty_file() {
        String filename = "Timetable.txt";
        try {
            new FileOutputStream(filename).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void write_list(List<Subjects> subjectList){
        String filename = "Timetable.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Subjects S : subjectList){
            oos.writeObject(S);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    List<Subjects> read() {
        String filename = "Timetable.txt";
        List<Subjects> SubjectList = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            SubjectList = (List<Subjects>) ois.readObject();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SubjectList;
    }
}
