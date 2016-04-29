/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationschedulingsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Subham Guha(sjg5441)
 */
public class Course implements Serializable {
    
    private String courseName;
    private String courseTime;
    private Room room;
    private ArrayList<Student> studentList;
    private String roomId;
    
    public Course(String c, String ct)
    {
        this.courseName = c;
        this.courseTime = ct;
    
    }
    
    public Course(String cn, String ctime, Room r, ArrayList<Student> s)
    {
            this.courseName = cn;
            this.courseTime = ctime;
            this.room = r;
            this.studentList = s;
    }

    public Course(String text) {
        this.roomId = text;
    }

    public Course(String name, String time, String roomId)
    {
        this.courseName = name;
        this.courseTime = time;
        this.roomId = roomId;
    }
 
    
    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseTime
     */
    public String getCourseTime() {
        return courseTime;
    }

    /**
     * @param courseTime the courseTime to set
     */
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * @return the studentList
     */
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    /**
     * @param studentList the studentList to set
     */
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public String toString()
    {
        return "Course Name " + courseName + "\n Time " + courseTime;
    }
           // returns the full name of selected person
    public String getFullName(int i){
        String fName =  studentList.get(i).getFirstName();
        String lName = studentList.get(i).getLastName();
        String pNumber = studentList.get(i).getPhoneNumber();
        return fName + " " + lName + " " + pNumber;
    }
    public int getStudentSize()
    {
        return studentList.size();
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    
    public String seeCourse()
    {
        return getCourseName();
    }
}
