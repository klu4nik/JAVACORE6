package main.java.com.andrii.practice.module03.task033;

import java.util.Date;

/**
 * Created by Klu4nik on 04/03/2017.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;


    public Course(Date startDate, String name){
        this.startDate=startDate;
        this.name=name;
    }

    public Course(int hourseDuration, String name, String teacherName){
        this.name=name;
        this.hoursDuration=hourseDuration;
        this.teacherName=teacherName;
    }

    public Date getStartDate(){
        return startDate;
    }
    public String getName(){
        return name;
    }
    public int getHoursDuration(){
        return hoursDuration;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setStartDate(Date startDate){
         this.startDate=startDate;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setHoursDuration(int hoursDuration){
        this.hoursDuration=hoursDuration;
    }
    public  void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
}
