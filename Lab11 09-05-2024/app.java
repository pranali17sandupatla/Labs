package com.demo.OneToMany_Bidirectional;

import Dao.CourseDao;
import Dao.InstructorDao;
import Entity.Course;
import Entity.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	InstructorDao instructordao=new InstructorDao();
    	CourseDao coursedao=new CourseDao();
    	Instructor instructor=new Instructor("Pranali","Sandupatla","sandupatlapranali2001@gmail.com");
    	instructordao.saveInstructor(instructor);
    	Course course1=new Course("F.Y.BE",instructor);
    	coursedao.saveCourse(course1);
    	Course course2=new Course("S.Y.BE",instructor);
    	coursedao.saveCourse(course2);
    	Course course3=new Course("T.Y.BE",instructor);
    	coursedao.saveCourse(course3);
    	
    	
    	instructor=instructordao.getInstructor(1);
        System.out.println("Instructor ID:"+instructor.getId()+" "+"Instructor FirstName:"+instructor.getFirstName()+" "+"Instructor LastName:"+instructor.getLastName()+"Instructor email:"+instructor.getEmail());
        
        
   }
    } 	
    

