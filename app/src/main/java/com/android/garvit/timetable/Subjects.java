package com.android.garvit.timetable;

import java.io.Serializable;

public class Subjects implements Serializable{
    private String Name;
    private String Room;
    private String Prof;
    private String Color;

    public Subjects(String name, String room, String prof, String color) {
        Name = name;
        Room = room;
        Prof = prof;
        Color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public String getProf() {
        return Prof;
    }

    public void setProf(String prof) {
        Prof = prof;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
