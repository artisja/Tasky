package com.example.artisja.tasky;

import android.content.Context;

import net.danlew.android.joda.JodaTimeAndroid;

import org.joda.time.DateTime;

/**
 * Created by artisja on 4/5/18.
 */

public class Task{

    String taskTitle,taskContent,owner;
    DateTime dateCreated,dueDate;

    public Task(){

    }

    public Task(String taskTitle, String taskContent, String owner, Context context){
        this.taskTitle = taskTitle;
        this.taskContent = taskContent;
        this.owner = owner;
        JodaTimeAndroid.init(context);
        dateCreated = new DateTime();
    }

    //getters
    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public String getOwner() {
        return owner;
    }

    public DateTime getDateCreated() {
        return dateCreated;
    }

    public DateTime getDueDate() {
        return dueDate;
    }

    //mutators
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDateCreated(DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDueDate(DateTime dueDate) {
        this.dueDate = dueDate;
    }
}
