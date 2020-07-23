package com.example.promotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the statue bar background to transparent

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //setup recycleview with the adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.promotion1,"First time customer gets 10% off!"));
        mlist.add(new item(R.drawable.promotion2,"20% off for celebrating our 10th year anniversary!"));
        Adapter adapter = new Adapter(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}