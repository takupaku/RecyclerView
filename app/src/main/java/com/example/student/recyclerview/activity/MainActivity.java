package com.example.student.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import com.example.student.recyclerview.R;
import com.example.student.recyclerview.adapter.rvAdapter;
import com.example.student.recyclerview.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();


    }

    private void loadData() {

        String[] name= getResources().getStringArray(R.array.student);

        String[] edu= getResources().getStringArray(R.array.edu);
         for(int i = 1;i< name.length;i++){
         Student student= new Student(name[i] ,edu[i]);
         studentList.add(student);
     }

        rvAdapter rvAdapters=new rvAdapter(this,studentList);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);//THIS is making the list horizontal
       // GridLayoutManager manager = new GridLayoutManager(this,2);
       // manager.setOrientation(LinearLayoutManager.HORIZONTAL);

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //RANDOM items

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(rvAdapters);
    }

    private void initView() {
        recyclerView=findViewById(R.id.rvId);

    }
}
