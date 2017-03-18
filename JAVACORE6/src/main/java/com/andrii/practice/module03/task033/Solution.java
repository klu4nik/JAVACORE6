package main.java.com.andrii.practice.module03.task033;

import java.util.Date;

/**
 * Created by Klu4nik on 04/03/2017.
 */
public class Solution {
    Date date=new Date();
    Course course1= new Course(date,"First");
    Course course2= new Course(date,"Second" );
    Course course3= new Course(3,"third","teacher");
    Course course4= new Course(4,"fourth","teacher");
    Course course5= new Course(date,"Fifth");

    Course[] cources;
    Student student1= new Student("first",cources);
    Student student2= new Student("second","case",1);

    CollegeStudent collegeStudent1= new CollegeStudent("first",cources);
    CollegeStudent collegeStudent2= new CollegeStudent("second","case",1);
    CollegeStudent collegeStudent3= new CollegeStudent("third","case",1,cources,1,"college",1,);

    SpecialStudent collegeStudent1= new SpecialStudent("first",cources);
    SpecialStudent collegeStudent2= new SpecialStudent("second","case",1);
    SpecialStudent collegeStudent1= new SpecialStudent(3);


}
