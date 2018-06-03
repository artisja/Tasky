package com.example.artisja.tasky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    Button addTaskButton;
    ArrayList<Task> userTaskList;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testData();
        recyclerView = findViewById(R.id.task_recycler_view);
        adapter = new TaskAdapter(userTaskList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        addTaskButton = findViewById(R.id.add_task_button);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AddTaskActivity.class);
                startActivity(intent);
            }
        });
    }

    private void testData() {
        userTaskList = new ArrayList<Task>();
        Task test = new Task();
        test.setTaskTitle("Obito Uchiha");
        test.setTaskContent(getResources().getString(R.string.test_content));
        Task test2 = new Task();
        test2.setTaskTitle("Rin Nohara");
        test2.setTaskContent(getResources().getString(R.string.test_content_two));
        Task test3 = new Task();
        test3.setTaskTitle("Kakashi Hatake");
        test3.setTaskContent(getResources().getString(R.string.test_content_three));

        userTaskList.add(test);
        userTaskList.add(test2);
        userTaskList.add(test3);
    }
}
