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
public class Student implements Serializable {
  
    private String firstName;
    private String lastName;
    private String phoneNumber;
    ArrayList<Course> courses = new ArrayList<Course>(8);
    public Student(String f, String l, String p)
    {
        this.firstName = f;
        this.lastName = l;
        this.phoneNumber = p;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   public String getFullName()
   {
       String first = getFirstName();
       String last = getLastName();
       String phone = getPhoneNumber();
      return  first + " " + last + " " + phone;
   } 
    public String toString()
    {
        return firstName + " " + lastName + " " + phoneNumber;
    }

}

