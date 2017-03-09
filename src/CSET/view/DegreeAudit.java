package CSET.view;

import CSET.controller.CourseUtils;
import CSET.model.CourseData;

import java.util.Scanner;

public class DegreeAudit {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         CourseData courses = new CourseData();
         final int HOURSTOGRADUATE = 128;
         int hoursCompleted = 0 ;
         int coursesTaken = 0;
         int credits;
         String course;
//         String courseType;
//         String courseNumber;
//       //int hrs=   courses.getCreditHours("cset",1100);
//         //hoursCompleted += hrs;

         //Get the amount of classes student has taken
         System.out.println("How many courses have you completed?");
         coursesTaken = input.nextInt();

         // loop upto the amount of courses taken allowing student to enter a course on each iteration
         for(int i = 0; i < coursesTaken;i++){
             System.out.println("Enter a course that you have completed in the form CSET1200  ");
             course = input.next();

             // determine how many credit hours the course entered is worth
            credits = CourseUtils.getCreditHours(course);

             // add that number of credits to the number they have completed
             hoursCompleted += credits;


             // remove completed course from the list of all the courses
             CourseUtils.removeClass(courses,course);


         }

         // print out the number of courses they have left to complete
         System.out.printf("You have %d hours left \n", HOURSTOGRADUATE - hoursCompleted);

         // print out all the courses the student still needs to take
         CourseUtils.printRemainingCourses(courses);
     }
}
