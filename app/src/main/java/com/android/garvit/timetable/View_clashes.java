package com.android.garvit.timetable;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class View_clashes extends AppCompatActivity {
    private Context context;
    List<Clash> ClashList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_clashes);

        RecyclerView recyclerView = findViewById(R.id.clash_cycle);
        ClashList = new ArrayList<>();


        //basic settings to run recycle view
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //sample data again
        ClashList.add(new Clash("Math","Science" ));
        ClashList.add(new Clash("Madfsfth","Scfeqience" ));
        ClashList.add(new Clash("Mat3r2h","Scienfs3rce" ));
        ClashList.add(new Clash("Matdfh","Scienfawce" ));
        ClashList.add(new Clash("Mat3qfh","Scifqaence" ));

        ClashAdapter adapter = new ClashAdapter(this, ClashList);
        recyclerView.setAdapter(adapter);

    }
}
