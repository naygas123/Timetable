package com.android.garvit.timetable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class View_subjects extends AppCompatActivity {

//    private Toolbar toolbar = (Toolbar) findViewById(R.id.sub_toolbar);
//    private FloatingActionButton add = (FloatingActionButton) findViewById(R.id.sub_fab);
////    private CircleLetterView CLview = (CircleLetterView) findViewById(R.id.letter_subject_image);
////    private TextView Sname = (TextView) findViewById(R.id.subject_text);
////    private TextView Sinfo = (TextView) findViewById(R.id.subject_info_text);
////    private Button edit = (Button) findViewById(R.id.edit_b);
////    private Button delete = (Button) findViewById(R.id.delete_b);
//    private RecyclerView recyclerView = (RecyclerView) findViewById(R.id.subject_cycle);
//    List<Subjects> SubjectList = new ArrayList<>();
//    private android.support.v7.widget.Toolbar toolbar;
    private FloatingActionButton add;
    private RecyclerView recyclerView;
    private Context context;
    List<Subjects> SubjectList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_subjects);
        //setting back to home button
        inittoolbar();
//        String filename = "Timetable.txt";
//        context  = context.getApplicationContext();
//        File file = new File(context.getFilesDir(), filename);

//        toolbar = findViewById(R.id.sub_toolbar);
        add =  findViewById(R.id.sub_fab);
        recyclerView =  findViewById(R.id.subject_cycle);
        SubjectList = new ArrayList<>();


        //basic settings to run recycle view
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // adding data to SubjectList
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(View_subjects.this, Add_subjects.class);
                startActivity(intent);
            }
        });
        // sample add for now
        SubjectList.add(new Subjects("Math","105","Raj", "Red"));
        SubjectList.add(new Subjects("Msh","105","Raj", "Red"));
        SubjectList.add(new Subjects("Mswath","105","Raj", "Red"));
        SubjectList.add(new Subjects("Mawdwwdth","105","Raj", "Red"));
        SubjectList.add(new Subjects("Ma2eth","105","Raj", "Red"));
        SubjectList.add(new Subjects("Mdath","105","Raj", "Red"));
        SubjectList.add(new Subjects("Mawwdth","105","Raj", "Red"));


        // using adapter to put values in cardview
        SubjectAdapter adapter = new SubjectAdapter(this, SubjectList);
        //putting the cardview holder in recycle view
        recyclerView.setAdapter(adapter);

    }

    private void inittoolbar(){
//        toolbar = (Toolbar) findViewById(R.id.sub_toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

    }
//
//    void write(Subjects subjects){
//        String filename = "Timetable.txt";
//
//        try {
//            FileOutputStream fos = new FileOutputStream(filename);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(subjects);
//            oos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    List<Subjects> read() {
//        String filename = "Timetable.txt";
//        List<Subjects> SubjectList = null;
//        try {
//            FileInputStream fis = new FileInputStream(filename);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            SubjectList = (List<Subjects>) ois.readObject();
//            ois.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return SubjectList;
//    }


}
