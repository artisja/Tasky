package com.example.artisja.tasky;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by artisja on 5/28/18.
 */

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {
    public ArrayList<Task> taskArrayList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView taskTitle,taskContent;

        public ViewHolder(View itemView) {
            super(itemView);
            taskTitle = itemView.findViewById(R.id.recycler_title_view);
            taskContent = itemView.findViewById(R.id.recycler_content_view);
        }
    }

    public TaskAdapter(ArrayList<Task> taskList){
        this.taskArrayList = taskList;
    }

    @NonNull
    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_content, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.ViewHolder holder, int position) {
        Task currTask = taskArrayList.get(position);
        holder.taskTitle.setText(currTask.getTaskTitle());
        if(currTask.taskContent.length()>12){
            holder.taskContent.setText(currTask.getTaskContent().substring(0,27) + "...");
        }else {
            holder.taskContent.setText(currTask.getTaskContent());
        }
    }


    @Override
    public int getItemCount() {
        return taskArrayList.size();
    }
}
